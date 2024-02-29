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
public class MatchLineupTeamB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long match_lineups_team_b_id;
    private Integer player_id;
    private Integer shirt_number;
    @ManyToOne
    @JoinColumn(name = "match_lineups_id")
    private MatchLineups matchLineups;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_team_b_id", referencedColumnName = "match_lineups_team_b_id")
    private List<PlayerEvents> player_events;

    public MatchLineupTeamB() {
    }

}
