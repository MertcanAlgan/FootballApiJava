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
public class MatchLineupTeamA {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long match_lineups_team_a_id;
    private Integer player_id;
    private Integer shirt_number;
    @ManyToOne
    @JoinColumn(name = "match_lineups_id")
    private MatchLineups matchLineups;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_team_a_id", referencedColumnName = "match_lineups_team_a_id")
    private List<PlayerEvents> player_events;

    public MatchLineupTeamA() {
    }
}
