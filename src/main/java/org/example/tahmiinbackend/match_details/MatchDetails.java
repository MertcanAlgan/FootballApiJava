package org.example.tahmiinbackend.match_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@Entity
@Table
@AllArgsConstructor
@JsonIgnoreProperties({"revised_game_week","homeGoals","awayGoals","stadium_location","odds_ft_1",
        "odds_ft_x",
        "odds_ft_2",
        "odds_ft_over05",
        "odds_ft_over15",
        "odds_ft_over25",
        "odds_ft_over35",
        "odds_ft_over45",
        "odds_ft_under05",
        "odds_ft_under15",
        "odds_ft_under25",
        "odds_ft_under35",
        "odds_ft_under45",
        "odds_btts_yes",
        "odds_btts_no",
        "odds_team_a_cs_yes",
        "odds_team_a_cs_no",
        "odds_team_b_cs_yes",
        "odds_team_b_cs_no",
        "odds_doublechance_1x",
        "odds_doublechance_12",
        "odds_doublechance_x2",
        "odds_1st_half_result_1",
        "odds_1st_half_result_x",
        "odds_1st_half_result_2",
        "odds_2nd_half_result_1",
        "odds_2nd_half_result_x",
        "odds_2nd_half_result_2",
        "odds_dnb_1",
        "odds_dnb_2",
        "odds_corners_over_75",
        "odds_corners_over_85",
        "odds_corners_over_95",
        "odds_corners_over_105",
        "odds_corners_over_115",
        "odds_corners_under_75",
        "odds_corners_under_85",
        "odds_corners_under_95",
        "odds_corners_under_105",
        "odds_corners_under_115",
        "odds_corners_1",
        "odds_corners_x",
        "odds_corners_2",
        "odds_team_to_score_first_1",
        "odds_team_to_score_first_x",
        "odds_team_to_score_first_2",
        "odds_win_to_nil_1",
        "odds_win_to_nil_2",
        "odds_1st_half_over05",
        "odds_1st_half_over15",
        "odds_1st_half_over25",
        "odds_1st_half_over35",
        "odds_1st_half_under05",
        "odds_1st_half_under15",
        "odds_1st_half_under25",
        "odds_1st_half_under35",
        "odds_2nd_half_over05",
        "odds_2nd_half_over15",
        "odds_2nd_half_over25",
        "odds_2nd_half_over35",
        "odds_2nd_half_under05",
        "odds_2nd_half_under15",
        "odds_2nd_half_under25",
        "odds_2nd_half_under35",
        "odds_btts_1st_half_yes",
        "odds_btts_1st_half_no",
        "odds_btts_2nd_half_yes",
        "odds_btts_2nd_half_no",
        "home_url",
        "away_url",
        "match_url",
        "trends",
        "homeGoals_timings",
        "awayGoals_timings",
        "h2h",
        "tv_stations",
        "weather",
        "gpt_en",
        "gpt_int",
        "odds_comparison",
        "team_a_card_details",
        "team_b_card_details",
})
public class MatchDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_details_sequence")
    @SequenceGenerator(name = "match_details_sequence", sequenceName = "match_details_sequence", allocationSize = 1)
    private Long match_details_id;
    private Integer id;
    private Integer homeID;
    private Integer awayID;
    private String season;
    private String status;
    private Integer roundID;
    private Integer homeGoalCount;
    private Integer awayGoalCount;
    private Integer totalGoalCount;
    private Integer team_a_corners;
    private Integer team_b_corners;
    private Integer totalCornerCount;
    private Integer team_a_offsides;
    private Integer team_b_offsides;
    private Integer team_a_yellow_cards;
    private Integer team_b_yellow_cards;
    private Integer team_a_red_cards;
    private Integer team_b_red_cards;
    private Integer team_a_shotsOnTarget;
    private Integer team_b_shotsOnTarget;
    private Integer team_a_shotsOffTarget;
    private Integer team_b_shotsOffTarget;
    private Integer team_a_shots;
    private Integer team_b_shots;
    private Integer team_a_fouls;
    private Integer team_b_fouls;
    private Integer team_a_possession;
    private Integer team_b_possession;
    private Integer refereeID;
    private Integer coach_a_ID;
    private Integer coach_b_ID;
    private String stadium_name;
    private Integer team_a_cards_num;
    private Integer team_b_cards_num;
    private Integer overallGoalCount;
    private Integer ht_goals_team_a;
    private Integer ht_goals_team_b;
    private Integer goals_2hg_team_a;
    private Integer goals_2hg_team_b;
    private Integer GoalCount_2hg;
    private Integer HTGoalCount;
    private Integer date_unix;
    private Integer winningTeam;
    private Integer no_home_away;
    private Double btts_potential;
    private Double btts_fhg_potential;
    private Double btts_2hg_potential;
    private Integer goalTimingDisabled;
    private Integer attendance;
    private Integer corner_timings_recorded;
    private Integer card_timings_recorded;
    private Integer team_a_fh_corners;
    private Integer team_b_fh_corners;
    private Integer team_a_2h_corners;
    private Integer team_b_2h_corners;
    private Integer corner_fh_count;
    private Integer corner_2h_count;
    private Integer team_a_fh_cards;
    private Integer team_b_fh_cards;
    private Integer team_a_2h_cards;
    private Integer team_b_2h_cards;
    private Integer total_fh_cards;
    private Integer total_2h_cards;
    private Integer attacks_recorded;
    private Integer team_a_dangerous_attacks;
    private Integer team_b_dangerous_attacks;
    private Integer team_a_attacks;
    private Integer team_b_attacks;
    private Integer team_a_xg;
    private Integer team_b_xg;
    private Integer total_xg;
    private Integer team_a_penalties_won;
    private Integer team_b_penalties_won;
    private Integer team_a_penalty_goals;
    private Integer team_b_penalty_goals;
    private Integer team_a_penalty_missed;
    private Integer team_b_penalty_missed;
    private Integer pens_recorded;
    private Integer goal_timings_recorded;
    private Integer team_a_0_10_min_goals;
    private Integer team_b_0_10_min_goals;
    private Integer team_a_corners_0_10_min;
    private Integer team_b_corners_0_10_min;
    private Integer team_a_cards_0_10_min;
    private Integer team_b_cards_0_10_min;
    private Integer throwins_recorded;
    private Integer team_a_throwins;
    private Integer team_b_throwins;
    private Integer freekicks_recorded;
    private Integer team_a_freekicks;
    private Integer team_b_freekicks;
    private Integer goalkicks_recorded;
    private Integer team_a_goalkicks;
    private Integer team_b_goalkicks;
    private Double o45_potential;
    private Double o35_potential;
    private Double o25_potential;
    private Double o15_potential;
    private Double o05_potential;
    private Double o05HT_potential;
    private Double o05_2H_potential;
    private Double o15_2H_potential;
    private Double corners_potential;
    private Double offsides_potential;
    private Double cards_potential;
    private Double avg_potential;
    private String home_image;
    private String home_name;
    private String away_image;
    private String away_name;
    private Double home_ppg;
    private Double away_ppg;
    private Double pre_match_home_ppg;
    private Double pre_match_away_ppg;
    private Double pre_match_teamA_overall_ppg;
    private Double pre_match_teamB_overall_ppg;
    private Double u45_potential;
    private Double u35_potential;
    private Double u25_potential;
    private Double u15_potential;
    private Double u05_potential;
    private Double corners_o85_potential;
    private Double corners_o95_potential;
    private Double corners_o105_potential;
    private Double team_a_xg_prematch;
    private Double team_b_xg_prematch;
    private Double total_xg_prematch;
    private Integer competition_id;
    private Integer matches_completed_minimum;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_details_id", referencedColumnName = "match_details_id")
    private List<MatchLineups> lineups;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_details_id", referencedColumnName = "match_details_id")
    private List<MatchBench> bench;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_details_id", referencedColumnName = "match_details_id")
    private List<TeamAGoalDetails> team_a_goal_details;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "match_details_id", referencedColumnName = "match_details_id")
    private List<TeamBGoalDetails> team_b_goal_details;

    public MatchDetails() {
    }


}
