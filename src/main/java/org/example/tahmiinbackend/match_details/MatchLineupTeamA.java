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
public class MatchLineupTeamA {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_lineups_team_a_sequence")
    @SequenceGenerator(name = "match_lineups_team_a_sequence", sequenceName = "match_lineups_team_a_sequence", allocationSize = 1)
    private Long match_lineups_team_a_id;
    private Integer player_id;
    private Integer shirt_number;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_lineups_team_a_id", referencedColumnName = "match_lineups_team_a_id")
    private List<PlayerEvents> player_events;

    public MatchLineupTeamA() {
    }

    public MatchLineupTeamA(Long match_lineups_team_a_id, Integer player_id, Integer shirt_number, List<PlayerEvents> player_events) {
        this.match_lineups_team_a_id = match_lineups_team_a_id;
        this.player_id = player_id;
        this.shirt_number = shirt_number;
        this.player_events = player_events;
    }

    public MatchLineupTeamA(Integer player_id, Integer shirt_number, List<PlayerEvents> player_events) {
        this.player_id = player_id;
        this.shirt_number = shirt_number;
        this.player_events = player_events;
    }
}
