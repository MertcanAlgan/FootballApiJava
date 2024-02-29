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
public class MatchLineups {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long match_lineups_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_id", referencedColumnName = "match_lineups_id")
    private List<MatchLineupTeamA> team_a;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_id", referencedColumnName = "match_lineups_id")
    private List<MatchLineupTeamB> team_b;

    public MatchLineups() {
    }
}
