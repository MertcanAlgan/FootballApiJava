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
public class MatchLineupTeamB {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_lineups_team_b_sequence")
    @SequenceGenerator(name = "match_lineups_team_b_sequence", sequenceName = "match_lineups_team_b_sequence", allocationSize = 1)
    private Long match_lineups_team_b_id;
    private Integer player_id;
    private Integer shirt_number;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_team_b_id", referencedColumnName = "match_lineups_team_b_id")
    private List<PlayerEvents> player_events;

    public MatchLineupTeamB() {
    }

    public MatchLineupTeamB(Long match_lineups_team_b_id, Integer player_id, Integer shirt_number, List<PlayerEvents> player_events) {
        this.match_lineups_team_b_id = match_lineups_team_b_id;
        this.player_id = player_id;
        this.shirt_number = shirt_number;
        this.player_events = player_events;
    }

    public MatchLineupTeamB(Integer player_id, Integer shirt_number, List<PlayerEvents> player_events) {
        this.player_id = player_id;
        this.shirt_number = shirt_number;
        this.player_events = player_events;
    }
}
