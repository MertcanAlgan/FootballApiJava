package org.example.tahmiinbackend.player_individual;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.example.tahmiinbackend.leagueSeasons.TopCleanSheets;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Builder
@Entity
@AllArgsConstructor
@Table
@JsonIgnoreProperties({"url", "last_match_timestamp"})
public class PlayerIndividual {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_individual_sequence")
    @SequenceGenerator(name = "player_individual_sequence", sequenceName = "player_individual_sequence", allocationSize = 1)
    private Long player_individual_id;
    private Integer id;
    private Integer competition_id;
    private String full_name;
    private String first_name;
    private String last_name;
    private String known_as;
    private String shorthand;
    private Integer age;
    private String height;
    private String weight;
    private String league;
    private String league_type;
    private String season;
    private Integer starting_year;
    private Integer ending_year;
    private Integer national_team_id;
    private Integer club_team_id;
    private Integer club_team_2_id;
    private String position;
    private String minutes_played_overall;
    private String minutes_played_home;
    private String minutes_played_away;
    private Integer birthday;
    private String nationality;
    private String continent;
    private Integer appearances_overall;
    private Integer appearances_home;
    private Integer appearances_away;
    private Integer goals_overall;
    private Integer goals_home;
    private Integer goals_away;
    private Integer clean_sheets_home;
    private Integer clean_sheets_away;
    private Integer clean_sheets_overall;
    private Integer conceded_overall;
    private Integer conceded_home;
    private Integer conceded_away;
    private Integer assists_overall;
    private Integer assists_home;
    private Integer assists_away;
    private Integer penalty_goals;
    private Integer penalty_misses;
    private Integer penalty_success;
    private Double goals_involved_per_90_overall;
    private Double assists_per_90_overall;
    private Double goals_per_90_overall;
    private Double clean_sheets_per_overall;
    private Double goals_per_90_home;
    private Double goals_per_90_away;
    private Integer min_per_goal_overall;
    private Double conceded_per_90_overall;
    private Integer min_per_conceded_overall;
    private Integer cards_overall;
    private Integer yellow_cards_overall;
    private Integer red_cards_overall;
    private Integer min_per_match;
    private Integer min_per_card_overall;
    private Integer min_per_assist_overall;
    private Double cards_per_90_overall;
    private Integer rank_in_league_top_attackers;
    private Integer rank_in_league_top_midfielders;
    private Integer rank_in_league_top_defenders;
    private Integer rank_in_club_top_scorer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_individual_id", referencedColumnName = "player_individual_id")
    private PlayerDetails detailed;

    public PlayerIndividual() {
    }
}
