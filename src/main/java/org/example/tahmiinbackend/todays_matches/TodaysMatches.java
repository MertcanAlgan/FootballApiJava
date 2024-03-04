package org.example.tahmiinbackend.todays_matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@Builder
@Entity
@Table
@JsonIgnoreProperties({"revised_game_week","homeGoals","awayGoals","homeGoalCount",
        "awayGoalCount",
        "totalGoalCount",
        "team_a_corners",
        "team_b_corners",
        "totalCornerCount",
        "team_a_offsides",
        "team_b_offsides",
        "team_a_yellow_cards",
        "team_b_yellow_cards",
        "team_a_red_cards",
        "team_b_red_cards",
        "team_a_shotsOnTarget",
        "team_b_shotsOnTarget",
        "team_a_shotsOffTarget",
        "team_b_shotsOffTarget",
        "team_a_shots",
        "team_b_shots",
        "team_a_fouls",
        "team_b_fouls",
        "team_a_possession",
        "team_b_possession",
        "stadium_location",
        "team_a_cards_num",
        "team_b_cards_num",
        "odds_ft_1",
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
        "overallGoalCount",
        "ht_goals_team_a",
        "ht_goals_team_b",
        "goals_2hg_team_a",
        "goals_2hg_team_b",
        "GoalCount_2hg",
        "HTGoalCount",
        "attendance",
        "corner_timings_recorded",
        "card_timings_recorded",
        "team_a_fh_corners",
        "team_b_fh_corners",
        "team_a_2h_corners",
        "team_b_2h_corners",
        "corner_fh_count",
        "corner_2h_count",
        "team_a_fh_cards",
        "team_b_fh_cards",
        "team_a_2h_cards",
        "team_b_2h_cards",
        "total_fh_cards",
        "total_2h_cards",
        "attacks_recorded",
        "team_a_dangerous_attacks",
        "team_b_dangerous_attacks",
        "team_a_attacks",
        "team_b_attacks",
        "team_a_xg",
        "team_b_xg",
        "total_xg",
        "team_a_penalties_won",
        "team_b_penalties_won",
        "team_a_penalty_goals",
        "team_b_penalty_goals",
        "team_a_penalty_missed",
        "team_b_penalty_missed",
        "pens_recorded",
        "goal_timings_recorded",
        "team_a_0_10_min_goals",
        "team_b_0_10_min_goals",
        "team_a_corners_0_10_min",
        "team_b_corners_0_10_min",
        "team_a_cards_0_10_min",
        "team_b_cards_0_10_min",
        "throwins_recorded",
        "team_a_throwins",
        "team_b_throwins",
        "freekicks_recorded",
        "team_a_freekicks",
        "team_b_freekicks",
        "goalkicks_recorded",
        "team_a_goalkicks",
        "team_b_goalkicks",
        "home_url",
        "away_url",
        "match_url",
        "matches_completed_minimum",
        "homeGoals_timings",
        "awayGoals_timings",
        "winningTeam",
})
public class TodaysMatches {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "todays_matches_sequence")
    @SequenceGenerator(name = "todays_matches_sequence", sequenceName = "todays_matches_sequence", allocationSize = 1)
    private Long todays_matches_id;
    private Integer id;
    private Integer homeID;
    private Integer awayID;
    private String season;
    private String status;
    private Integer roundID;
    private Integer game_week;
    private Integer refereeID;
    private Integer coach_a_ID;
    private Integer coach_b_ID;
    private String stadium_name;
    private Integer date_unix;
    private Integer no_home_away;
    private Integer btts_potential;
    private Integer btts_fhg_potential;
    private Integer btts_2hg_potential;
    private Integer goalTimingDisabled;
    private Integer o45_potential;
    private Integer o35_potential;
    private Integer o25_potential;
    private Integer o15_potential;
    private Integer o05_potential;
    private Integer o15HT_potential;
    private Integer o05HT_potential;
    private Integer o05_2H_potential;
    private Integer o15_2H_potential;
    private Double offsides_potential;
    private Double corners_potential;
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
    private Integer u45_potential;
    private Integer u35_potential;
    private Integer u25_potential;
    private Integer u15_potential;
    private Integer u05_potential;
    private Integer corners_o85_potential;
    private Integer corners_o95_potential;
    private Integer corners_o105_potential;
    private Double team_a_xg_prematch;
    private Double team_b_xg_prematch;
    private Double total_xg_prematch;
    private Integer competition_id;



    public TodaysMatches() {
    }
}
