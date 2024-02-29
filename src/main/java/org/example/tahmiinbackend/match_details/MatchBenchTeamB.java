package org.example.tahmiinbackend.match_details;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@Entity
@Table
public class MatchBenchTeamB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long match_bench_team_b_id;
    private Integer player_in_id;
    private Integer player_in_shirt_number;
    private Integer player_out_id;
    private String player_out_time;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_bench_team_a_id")
    private List<PlayerEvents> player_in_events;

    public MatchBenchTeamB() {
    }

}
