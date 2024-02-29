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
public class MatchLineups {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_lineups_sequence")
    @SequenceGenerator(name = "match_lineups_sequence", sequenceName = "match_lineups_sequence", allocationSize = 1)
    private Long match_lineups_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_id", referencedColumnName = "match_lineups_id")
    private List<MatchLineupTeamA> team_a;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_id", referencedColumnName = "match_lineups_id")
    private List<MatchLineupTeamB> team_b;

    public MatchLineups() {
    }

    public MatchLineups(Long match_lineups_id, List<MatchLineupTeamA> team_a, List<MatchLineupTeamB> team_b) {
        this.match_lineups_id = match_lineups_id;
        this.team_a = team_a;
        this.team_b = team_b;
    }

    public MatchLineups(List<MatchLineupTeamA> team_a, List<MatchLineupTeamB> team_b) {
        this.team_a = team_a;
        this.team_b = team_b;
    }
}
