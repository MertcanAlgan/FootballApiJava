package org.example.tahmiinbackend.leagueRefs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@Entity
@Table
@JsonIgnoreProperties({"url"})
public class LeagueRefs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "league_refs_sequence")
    @SequenceGenerator(name = "league_refs_sequence", sequenceName = "league_refs_sequence", allocationSize = 1)
    private Long league_refs_id;
    private Integer id;
    private Integer competition_id;
    private String full_name;
    private String first_name;
    private String last_name;
    private String known_as;
    private String shorthand;
    private Integer age;
    private String league;
    private String league_type;
    private String season;
    private String continent;
    private Integer starting_year;
    private Integer ending_year;
    private Integer birthday;
    private String nationality;
    private Integer appearances_overall;
    private Integer wins_home;
    private Integer wins_away;
    private Integer draws_overall;
    private Integer wins_per_home;
    private Integer wins_per_away;
    private Integer draws_per;
    private Integer btts_overall;
    private Integer btts_percentage;
    private Integer goals_overall;
    private Integer goals_home;
    private Integer goals_away;
    private Integer goals_per_match_overall;
    private Integer goals_per_match_home;
    private Integer goals_per_match_away;
    private Integer penalties_given_overall;
    private Integer penalties_given_home;
    private Integer penalties_given_away;
    private Double penalties_given_per_match_overall;
    private Double penalties_given_per_match_home;
    private Double penalties_given_per_match_away;
    private Integer penalties_given_percentage_overall;
    private Integer penalties_given_percentage_home;
    private Integer penalties_given_percentage_away;
    private Integer cards_overall;
    private Integer cards_home;
    private Integer cards_away;
    private Double cards_per_match_overall;
    private Double cards_per_match_home;
    private Double cards_per_match_away;
    private Integer over05_cards_overall;
    private Integer over15_cards_overall;
    private Integer over25_cards_overall;
    private Integer over35_cards_overall;
    private Integer over45_cards_overall;
    private Integer over55_cards_overall;
    private Integer over65_cards_overall;
    private Double over05_cards_per_match_overall;
    private Double over15_cards_per_match_overall;
    private Double over25_cards_per_match_overall;
    private Double over35_cards_per_match_overall;
    private Double over45_cards_per_match_overall;
    private Double over55_cards_per_match_overall;
    private Double over65_cards_per_match_overall;
    private Integer over05_cards_percentage_overall;
    private Integer over15_cards_percentage_overall;
    private Integer over25_cards_percentage_overall;
    private Integer over35_cards_percentage_overall;
    private Integer over45_cards_percentage_overall;
    private Integer over55_cards_percentage_overall;
    private Integer over65_cards_percentage_overall;
    private Integer yellow_cards_overall;
    private Integer red_cards_overall;
    private Integer min_per_goal_overall;
    private Integer min_per_card_overall;

    public LeagueRefs() {
    }
}
