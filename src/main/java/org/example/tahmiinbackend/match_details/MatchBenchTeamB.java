package org.example.tahmiinbackend.match_details;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@Entity
@Table
public class MatchBenchTeamB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_bench_team_b_sequence")
    @SequenceGenerator(name = "match_bench_team_b_sequence", sequenceName = "match_bench_team_b_sequence", allocationSize = 1)
    private Long match_bench_team_b_id;
    private Integer player_in_id;
    private Integer player_in_shirt_number;
    private Integer player_out_id;
    private String player_out_time;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_bench_team_b_id", referencedColumnName = "match_bench_team_b_id")
    private List<PlayerEvents> player_events;

    public MatchBenchTeamB() {
    }

    public MatchBenchTeamB(Long match_bench_team_b_id, Integer player_in_id, Integer player_in_shirt_number, Integer player_out_id, String player_out_time, List<PlayerEvents> player_events) {
        this.match_bench_team_b_id = match_bench_team_b_id;
        this.player_in_id = player_in_id;
        this.player_in_shirt_number = player_in_shirt_number;
        this.player_out_id = player_out_id;
        this.player_out_time = player_out_time;
        this.player_events = player_events;
    }

    public MatchBenchTeamB(Integer player_in_id, Integer player_in_shirt_number, Integer player_out_id, String player_out_time, List<PlayerEvents> player_events) {
        this.player_in_id = player_in_id;
        this.player_in_shirt_number = player_in_shirt_number;
        this.player_out_id = player_out_id;
        this.player_out_time = player_out_time;
        this.player_events = player_events;
    }
}
