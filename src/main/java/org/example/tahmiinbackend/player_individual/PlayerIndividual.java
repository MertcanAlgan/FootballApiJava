package org.example.tahmiinbackend.player_individual;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.tahmiinbackend.leagueSeasons.TopCleanSheets;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Builder
@Entity
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

    public PlayerIndividual(Long player_individual_id, Integer id, Integer competition_id, String full_name, String first_name, String last_name, String known_as, String shorthand, Integer age, String height, String weight, String league, String league_type, String season, Integer starting_year, Integer ending_year, Integer national_team_id, Integer club_team_id, Integer club_team_2_id, String position, String minutes_played_overall, String minutes_played_home, String minutes_played_away, Integer birthday, String nationality, String continent, Integer appearances_overall, Integer appearances_home, Integer appearances_away, Integer goals_overall, Integer goals_home, Integer goals_away, Integer clean_sheets_home, Integer clean_sheets_away, Integer clean_sheets_overall, Integer conceded_overall, Integer conceded_home, Integer conceded_away, Integer assists_overall, Integer assists_home, Integer assists_away, Integer penalty_goals, Integer penalty_misses, Integer penalty_success, Double goals_involved_per_90_overall, Double assists_per_90_overall, Double goals_per_90_overall, Double clean_sheets_per_overall, Double goals_per_90_home, Double goals_per_90_away, Integer min_per_goal_overall, Double conceded_per_90_overall, Integer min_per_conceded_overall, Integer cards_overall, Integer yellow_cards_overall, Integer red_cards_overall, Integer min_per_match, Integer min_per_card_overall, Integer min_per_assist_overall, Double cards_per_90_overall, Integer rank_in_league_top_attackers, Integer rank_in_league_top_midfielders, Integer rank_in_league_top_defenders, Integer rank_in_club_top_scorer, PlayerDetails detailed) {
        this.player_individual_id = player_individual_id;
        this.id = id;
        this.competition_id = competition_id;
        this.full_name = full_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.known_as = known_as;
        this.shorthand = shorthand;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.league = league;
        this.league_type = league_type;
        this.season = season;
        this.starting_year = starting_year;
        this.ending_year = ending_year;
        this.national_team_id = national_team_id;
        this.club_team_id = club_team_id;
        this.club_team_2_id = club_team_2_id;
        this.position = position;
        this.minutes_played_overall = minutes_played_overall;
        this.minutes_played_home = minutes_played_home;
        this.minutes_played_away = minutes_played_away;
        this.birthday = birthday;
        this.nationality = nationality;
        this.continent = continent;
        this.appearances_overall = appearances_overall;
        this.appearances_home = appearances_home;
        this.appearances_away = appearances_away;
        this.goals_overall = goals_overall;
        this.goals_home = goals_home;
        this.goals_away = goals_away;
        this.clean_sheets_home = clean_sheets_home;
        this.clean_sheets_away = clean_sheets_away;
        this.clean_sheets_overall = clean_sheets_overall;
        this.conceded_overall = conceded_overall;
        this.conceded_home = conceded_home;
        this.conceded_away = conceded_away;
        this.assists_overall = assists_overall;
        this.assists_home = assists_home;
        this.assists_away = assists_away;
        this.penalty_goals = penalty_goals;
        this.penalty_misses = penalty_misses;
        this.penalty_success = penalty_success;
        this.goals_involved_per_90_overall = goals_involved_per_90_overall;
        this.assists_per_90_overall = assists_per_90_overall;
        this.goals_per_90_overall = goals_per_90_overall;
        this.clean_sheets_per_overall = clean_sheets_per_overall;
        this.goals_per_90_home = goals_per_90_home;
        this.goals_per_90_away = goals_per_90_away;
        this.min_per_goal_overall = min_per_goal_overall;
        this.conceded_per_90_overall = conceded_per_90_overall;
        this.min_per_conceded_overall = min_per_conceded_overall;
        this.cards_overall = cards_overall;
        this.yellow_cards_overall = yellow_cards_overall;
        this.red_cards_overall = red_cards_overall;
        this.min_per_match = min_per_match;
        this.min_per_card_overall = min_per_card_overall;
        this.min_per_assist_overall = min_per_assist_overall;
        this.cards_per_90_overall = cards_per_90_overall;
        this.rank_in_league_top_attackers = rank_in_league_top_attackers;
        this.rank_in_league_top_midfielders = rank_in_league_top_midfielders;
        this.rank_in_league_top_defenders = rank_in_league_top_defenders;
        this.rank_in_club_top_scorer = rank_in_club_top_scorer;
        this.detailed = detailed;
    }

    public PlayerIndividual(Integer id, Integer competition_id, String full_name, String first_name, String last_name, String known_as, String shorthand, Integer age, String height, String weight, String league, String league_type, String season, Integer starting_year, Integer ending_year, Integer national_team_id, Integer club_team_id, Integer club_team_2_id, String position, String minutes_played_overall, String minutes_played_home, String minutes_played_away, Integer birthday, String nationality, String continent, Integer appearances_overall, Integer appearances_home, Integer appearances_away, Integer goals_overall, Integer goals_home, Integer goals_away, Integer clean_sheets_home, Integer clean_sheets_away, Integer clean_sheets_overall, Integer conceded_overall, Integer conceded_home, Integer conceded_away, Integer assists_overall, Integer assists_home, Integer assists_away, Integer penalty_goals, Integer penalty_misses, Integer penalty_success, Double goals_involved_per_90_overall, Double assists_per_90_overall, Double goals_per_90_overall, Double clean_sheets_per_overall, Double goals_per_90_home, Double goals_per_90_away, Integer min_per_goal_overall, Double conceded_per_90_overall, Integer min_per_conceded_overall, Integer cards_overall, Integer yellow_cards_overall, Integer red_cards_overall, Integer min_per_match, Integer min_per_card_overall, Integer min_per_assist_overall, Double cards_per_90_overall, Integer rank_in_league_top_attackers, Integer rank_in_league_top_midfielders, Integer rank_in_league_top_defenders, Integer rank_in_club_top_scorer, PlayerDetails detailed) {
        this.id = id;
        this.competition_id = competition_id;
        this.full_name = full_name;
        this.first_name = first_name;
        this.last_name = last_name;
        this.known_as = known_as;
        this.shorthand = shorthand;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.league = league;
        this.league_type = league_type;
        this.season = season;
        this.starting_year = starting_year;
        this.ending_year = ending_year;
        this.national_team_id = national_team_id;
        this.club_team_id = club_team_id;
        this.club_team_2_id = club_team_2_id;
        this.position = position;
        this.minutes_played_overall = minutes_played_overall;
        this.minutes_played_home = minutes_played_home;
        this.minutes_played_away = minutes_played_away;
        this.birthday = birthday;
        this.nationality = nationality;
        this.continent = continent;
        this.appearances_overall = appearances_overall;
        this.appearances_home = appearances_home;
        this.appearances_away = appearances_away;
        this.goals_overall = goals_overall;
        this.goals_home = goals_home;
        this.goals_away = goals_away;
        this.clean_sheets_home = clean_sheets_home;
        this.clean_sheets_away = clean_sheets_away;
        this.clean_sheets_overall = clean_sheets_overall;
        this.conceded_overall = conceded_overall;
        this.conceded_home = conceded_home;
        this.conceded_away = conceded_away;
        this.assists_overall = assists_overall;
        this.assists_home = assists_home;
        this.assists_away = assists_away;
        this.penalty_goals = penalty_goals;
        this.penalty_misses = penalty_misses;
        this.penalty_success = penalty_success;
        this.goals_involved_per_90_overall = goals_involved_per_90_overall;
        this.assists_per_90_overall = assists_per_90_overall;
        this.goals_per_90_overall = goals_per_90_overall;
        this.clean_sheets_per_overall = clean_sheets_per_overall;
        this.goals_per_90_home = goals_per_90_home;
        this.goals_per_90_away = goals_per_90_away;
        this.min_per_goal_overall = min_per_goal_overall;
        this.conceded_per_90_overall = conceded_per_90_overall;
        this.min_per_conceded_overall = min_per_conceded_overall;
        this.cards_overall = cards_overall;
        this.yellow_cards_overall = yellow_cards_overall;
        this.red_cards_overall = red_cards_overall;
        this.min_per_match = min_per_match;
        this.min_per_card_overall = min_per_card_overall;
        this.min_per_assist_overall = min_per_assist_overall;
        this.cards_per_90_overall = cards_per_90_overall;
        this.rank_in_league_top_attackers = rank_in_league_top_attackers;
        this.rank_in_league_top_midfielders = rank_in_league_top_midfielders;
        this.rank_in_league_top_defenders = rank_in_league_top_defenders;
        this.rank_in_club_top_scorer = rank_in_club_top_scorer;
        this.detailed = detailed;
    }
}
