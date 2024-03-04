package org.example.tahmiinbackend.player_individual;

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
@JsonIgnoreProperties({"annual_salary_eur","annual_salary_eur_percentile"})
public class PlayerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long player_details_id;
    private Double average_rating_overall;
    private Double assists_per_game_overall;
    private Double assists_per90_percentile_overall;
    private Double passes_per_90_overall;
    private Double passes_per_game_overall;
    private Double passes_per90_percentile_overall;
    private Integer passes_total_overall;
    private Double passes_completed_per_game_overall;
    private Integer passes_completed_total_overall;
    private Double pass_completion_rate_percentile_overall;
    private Double passes_completed_per_90_overall;
    private Double passes_completed_per90_percentile_overall;
    private Integer short_passes_per_game_overall;
    private Integer long_passes_per_game_overall;
    private Double key_passes_per_game_overall;
    private Integer key_passes_total_overall;
    private Double crosses_per_game_overall;
    private Double tackles_per_90_overall;
    private Double tackles_per_game_overall;
    private Integer tackles_total_overall;
    private Double tackles_successful_per_game_overall;
    private Double dispossesed_per_game_overall;
    private Double saves_per_game_overall;
    private Double interceptions_per_game_overall;
    private Double dribbles_successful_per_game_overall;
    private Double shots_faced_per_game_overall;
    private Double shots_per_goal_scored_overall;
    private Double shots_per_90_overall;
    private Double shots_off_target_per_game_overall;
    private Double dribbles_per_game_overall;
    private Double shots_on_target_per_game_overall;
    private Double xg_per_game_overall;
    private Double aerial_duels_won_per_game_overall;
    private Integer shots_total_overall;
    private Double shots_per_game_overall;
    private Integer shots_per90_percentile_overall;
    private Integer shots_on_target_total_overall;
    private Double shots_on_target_per_90_overall;
    private Integer shots_on_target_per90_percentile_overall;
    private Integer shots_off_target_total_overall;
    private Double shots_off_target_per_90_overall;
    private Integer shots_off_target_per90_percentile_overall;
    private Integer games_subbed_out;
    private Integer games_subbed_in;
    private Integer games_started;
    private Double tackles_per90_percentile_overall;
    private Double tackles_successful_per_90_overall;
    private Double tackles_successful_per90_percentile_overall;
    private Double tackles_successful_total_overall;
    private Integer interceptions_total_overall;
    private Double interceptions_per_90_overall;
    private Double interceptions_per90_percentile_overall;
    private Integer crosses_total_overall;
    private Double cross_completion_rate_percentile_overall;
    private Double crosses_per_90_overall;
    private Integer crosses_per90_percentile_overall;
    private Double key_passes_per_90_overall;
    private Double key_passes_per90_percentile_overall;
    private Integer dribbles_total_overall;
    private Double dribbles_per_90_overall;
    private Double dribbles_per90_percentile_overall;
    private Integer dribbles_successful_total_overall;
    private Double dribbles_successful_per_90_overall;
    private Double dribbles_successful_percentage_overall;
    private Double saves_total_overall;
    private Double save_percentage_percentile_overall;
    private Double saves_per_90_overall;
    private Double saves_per90_percentile_overall;
    private Integer shots_faced_total_overall;
    private Double shots_per_goal_conceded_overall;
    private Integer conceded_per90_percentile_overall;
    private Double shots_faced_per_90_overall;
    private Integer shots_faced_per90_percentile_overall;
    private Double save_percentage_overall;
    private Double xg_total_overall;
    private Double pass_completion_rate_overall;
    private Double shot_accuraccy_percentage_overall;
    private Integer shot_accuraccy_percentage_percentile_overall;
    private Double dribbled_past_per90_percentile_overall;
    private Double dribbled_past_per_game_overall;
    private Double dribbled_past_per_90_overall;
    private Integer dribbled_past_total_overall;
    private Double dribbles_successful_per90_percentile_overall;
    private Double dribbles_successful_percentage_percentile_overall;
    private Integer pen_scored_total_overall;
    private Integer pen_missed_total_overall;
    private Integer inside_box_saves_total_overall;
    private Double blocks_per_game_overall;
    private Double blocks_per_90_overall;
    private Integer blocks_total_overall;
    private Double blocks_per90_percentile_overall;
    private Double ratings_total_overall;
    private Double clearances_per_game_overall;
    private Double clearances_per_90_overall;
    private Integer clearances_total_overall;
    private Double pen_committed_total_overall;
    private Double pen_save_percentage_overall;
    private Double pen_committed_per_90_overall;
    private Double pen_committed_per90_percentile_overall;
    private Double pen_committed_per_game_overall;
    private Double pens_saved_total_overall;
    private Double pens_taken_total_overall;
    private Integer hit_woodwork_total_overall;
    private Double hit_woodwork_per_game_overall;
    private Double hit_woodwork_per_90_overall;
    private Double punches_total_overall;
    private Double punches_per_game_overall;
    private Double punches_per_90_overall;
    private Double offsides_per_90_overall;
    private Double offsides_per_game_overall;
    private Integer offsides_total_overall;
    private Integer penalties_won_total_overall;
    private Double shot_conversion_rate_overall;
    private Double shot_conversion_rate_percentile_overall;
    private Integer minutes_played_percentile_overall;
    private Integer matches_played_percentile_overall;
    private Integer min_per_goal_percentile_overall;
    private Integer min_per_conceded_percentile_overall;
    private Double xa_total_overall;
    private Integer xa_per90_percentile_overall;
    private Double xa_per_game_overall;
    private Double xa_per_90_overall;
    private Double npxg_total_overall;
    private Double npxg_per90_percentile_overall;
    private Double npxg_per_game_overall;
    private Double npxg_per_90_overall;
    private Integer club_team_2_id;
    private Integer club_team_id;
    private Integer fouls_drawn_per90_percentile_overall;
    private Integer fouls_drawn_total_overall;
    private Double fouls_drawn_per_game_overall;
    private Double fouls_drawn_per_90_overall;
    private Double fouls_committed_per_90_overall;
    private Double fouls_committed_per_game_overall;
    private Integer fouls_committed_per90_percentile_overall;
    private Integer fouls_committed_total_overall;
    private Double xg_per_90_overall;
    private Integer xg_per90_percentile_overall;
    private Integer average_rating_percentile_overall;
    private Integer clearances_per90_percentile_overall;
    private Integer hit_woodwork_per90_percentile_overall;
    private Integer punches_per90_percentile_overall;
    private Integer offsides_per90_percentile_overall;
    private Integer aerial_duels_won_per90_percentile_overall;
    private Integer aerial_duels_won_total_overall;
    private Integer aerial_duels_won_percentage_overall;
    private Double aerial_duels_won_per_90_overall;
    private Double duels_per_90_overall;
    private Double duels_per_game_overall;
    private Integer duels_total_overall;
    private Integer duels_won_total_overall;
    private Integer duels_won_per90_percentile_overall;
    private Integer duels_per90_percentile_overall;
    private Double duels_won_per_90_overall;
    private Double duels_won_per_game_overall;
    private Double duels_won_percentage_overall;
    private Integer dispossesed_total_overall;
    private Double dispossesed_per_90_overall;
    private Double dispossesed_per90_percentile_overall;
    private Integer progressive_passes_total_overall;
    private Double cross_completion_rate_overall;
    private Integer accurate_crosses_total_overall;
    private Double accurate_crosses_per_game_overall;
    private Double accurate_crosses_per_90_overall;
    private Integer accurate_crosses_per90_percentile_overall;
    private Integer games_started_percentile_overall;
    private Integer games_subbed_in_percentile_overall;
    private Integer games_subbed_out_percentile_overall;
    private Integer hattricks_total_overall;
    private Integer two_goals_in_a_game_total_overall;
    private Integer three_goals_in_a_game_total_overall;
    private Integer two_goals_in_a_game_percentage_overall;
    private Integer three_goals_in_a_game_percentage_overall;
    private Integer goals_involved_per90_percentile_overall;
    private Integer goals_per90_percentile_overall;
    private Integer goals_per90_percentile_away;
    private Integer goals_per90_percentile_home;
    private Integer clean_sheets_percentage_percentile_overall;
    private Integer min_per_card_percentile_overall;
    private Integer cards_per90_percentile_overall;
    private Integer booked_over05_overall;
    private Integer booked_over05_percentage_overall;
    private Integer booked_over05_percentage_percentile_overall;
    private String shirt_number;
    private Integer detailed_minutes_played_recorded_overall;
    private Integer detailed_matches_played_recorded_overall;

    @ManyToOne
    @JoinColumn(name = "player_individual_id", referencedColumnName = "player_individual_id")
    private PlayerIndividual playerIndividual;

    public PlayerDetails() {
    }

}
