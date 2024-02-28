package org.example.tahmiinbackend.leagueTeams;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({"previous_seasons","seasonGoals_home","seasonGoals_away","seasonConceded_home","seasonConceded_away",
        "ppg_2hg_processed_overall",
        "ppg_2hg_processed_home",
        "ppg_2hg_processed_away",
        "offsidesTeamTotal_overall",
        "offsidesTeamTotal_home",
        "offsidesTeamTotal_away",
        "attack_num_recoded_matches_overall",
        "formRun_ht_overall",
        "formRun_ht_home",
        "formRun_ht_away",
        "formRun_2hg_overall",
        "formRun_2hg_home",
        "formRun_2hg_away",
        "average_attendance_overall",
        "average_attendance_home",
        "average_attendance_away",
        "cornerTimingRecorded_matches_overall",
        "cornerTimingRecorded_matches_home",
        "cornerTimingRecorded_matches_away",
        "gd_text_2hg_overall",
        "gd_text_2hg_home",
        "gd_text_2hg_away",
        "offsidesTeamAVG_overall",
        "offsidesTeamAVG_home",
        "offsidesTeamAVG_away",
        "additional_info",
        "offsidesRecorded_matches_overall",
        "offsidesRecorded_matches_home",
        "offsidesRecorded_matches_away",
        "offsidesTeamOver05_overall",
        "offsidesTeamOver15_overall",
        "offsidesTeamOver25_overall",
        "offsidesTeamOver35_overall",
        "offsidesTeamOver45_overall",
        "offsidesTeamOver55_overall",
        "offsidesTeamOver65_overall",
        "offsidesTeamOver05Percentage_overall",
        "offsidesTeamOver15Percentage_overall",
        "offsidesTeamOver25Percentage_overall",
        "offsidesTeamOver35Percentage_overall",
        "offsidesTeamOver45Percentage_overall",
        "offsidesTeamOver55Percentage_overall",
        "offsidesTeamOver65Percentage_overall",
        "offsidesTeamOver05_home",
        "offsidesTeamOver15_home",
        "offsidesTeamOver25_home",
        "offsidesTeamOver35_home",
        "offsidesTeamOver45_home",
        "offsidesTeamOver55_home",
        "offsidesTeamOver65_home",
        "offsidesTeamOver05Percentage_home",
        "offsidesTeamOver15Percentage_home",
        "offsidesTeamOver25Percentage_home",
        "offsidesTeamOver35Percentage_home",
        "offsidesTeamOver45Percentage_home",
        "offsidesTeamOver55Percentage_home",
        "offsidesTeamOver65Percentage_home",
        "offsidesTeamOver05_away",
        "offsidesTeamOver15_away",
        "offsidesTeamOver25_away",
        "offsidesTeamOver35_away",
        "offsidesTeamOver45_away",
        "offsidesTeamOver55_away",
        "offsidesTeamOver65_away",
        "offsidesTeamOver05Percentage_away",
        "offsidesTeamOver15Percentage_away",
        "offsidesTeamOver25Percentage_away",
        "offsidesTeamOver35Percentage_away",
        "offsidesTeamOver45Percentage_away",
        "offsidesTeamOver55Percentage_away",
        "offsidesTeamOver65Percentage_away",
        "seasonMatchesPlayedGoalTimingRecorded_overall",
        "seasonMatchesPlayedGoalTimingRecorded_home",
        "seasonMatchesPlayedGoalTimingRecorded_away",
        "goals_scored_min_0_to_10",
        "goals_conceded_min_0_to_10",
        "goals_scored_min_11_to_20",
        "goals_conceded_min_11_to_20",
        "goals_scored_min_21_to_30",
        "goals_conceded_min_21_to_30",
        "goals_scored_min_31_to_40",
        "goals_conceded_min_31_to_40",
        "goals_scored_min_41_to_50",
        "goals_conceded_min_41_to_50",
        "goals_scored_min_51_to_60",
        "goals_conceded_min_51_to_60",
        "goals_scored_min_61_to_70",
        "goals_conceded_min_61_to_70",
        "goals_scored_min_71_to_80",
        "goals_conceded_min_71_to_80",
        "goals_scored_min_81_to_90",
        "goals_conceded_min_81_to_90",
        "goals_all_min_0_to_10",
        "goals_all_min_11_to_20",
        "goals_all_min_21_to_30",
        "goals_all_min_31_to_40",
        "goals_all_min_41_to_50",
        "goals_all_min_51_to_60",
        "goals_all_min_61_to_70",
        "goals_all_min_71_to_80",
        "goals_all_min_81_to_90",
        "goals_scored_min_0_to_10_home",
        "goals_scored_min_11_to_20_home",
        "goals_scored_min_21_to_30_home",
        "goals_scored_min_31_to_40_home",
        "goals_scored_min_41_to_50_home",
        "goals_scored_min_51_to_60_home",
        "goals_scored_min_61_to_70_home",
        "goals_scored_min_71_to_80_home",
        "goals_scored_min_81_to_90_home",
        "goals_scored_min_0_to_15_home",
        "goals_scored_min_16_to_30_home",
        "goals_scored_min_31_to_45_home",
        "goals_scored_min_46_to_60_home",
        "goals_scored_min_61_to_75_home",
        "goals_scored_min_76_to_90_home",
        "goals_conceded_min_0_to_10_home",
        "goals_conceded_min_11_to_20_home",
        "goals_conceded_min_21_to_30_home",
        "goals_conceded_min_31_to_40_home",
        "goals_conceded_min_41_to_50_home",
        "goals_conceded_min_51_to_60_home",
        "goals_conceded_min_61_to_70_home",
        "goals_conceded_min_71_to_80_home",
        "goals_conceded_min_81_to_90_home",
        "goals_conceded_min_0_to_15_home",
        "goals_conceded_min_16_to_30_home",
        "goals_conceded_min_31_to_45_home",
        "goals_conceded_min_46_to_60_home",
        "goals_conceded_min_61_to_75_home",
        "goals_conceded_min_76_to_90_home",
        "goals_all_min_0_to_10_home",
        "goals_all_min_11_to_20_home",
        "goals_all_min_21_to_30_home",
        "goals_all_min_31_to_40_home",
        "goals_all_min_41_to_50_home",
        "goals_all_min_51_to_60_home",
        "goals_all_min_61_to_70_home",
        "goals_all_min_71_to_80_home",
        "goals_all_min_81_to_90_home",
        "goals_all_min_0_to_15_home",
        "goals_all_min_16_to_30_home",
        "goals_all_min_31_to_45_home",
        "goals_all_min_46_to_60_home",
        "goals_all_min_61_to_75_home",
        "goals_all_min_76_to_90_home",
        "goals_scored_min_0_to_10_away",
        "goals_scored_min_11_to_20_away",
        "goals_scored_min_21_to_30_away",
        "goals_scored_min_31_to_40_away",
        "goals_scored_min_41_to_50_away",
        "goals_scored_min_51_to_60_away",
        "goals_scored_min_61_to_70_away",
        "goals_scored_min_71_to_80_away",
        "goals_scored_min_81_to_90_away",
        "goals_scored_min_0_to_15_away",
        "goals_scored_min_16_to_30_away",
        "goals_scored_min_31_to_45_away",
        "goals_scored_min_46_to_60_away",
        "goals_scored_min_61_to_75_away",
        "goals_scored_min_76_to_90_away",
        "goals_conceded_min_0_to_10_away",
        "goals_conceded_min_11_to_20_away",
        "goals_conceded_min_21_to_30_away",
        "goals_conceded_min_31_to_40_away",
        "goals_conceded_min_41_to_50_away",
        "goals_conceded_min_51_to_60_away",
        "goals_conceded_min_61_to_70_away",
        "goals_conceded_min_71_to_80_away",
        "goals_conceded_min_81_to_90_away",
        "goals_conceded_min_0_to_15_away",
        "goals_conceded_min_16_to_30_away",
        "goals_conceded_min_31_to_45_away",
        "goals_conceded_min_46_to_60_away",
        "goals_conceded_min_61_to_75_away",
        "goals_conceded_min_76_to_90_away",
        "goals_all_min_0_to_10_away",
        "goals_all_min_11_to_20_away",
        "goals_all_min_21_to_30_away",
        "goals_all_min_31_to_40_away",
        "goals_all_min_41_to_50_away",
        "goals_all_min_51_to_60_away",
        "goals_all_min_61_to_70_away",
        "goals_all_min_71_to_80_away",
        "goals_all_min_81_to_90_away",
        "goals_all_min_0_to_15_away",
        "goals_all_min_16_to_30_away",
        "goals_all_min_31_to_45_away",
        "goals_all_min_46_to_60_away",
        "goals_all_min_61_to_75_away",
        "goals_all_min_76_to_90_away",
        "name_jp",
        "name_tr",
        "name_kr",
        "name_pt",
        "name_ru",
        "name_es",
        "name_se",
        "name_de",
        "name_zht",
        "name_nl",
        "name_it",
        "name_fr",
        "name_id",
        "name_pl",
        "name_gr",
        "name_dk",
        "name_th",
        "name_hr",
        "name_ro",
        "name_in",
        "name_no",
        "name_hu",
        "name_cz",
        "name_cn",
        "name_ara",
        "name_si",
        "name_vn",
        "name_my",
        "name_sk",
        "name_rs",
        "name_ua",
        "name_bg",
        "name_lv",
        "name_ge",
        "name_swa",
        "name_kur",
        "name_ee",
        "name_lt",
        "name_ba",
        "name_by",
        "name_fi",
        "women",
        "parent_url",
        "prediction_risk"})
public class TeamStats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_stats_sequence")
    @SequenceGenerator(name = "team_stats_sequence", sequenceName = "team_stats_sequence", allocationSize = 1)
    private Long stats_id;
    private Integer suspended_matches;
    private Integer homeAttackAdvantage;
    private Integer homeDefenceAdvantage;
    private Integer homeOverallAdvantage;

    private Integer seasonWinsNum_overall;
    private Integer seasonWinsNum_home;
    private Integer seasonWinsNum_away;
    private Integer seasonDrawsNum_overall;
    private Integer seasonDrawsNum_home;
    private Integer seasonDrawsNum_away;
    private Integer seasonLossesNum_overall;
    private Integer seasonLossesNum_home;
    private Integer seasonLossesNum_away;
    private Integer seasonMatchesPlayed_overall;
    private Integer seasonMatchesPlayed_home;
    private Integer seasonMatchesPlayed_away;
    private Double seasonPPG_overall;
    private Double seasonRecentPPG;
    private Double seasonPPG_home;
    private Double seasonPPG_away;
    private String currentFormHome;
    private String currentFormAway;
    private Integer leadingAtHT_overall;
    private Integer leadingAtHT_home;
    private Integer leadingAtHT_away;
    private Integer drawingAtHT_home;
    private Integer drawingAtHT_away;
    private Integer drawingAtHT_overall;
    private Integer trailingAtHT_home;
    private Integer trailingAtHT_away;
    private Integer trailingAtHT_overall;
    private Integer HTPoints_overall;
    private Integer HTPoints_home;
    private Integer HTPoints_away;
    private Double HTPPG_overall;
    private Double HTPPG_home;
    private Double HTPPG_away;


    private Integer over05Cards_overall;
    private Integer over15Cards_overall;
    private Integer over25Cards_overall;
    private Integer over35Cards_overall;
    private Integer over45Cards_overall;
    private Integer over55Cards_overall;
    private Integer over65Cards_overall;
    private Integer over75Cards_overall;
    private Integer over85Cards_overall;
    private Integer over05Cards_home;
    private Integer over15Cards_home;
    private Integer over35Cards_home;
    private Integer over45Cards_home;
    private Integer over55Cards_home;
    private Integer over65Cards_home;
    private Integer over75Cards_home;
    private Integer over85Cards_home;
    private Integer over05Cards_away;
    private Integer over15Cards_away;
    private Integer over25Cards_away;
    private Integer over35Cards_away;
    private Integer over45Cards_away;
    private Integer over55Cards_away;
    private Integer over65Cards_away;
    private Integer over75Cards_away;
    private Integer over85Cards_away;
    private Integer over05CardsFor_overall;
    private Integer over15CardsFor_overall;
    private Integer over25CardsFor_overall;
    private Integer over35CardsFor_overall;
    private Integer over45CardsFor_overall;
    private Integer over55CardsFor_overall;
    private Integer over65CardsFor_overall;
    private Integer over05CardsFor_home;
    private Integer over15CardsFor_home;
    private Integer over25CardsFor_home;
    private Integer over35CardsFor_home;
    private Integer over45CardsFor_home;
    private Integer over55CardsFor_home;
    private Integer over65CardsFor_home;
    private Integer over05CardsFor_away;
    private Integer over15CardsFor_away;
    private Integer over25CardsFor_away;
    private Integer over35CardsFor_away;
    private Integer over45CardsFor_away;
    private Integer over55CardsFor_away;
    private Integer over65CardsFor_away;
    private Integer over05CardsAgainst_overall;
    private Integer over15CardsAgainst_overall;
    private Integer over25CardsAgainst_overall;
    private Integer over35CardsAgainst_overall;
    private Integer over45CardsAgainst_overall;
    private Integer over55CardsAgainst_overall;
    private Integer over65CardsAgainst_overall;
    private Integer over05CardsAgainst_home;
    private Integer over15CardsAgainst_home;
    private Integer over25CardsAgainst_home;
    private Integer over35CardsAgainst_home;
    private Integer over45CardsAgainst_home;
    private Integer over55CardsAgainst_home;
    private Integer over65CardsAgainst_home;
    private Integer over05CardsAgainst_away;
    private Integer over15CardsAgainst_away;
    private Integer over25CardsAgainst_away;
    private Integer over35CardsAgainst_away;
    private Integer over45CardsAgainst_away;
    private Integer over55CardsAgainst_away;
    private Integer over65CardsAgainst_away;
    private Integer leaguePosition_overall;
    private Integer leaguePosition_home;
    private Integer leaguePosition_away;

    private Integer cardsTotal_overall;
    private Integer cardsTotal_home;
    private Integer cardsTotal_away;
    private Integer cardsHighest_overall;
    private Integer cardsLowest_overall;
    private Double cardsAVG_overall;
    private Double cardsAVG_home;
    private Double cardsAVG_away;
    private Integer shotsTotal_overall;
    private Integer shotsTotal_home;
    private Integer shotsTotal_away;
    private Double shotsAVG_overall;
    private Double shotsAVG_home;
    private Double shotsAVG_away;
    private Integer shotsOnTargetTotal_overall;
    private Integer shotsOnTargetTotal_home;
    private Integer shotsOnTargetTotal_away;
    private Integer shotsOffTargetTotal_overall;
    private Integer shotsOffTargetTotal_home;
    private Integer shotsOffTargetTotal_away;
    private Double shotsOnTargetAVG_overall;
    private Double shotsOnTargetAVG_home;
    private Double shotsOnTargetAVG_away;
    private Double shotsOffTargetAVG_overall;
    private Double shotsOffTargetAVG_home;
    private Double shotsOffTargetAVG_away;
    private Double possessionAVG_overall;
    private Double possessionAVG_home;
    private Double possessionAVG_away;
    private Double foulsAVG_overall;
    private Double foulsAVG_home;
    private Double foulsAVG_away;
    private Integer foulsTotal_overall;
    private Integer foulsTotal_home;
    private Integer foulsTotal_away;
    private Integer offsidesTotal_overall;
    private Integer offsidesTotal_home;
    private Integer offsidesTotal_away;
    private Double offsidesAVG_overall;
    private Double offsidesAVG_home;
    private Double offsidesAVG_away;
    private Integer offsidesOver05_overall;
    private Integer offsidesOver15_overall;
    private Integer offsidesOver25_overall;
    private Integer offsidesOver35_overall;
    private Integer offsidesOver45_overall;
    private Integer offsidesOver55_overall;
    private Integer offsidesOver65_overall;
    private Integer offsidesOver05_home;
    private Integer offsidesOver15_home;
    private Integer offsidesOver25_home;
    private Integer offsidesOver35_home;
    private Integer offsidesOver45_home;
    private Integer offsidesOver55_home;
    private Integer offsidesOver65_home;
    private Integer offsidesOver05_away;
    private Integer offsidesOver15_away;
    private Integer offsidesOver25_away;
    private Integer offsidesOver35_away;
    private Integer offsidesOver45_away;
    private Integer offsidesOver55_away;
    private Integer offsidesOver65_away;
    private Integer offsidesFor_overall;
    private Integer dangerous_attacks_num_overall;
    private Integer attacks_num_overall;
    private Double dangerous_attacks_avg_overall;
    private Double dangerous_attacks_avg_home;
    private Double dangerous_attacks_avg_away;
    private Double attacks_avg_overall;
    private Double attacks_avg_home;
    private Double attacks_avg_away;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id", referencedColumnName = "stats_id")
    private List<TeamStatsPercentage> teamStatsPercentages;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id", referencedColumnName = "stats_id")
    private List<TeamCorners> teamCornerStats;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stats_id", referencedColumnName = "stats_id")
    private List<TeamGoals> teamGoalStats;
    public TeamStats() {
    }

    public TeamStats(Long stats_id, Integer suspended_matches, Integer homeAttackAdvantage, Integer homeDefenceAdvantage, Integer homeOverallAdvantage, Integer seasonWinsNum_overall, Integer seasonWinsNum_home, Integer seasonWinsNum_away, Integer seasonDrawsNum_overall, Integer seasonDrawsNum_home, Integer seasonDrawsNum_away, Integer seasonLossesNum_overall, Integer seasonLossesNum_home, Integer seasonLossesNum_away, Integer seasonMatchesPlayed_overall, Integer seasonMatchesPlayed_home, Integer seasonMatchesPlayed_away, Double seasonPPG_overall, Double seasonRecentPPG, Double seasonPPG_home, Double seasonPPG_away, String currentFormHome, String currentFormAway, Integer leadingAtHT_overall, Integer leadingAtHT_home, Integer leadingAtHT_away, Integer drawingAtHT_home, Integer drawingAtHT_away, Integer drawingAtHT_overall, Integer trailingAtHT_home, Integer trailingAtHT_away, Integer trailingAtHT_overall, Integer HTPoints_overall, Integer HTPoints_home, Integer HTPoints_away, Double HTPPG_overall, Double HTPPG_home, Double HTPPG_away, Integer over05Cards_overall, Integer over15Cards_overall, Integer over25Cards_overall, Integer over35Cards_overall, Integer over45Cards_overall, Integer over55Cards_overall, Integer over65Cards_overall, Integer over75Cards_overall, Integer over85Cards_overall, Integer over05Cards_home, Integer over15Cards_home, Integer over35Cards_home, Integer over45Cards_home, Integer over55Cards_home, Integer over65Cards_home, Integer over75Cards_home, Integer over85Cards_home, Integer over05Cards_away, Integer over15Cards_away, Integer over25Cards_away, Integer over35Cards_away, Integer over45Cards_away, Integer over55Cards_away, Integer over65Cards_away, Integer over75Cards_away, Integer over85Cards_away, Integer over05CardsFor_overall, Integer over15CardsFor_overall, Integer over25CardsFor_overall, Integer over35CardsFor_overall, Integer over45CardsFor_overall, Integer over55CardsFor_overall, Integer over65CardsFor_overall, Integer over05CardsFor_home, Integer over15CardsFor_home, Integer over25CardsFor_home, Integer over35CardsFor_home, Integer over45CardsFor_home, Integer over55CardsFor_home, Integer over65CardsFor_home, Integer over05CardsFor_away, Integer over15CardsFor_away, Integer over25CardsFor_away, Integer over35CardsFor_away, Integer over45CardsFor_away, Integer over55CardsFor_away, Integer over65CardsFor_away, Integer over05CardsAgainst_overall, Integer over15CardsAgainst_overall, Integer over25CardsAgainst_overall, Integer over35CardsAgainst_overall, Integer over45CardsAgainst_overall, Integer over55CardsAgainst_overall, Integer over65CardsAgainst_overall, Integer over05CardsAgainst_home, Integer over15CardsAgainst_home, Integer over25CardsAgainst_home, Integer over35CardsAgainst_home, Integer over45CardsAgainst_home, Integer over55CardsAgainst_home, Integer over65CardsAgainst_home, Integer over05CardsAgainst_away, Integer over15CardsAgainst_away, Integer over25CardsAgainst_away, Integer over35CardsAgainst_away, Integer over45CardsAgainst_away, Integer over55CardsAgainst_away, Integer over65CardsAgainst_away, Integer leaguePosition_overall, Integer leaguePosition_home, Integer leaguePosition_away, Integer cardsTotal_overall, Integer cardsTotal_home, Integer cardsTotal_away, Integer cardsHighest_overall, Integer cardsLowest_overall, Double cardsAVG_overall, Double cardsAVG_home, Double cardsAVG_away, Integer shotsTotal_overall, Integer shotsTotal_home, Integer shotsTotal_away, Double shotsAVG_overall, Double shotsAVG_home, Double shotsAVG_away, Integer shotsOnTargetTotal_overall, Integer shotsOnTargetTotal_home, Integer shotsOnTargetTotal_away, Integer shotsOffTargetTotal_overall, Integer shotsOffTargetTotal_home, Integer shotsOffTargetTotal_away, Double shotsOnTargetAVG_overall, Double shotsOnTargetAVG_home, Double shotsOnTargetAVG_away, Double shotsOffTargetAVG_overall, Double shotsOffTargetAVG_home, Double shotsOffTargetAVG_away, Double possessionAVG_overall, Double possessionAVG_home, Double possessionAVG_away, Double foulsAVG_overall, Double foulsAVG_home, Double foulsAVG_away, Integer foulsTotal_overall, Integer foulsTotal_home, Integer foulsTotal_away, Integer offsidesTotal_overall, Integer offsidesTotal_home, Integer offsidesTotal_away, Double offsidesAVG_overall, Double offsidesAVG_home, Double offsidesAVG_away, Integer offsidesOver05_overall, Integer offsidesOver15_overall, Integer offsidesOver25_overall, Integer offsidesOver35_overall, Integer offsidesOver45_overall, Integer offsidesOver55_overall, Integer offsidesOver65_overall, Integer offsidesOver05_home, Integer offsidesOver15_home, Integer offsidesOver25_home, Integer offsidesOver35_home, Integer offsidesOver45_home, Integer offsidesOver55_home, Integer offsidesOver65_home, Integer offsidesOver05_away, Integer offsidesOver15_away, Integer offsidesOver25_away, Integer offsidesOver35_away, Integer offsidesOver45_away, Integer offsidesOver55_away, Integer offsidesOver65_away, Integer offsidesFor_overall, Integer dangerous_attacks_num_overall, Integer attacks_num_overall, Double dangerous_attacks_avg_overall, Double dangerous_attacks_avg_home, Double dangerous_attacks_avg_away, Double attacks_avg_overall, Double attacks_avg_home, Double attacks_avg_away, List<TeamStatsPercentage> teamStatsPercentages, List<TeamCorners> teamCornerStats, List<TeamGoals> teamGoalStats) {
        this.stats_id = stats_id;
        this.suspended_matches = suspended_matches;
        this.homeAttackAdvantage = homeAttackAdvantage;
        this.homeDefenceAdvantage = homeDefenceAdvantage;
        this.homeOverallAdvantage = homeOverallAdvantage;
        this.seasonWinsNum_overall = seasonWinsNum_overall;
        this.seasonWinsNum_home = seasonWinsNum_home;
        this.seasonWinsNum_away = seasonWinsNum_away;
        this.seasonDrawsNum_overall = seasonDrawsNum_overall;
        this.seasonDrawsNum_home = seasonDrawsNum_home;
        this.seasonDrawsNum_away = seasonDrawsNum_away;
        this.seasonLossesNum_overall = seasonLossesNum_overall;
        this.seasonLossesNum_home = seasonLossesNum_home;
        this.seasonLossesNum_away = seasonLossesNum_away;
        this.seasonMatchesPlayed_overall = seasonMatchesPlayed_overall;
        this.seasonMatchesPlayed_home = seasonMatchesPlayed_home;
        this.seasonMatchesPlayed_away = seasonMatchesPlayed_away;
        this.seasonPPG_overall = seasonPPG_overall;
        this.seasonRecentPPG = seasonRecentPPG;
        this.seasonPPG_home = seasonPPG_home;
        this.seasonPPG_away = seasonPPG_away;
        this.currentFormHome = currentFormHome;
        this.currentFormAway = currentFormAway;
        this.leadingAtHT_overall = leadingAtHT_overall;
        this.leadingAtHT_home = leadingAtHT_home;
        this.leadingAtHT_away = leadingAtHT_away;
        this.drawingAtHT_home = drawingAtHT_home;
        this.drawingAtHT_away = drawingAtHT_away;
        this.drawingAtHT_overall = drawingAtHT_overall;
        this.trailingAtHT_home = trailingAtHT_home;
        this.trailingAtHT_away = trailingAtHT_away;
        this.trailingAtHT_overall = trailingAtHT_overall;
        this.HTPoints_overall = HTPoints_overall;
        this.HTPoints_home = HTPoints_home;
        this.HTPoints_away = HTPoints_away;
        this.HTPPG_overall = HTPPG_overall;
        this.HTPPG_home = HTPPG_home;
        this.HTPPG_away = HTPPG_away;
        this.over05Cards_overall = over05Cards_overall;
        this.over15Cards_overall = over15Cards_overall;
        this.over25Cards_overall = over25Cards_overall;
        this.over35Cards_overall = over35Cards_overall;
        this.over45Cards_overall = over45Cards_overall;
        this.over55Cards_overall = over55Cards_overall;
        this.over65Cards_overall = over65Cards_overall;
        this.over75Cards_overall = over75Cards_overall;
        this.over85Cards_overall = over85Cards_overall;
        this.over05Cards_home = over05Cards_home;
        this.over15Cards_home = over15Cards_home;
        this.over35Cards_home = over35Cards_home;
        this.over45Cards_home = over45Cards_home;
        this.over55Cards_home = over55Cards_home;
        this.over65Cards_home = over65Cards_home;
        this.over75Cards_home = over75Cards_home;
        this.over85Cards_home = over85Cards_home;
        this.over05Cards_away = over05Cards_away;
        this.over15Cards_away = over15Cards_away;
        this.over25Cards_away = over25Cards_away;
        this.over35Cards_away = over35Cards_away;
        this.over45Cards_away = over45Cards_away;
        this.over55Cards_away = over55Cards_away;
        this.over65Cards_away = over65Cards_away;
        this.over75Cards_away = over75Cards_away;
        this.over85Cards_away = over85Cards_away;
        this.over05CardsFor_overall = over05CardsFor_overall;
        this.over15CardsFor_overall = over15CardsFor_overall;
        this.over25CardsFor_overall = over25CardsFor_overall;
        this.over35CardsFor_overall = over35CardsFor_overall;
        this.over45CardsFor_overall = over45CardsFor_overall;
        this.over55CardsFor_overall = over55CardsFor_overall;
        this.over65CardsFor_overall = over65CardsFor_overall;
        this.over05CardsFor_home = over05CardsFor_home;
        this.over15CardsFor_home = over15CardsFor_home;
        this.over25CardsFor_home = over25CardsFor_home;
        this.over35CardsFor_home = over35CardsFor_home;
        this.over45CardsFor_home = over45CardsFor_home;
        this.over55CardsFor_home = over55CardsFor_home;
        this.over65CardsFor_home = over65CardsFor_home;
        this.over05CardsFor_away = over05CardsFor_away;
        this.over15CardsFor_away = over15CardsFor_away;
        this.over25CardsFor_away = over25CardsFor_away;
        this.over35CardsFor_away = over35CardsFor_away;
        this.over45CardsFor_away = over45CardsFor_away;
        this.over55CardsFor_away = over55CardsFor_away;
        this.over65CardsFor_away = over65CardsFor_away;
        this.over05CardsAgainst_overall = over05CardsAgainst_overall;
        this.over15CardsAgainst_overall = over15CardsAgainst_overall;
        this.over25CardsAgainst_overall = over25CardsAgainst_overall;
        this.over35CardsAgainst_overall = over35CardsAgainst_overall;
        this.over45CardsAgainst_overall = over45CardsAgainst_overall;
        this.over55CardsAgainst_overall = over55CardsAgainst_overall;
        this.over65CardsAgainst_overall = over65CardsAgainst_overall;
        this.over05CardsAgainst_home = over05CardsAgainst_home;
        this.over15CardsAgainst_home = over15CardsAgainst_home;
        this.over25CardsAgainst_home = over25CardsAgainst_home;
        this.over35CardsAgainst_home = over35CardsAgainst_home;
        this.over45CardsAgainst_home = over45CardsAgainst_home;
        this.over55CardsAgainst_home = over55CardsAgainst_home;
        this.over65CardsAgainst_home = over65CardsAgainst_home;
        this.over05CardsAgainst_away = over05CardsAgainst_away;
        this.over15CardsAgainst_away = over15CardsAgainst_away;
        this.over25CardsAgainst_away = over25CardsAgainst_away;
        this.over35CardsAgainst_away = over35CardsAgainst_away;
        this.over45CardsAgainst_away = over45CardsAgainst_away;
        this.over55CardsAgainst_away = over55CardsAgainst_away;
        this.over65CardsAgainst_away = over65CardsAgainst_away;
        this.leaguePosition_overall = leaguePosition_overall;
        this.leaguePosition_home = leaguePosition_home;
        this.leaguePosition_away = leaguePosition_away;
        this.cardsTotal_overall = cardsTotal_overall;
        this.cardsTotal_home = cardsTotal_home;
        this.cardsTotal_away = cardsTotal_away;
        this.cardsHighest_overall = cardsHighest_overall;
        this.cardsLowest_overall = cardsLowest_overall;
        this.cardsAVG_overall = cardsAVG_overall;
        this.cardsAVG_home = cardsAVG_home;
        this.cardsAVG_away = cardsAVG_away;
        this.shotsTotal_overall = shotsTotal_overall;
        this.shotsTotal_home = shotsTotal_home;
        this.shotsTotal_away = shotsTotal_away;
        this.shotsAVG_overall = shotsAVG_overall;
        this.shotsAVG_home = shotsAVG_home;
        this.shotsAVG_away = shotsAVG_away;
        this.shotsOnTargetTotal_overall = shotsOnTargetTotal_overall;
        this.shotsOnTargetTotal_home = shotsOnTargetTotal_home;
        this.shotsOnTargetTotal_away = shotsOnTargetTotal_away;
        this.shotsOffTargetTotal_overall = shotsOffTargetTotal_overall;
        this.shotsOffTargetTotal_home = shotsOffTargetTotal_home;
        this.shotsOffTargetTotal_away = shotsOffTargetTotal_away;
        this.shotsOnTargetAVG_overall = shotsOnTargetAVG_overall;
        this.shotsOnTargetAVG_home = shotsOnTargetAVG_home;
        this.shotsOnTargetAVG_away = shotsOnTargetAVG_away;
        this.shotsOffTargetAVG_overall = shotsOffTargetAVG_overall;
        this.shotsOffTargetAVG_home = shotsOffTargetAVG_home;
        this.shotsOffTargetAVG_away = shotsOffTargetAVG_away;
        this.possessionAVG_overall = possessionAVG_overall;
        this.possessionAVG_home = possessionAVG_home;
        this.possessionAVG_away = possessionAVG_away;
        this.foulsAVG_overall = foulsAVG_overall;
        this.foulsAVG_home = foulsAVG_home;
        this.foulsAVG_away = foulsAVG_away;
        this.foulsTotal_overall = foulsTotal_overall;
        this.foulsTotal_home = foulsTotal_home;
        this.foulsTotal_away = foulsTotal_away;
        this.offsidesTotal_overall = offsidesTotal_overall;
        this.offsidesTotal_home = offsidesTotal_home;
        this.offsidesTotal_away = offsidesTotal_away;
        this.offsidesAVG_overall = offsidesAVG_overall;
        this.offsidesAVG_home = offsidesAVG_home;
        this.offsidesAVG_away = offsidesAVG_away;
        this.offsidesOver05_overall = offsidesOver05_overall;
        this.offsidesOver15_overall = offsidesOver15_overall;
        this.offsidesOver25_overall = offsidesOver25_overall;
        this.offsidesOver35_overall = offsidesOver35_overall;
        this.offsidesOver45_overall = offsidesOver45_overall;
        this.offsidesOver55_overall = offsidesOver55_overall;
        this.offsidesOver65_overall = offsidesOver65_overall;
        this.offsidesOver05_home = offsidesOver05_home;
        this.offsidesOver15_home = offsidesOver15_home;
        this.offsidesOver25_home = offsidesOver25_home;
        this.offsidesOver35_home = offsidesOver35_home;
        this.offsidesOver45_home = offsidesOver45_home;
        this.offsidesOver55_home = offsidesOver55_home;
        this.offsidesOver65_home = offsidesOver65_home;
        this.offsidesOver05_away = offsidesOver05_away;
        this.offsidesOver15_away = offsidesOver15_away;
        this.offsidesOver25_away = offsidesOver25_away;
        this.offsidesOver35_away = offsidesOver35_away;
        this.offsidesOver45_away = offsidesOver45_away;
        this.offsidesOver55_away = offsidesOver55_away;
        this.offsidesOver65_away = offsidesOver65_away;
        this.offsidesFor_overall = offsidesFor_overall;
        this.dangerous_attacks_num_overall = dangerous_attacks_num_overall;
        this.attacks_num_overall = attacks_num_overall;
        this.dangerous_attacks_avg_overall = dangerous_attacks_avg_overall;
        this.dangerous_attacks_avg_home = dangerous_attacks_avg_home;
        this.dangerous_attacks_avg_away = dangerous_attacks_avg_away;
        this.attacks_avg_overall = attacks_avg_overall;
        this.attacks_avg_home = attacks_avg_home;
        this.attacks_avg_away = attacks_avg_away;
        this.teamStatsPercentages = teamStatsPercentages;
        this.teamCornerStats = teamCornerStats;
        this.teamGoalStats = teamGoalStats;
    }

    public TeamStats(Integer suspended_matches, Integer homeAttackAdvantage, Integer homeDefenceAdvantage, Integer homeOverallAdvantage, Integer seasonWinsNum_overall, Integer seasonWinsNum_home, Integer seasonWinsNum_away, Integer seasonDrawsNum_overall, Integer seasonDrawsNum_home, Integer seasonDrawsNum_away, Integer seasonLossesNum_overall, Integer seasonLossesNum_home, Integer seasonLossesNum_away, Integer seasonMatchesPlayed_overall, Integer seasonMatchesPlayed_home, Integer seasonMatchesPlayed_away, Double seasonPPG_overall, Double seasonRecentPPG, Double seasonPPG_home, Double seasonPPG_away, String currentFormHome, String currentFormAway, Integer leadingAtHT_overall, Integer leadingAtHT_home, Integer leadingAtHT_away, Integer drawingAtHT_home, Integer drawingAtHT_away, Integer drawingAtHT_overall, Integer trailingAtHT_home, Integer trailingAtHT_away, Integer trailingAtHT_overall, Integer HTPoints_overall, Integer HTPoints_home, Integer HTPoints_away, Double HTPPG_overall, Double HTPPG_home, Double HTPPG_away, Integer over05Cards_overall, Integer over15Cards_overall, Integer over25Cards_overall, Integer over35Cards_overall, Integer over45Cards_overall, Integer over55Cards_overall, Integer over65Cards_overall, Integer over75Cards_overall, Integer over85Cards_overall, Integer over05Cards_home, Integer over15Cards_home, Integer over35Cards_home, Integer over45Cards_home, Integer over55Cards_home, Integer over65Cards_home, Integer over75Cards_home, Integer over85Cards_home, Integer over05Cards_away, Integer over15Cards_away, Integer over25Cards_away, Integer over35Cards_away, Integer over45Cards_away, Integer over55Cards_away, Integer over65Cards_away, Integer over75Cards_away, Integer over85Cards_away, Integer over05CardsFor_overall, Integer over15CardsFor_overall, Integer over25CardsFor_overall, Integer over35CardsFor_overall, Integer over45CardsFor_overall, Integer over55CardsFor_overall, Integer over65CardsFor_overall, Integer over05CardsFor_home, Integer over15CardsFor_home, Integer over25CardsFor_home, Integer over35CardsFor_home, Integer over45CardsFor_home, Integer over55CardsFor_home, Integer over65CardsFor_home, Integer over05CardsFor_away, Integer over15CardsFor_away, Integer over25CardsFor_away, Integer over35CardsFor_away, Integer over45CardsFor_away, Integer over55CardsFor_away, Integer over65CardsFor_away, Integer over05CardsAgainst_overall, Integer over15CardsAgainst_overall, Integer over25CardsAgainst_overall, Integer over35CardsAgainst_overall, Integer over45CardsAgainst_overall, Integer over55CardsAgainst_overall, Integer over65CardsAgainst_overall, Integer over05CardsAgainst_home, Integer over15CardsAgainst_home, Integer over25CardsAgainst_home, Integer over35CardsAgainst_home, Integer over45CardsAgainst_home, Integer over55CardsAgainst_home, Integer over65CardsAgainst_home, Integer over05CardsAgainst_away, Integer over15CardsAgainst_away, Integer over25CardsAgainst_away, Integer over35CardsAgainst_away, Integer over45CardsAgainst_away, Integer over55CardsAgainst_away, Integer over65CardsAgainst_away, Integer leaguePosition_overall, Integer leaguePosition_home, Integer leaguePosition_away, Integer cardsTotal_overall, Integer cardsTotal_home, Integer cardsTotal_away, Integer cardsHighest_overall, Integer cardsLowest_overall, Double cardsAVG_overall, Double cardsAVG_home, Double cardsAVG_away, Integer shotsTotal_overall, Integer shotsTotal_home, Integer shotsTotal_away, Double shotsAVG_overall, Double shotsAVG_home, Double shotsAVG_away, Integer shotsOnTargetTotal_overall, Integer shotsOnTargetTotal_home, Integer shotsOnTargetTotal_away, Integer shotsOffTargetTotal_overall, Integer shotsOffTargetTotal_home, Integer shotsOffTargetTotal_away, Double shotsOnTargetAVG_overall, Double shotsOnTargetAVG_home, Double shotsOnTargetAVG_away, Double shotsOffTargetAVG_overall, Double shotsOffTargetAVG_home, Double shotsOffTargetAVG_away, Double possessionAVG_overall, Double possessionAVG_home, Double possessionAVG_away, Double foulsAVG_overall, Double foulsAVG_home, Double foulsAVG_away, Integer foulsTotal_overall, Integer foulsTotal_home, Integer foulsTotal_away, Integer offsidesTotal_overall, Integer offsidesTotal_home, Integer offsidesTotal_away, Double offsidesAVG_overall, Double offsidesAVG_home, Double offsidesAVG_away, Integer offsidesOver05_overall, Integer offsidesOver15_overall, Integer offsidesOver25_overall, Integer offsidesOver35_overall, Integer offsidesOver45_overall, Integer offsidesOver55_overall, Integer offsidesOver65_overall, Integer offsidesOver05_home, Integer offsidesOver15_home, Integer offsidesOver25_home, Integer offsidesOver35_home, Integer offsidesOver45_home, Integer offsidesOver55_home, Integer offsidesOver65_home, Integer offsidesOver05_away, Integer offsidesOver15_away, Integer offsidesOver25_away, Integer offsidesOver35_away, Integer offsidesOver45_away, Integer offsidesOver55_away, Integer offsidesOver65_away, Integer offsidesFor_overall, Integer dangerous_attacks_num_overall, Integer attacks_num_overall, Double dangerous_attacks_avg_overall, Double dangerous_attacks_avg_home, Double dangerous_attacks_avg_away, Double attacks_avg_overall, Double attacks_avg_home, Double attacks_avg_away, List<TeamStatsPercentage> teamStatsPercentages, List<TeamCorners> teamCornerStats, List<TeamGoals> teamGoalStats) {
        this.suspended_matches = suspended_matches;
        this.homeAttackAdvantage = homeAttackAdvantage;
        this.homeDefenceAdvantage = homeDefenceAdvantage;
        this.homeOverallAdvantage = homeOverallAdvantage;
        this.seasonWinsNum_overall = seasonWinsNum_overall;
        this.seasonWinsNum_home = seasonWinsNum_home;
        this.seasonWinsNum_away = seasonWinsNum_away;
        this.seasonDrawsNum_overall = seasonDrawsNum_overall;
        this.seasonDrawsNum_home = seasonDrawsNum_home;
        this.seasonDrawsNum_away = seasonDrawsNum_away;
        this.seasonLossesNum_overall = seasonLossesNum_overall;
        this.seasonLossesNum_home = seasonLossesNum_home;
        this.seasonLossesNum_away = seasonLossesNum_away;
        this.seasonMatchesPlayed_overall = seasonMatchesPlayed_overall;
        this.seasonMatchesPlayed_home = seasonMatchesPlayed_home;
        this.seasonMatchesPlayed_away = seasonMatchesPlayed_away;
        this.seasonPPG_overall = seasonPPG_overall;
        this.seasonRecentPPG = seasonRecentPPG;
        this.seasonPPG_home = seasonPPG_home;
        this.seasonPPG_away = seasonPPG_away;
        this.currentFormHome = currentFormHome;
        this.currentFormAway = currentFormAway;
        this.leadingAtHT_overall = leadingAtHT_overall;
        this.leadingAtHT_home = leadingAtHT_home;
        this.leadingAtHT_away = leadingAtHT_away;
        this.drawingAtHT_home = drawingAtHT_home;
        this.drawingAtHT_away = drawingAtHT_away;
        this.drawingAtHT_overall = drawingAtHT_overall;
        this.trailingAtHT_home = trailingAtHT_home;
        this.trailingAtHT_away = trailingAtHT_away;
        this.trailingAtHT_overall = trailingAtHT_overall;
        this.HTPoints_overall = HTPoints_overall;
        this.HTPoints_home = HTPoints_home;
        this.HTPoints_away = HTPoints_away;
        this.HTPPG_overall = HTPPG_overall;
        this.HTPPG_home = HTPPG_home;
        this.HTPPG_away = HTPPG_away;
        this.over05Cards_overall = over05Cards_overall;
        this.over15Cards_overall = over15Cards_overall;
        this.over25Cards_overall = over25Cards_overall;
        this.over35Cards_overall = over35Cards_overall;
        this.over45Cards_overall = over45Cards_overall;
        this.over55Cards_overall = over55Cards_overall;
        this.over65Cards_overall = over65Cards_overall;
        this.over75Cards_overall = over75Cards_overall;
        this.over85Cards_overall = over85Cards_overall;
        this.over05Cards_home = over05Cards_home;
        this.over15Cards_home = over15Cards_home;
        this.over35Cards_home = over35Cards_home;
        this.over45Cards_home = over45Cards_home;
        this.over55Cards_home = over55Cards_home;
        this.over65Cards_home = over65Cards_home;
        this.over75Cards_home = over75Cards_home;
        this.over85Cards_home = over85Cards_home;
        this.over05Cards_away = over05Cards_away;
        this.over15Cards_away = over15Cards_away;
        this.over25Cards_away = over25Cards_away;
        this.over35Cards_away = over35Cards_away;
        this.over45Cards_away = over45Cards_away;
        this.over55Cards_away = over55Cards_away;
        this.over65Cards_away = over65Cards_away;
        this.over75Cards_away = over75Cards_away;
        this.over85Cards_away = over85Cards_away;
        this.over05CardsFor_overall = over05CardsFor_overall;
        this.over15CardsFor_overall = over15CardsFor_overall;
        this.over25CardsFor_overall = over25CardsFor_overall;
        this.over35CardsFor_overall = over35CardsFor_overall;
        this.over45CardsFor_overall = over45CardsFor_overall;
        this.over55CardsFor_overall = over55CardsFor_overall;
        this.over65CardsFor_overall = over65CardsFor_overall;
        this.over05CardsFor_home = over05CardsFor_home;
        this.over15CardsFor_home = over15CardsFor_home;
        this.over25CardsFor_home = over25CardsFor_home;
        this.over35CardsFor_home = over35CardsFor_home;
        this.over45CardsFor_home = over45CardsFor_home;
        this.over55CardsFor_home = over55CardsFor_home;
        this.over65CardsFor_home = over65CardsFor_home;
        this.over05CardsFor_away = over05CardsFor_away;
        this.over15CardsFor_away = over15CardsFor_away;
        this.over25CardsFor_away = over25CardsFor_away;
        this.over35CardsFor_away = over35CardsFor_away;
        this.over45CardsFor_away = over45CardsFor_away;
        this.over55CardsFor_away = over55CardsFor_away;
        this.over65CardsFor_away = over65CardsFor_away;
        this.over05CardsAgainst_overall = over05CardsAgainst_overall;
        this.over15CardsAgainst_overall = over15CardsAgainst_overall;
        this.over25CardsAgainst_overall = over25CardsAgainst_overall;
        this.over35CardsAgainst_overall = over35CardsAgainst_overall;
        this.over45CardsAgainst_overall = over45CardsAgainst_overall;
        this.over55CardsAgainst_overall = over55CardsAgainst_overall;
        this.over65CardsAgainst_overall = over65CardsAgainst_overall;
        this.over05CardsAgainst_home = over05CardsAgainst_home;
        this.over15CardsAgainst_home = over15CardsAgainst_home;
        this.over25CardsAgainst_home = over25CardsAgainst_home;
        this.over35CardsAgainst_home = over35CardsAgainst_home;
        this.over45CardsAgainst_home = over45CardsAgainst_home;
        this.over55CardsAgainst_home = over55CardsAgainst_home;
        this.over65CardsAgainst_home = over65CardsAgainst_home;
        this.over05CardsAgainst_away = over05CardsAgainst_away;
        this.over15CardsAgainst_away = over15CardsAgainst_away;
        this.over25CardsAgainst_away = over25CardsAgainst_away;
        this.over35CardsAgainst_away = over35CardsAgainst_away;
        this.over45CardsAgainst_away = over45CardsAgainst_away;
        this.over55CardsAgainst_away = over55CardsAgainst_away;
        this.over65CardsAgainst_away = over65CardsAgainst_away;
        this.leaguePosition_overall = leaguePosition_overall;
        this.leaguePosition_home = leaguePosition_home;
        this.leaguePosition_away = leaguePosition_away;
        this.cardsTotal_overall = cardsTotal_overall;
        this.cardsTotal_home = cardsTotal_home;
        this.cardsTotal_away = cardsTotal_away;
        this.cardsHighest_overall = cardsHighest_overall;
        this.cardsLowest_overall = cardsLowest_overall;
        this.cardsAVG_overall = cardsAVG_overall;
        this.cardsAVG_home = cardsAVG_home;
        this.cardsAVG_away = cardsAVG_away;
        this.shotsTotal_overall = shotsTotal_overall;
        this.shotsTotal_home = shotsTotal_home;
        this.shotsTotal_away = shotsTotal_away;
        this.shotsAVG_overall = shotsAVG_overall;
        this.shotsAVG_home = shotsAVG_home;
        this.shotsAVG_away = shotsAVG_away;
        this.shotsOnTargetTotal_overall = shotsOnTargetTotal_overall;
        this.shotsOnTargetTotal_home = shotsOnTargetTotal_home;
        this.shotsOnTargetTotal_away = shotsOnTargetTotal_away;
        this.shotsOffTargetTotal_overall = shotsOffTargetTotal_overall;
        this.shotsOffTargetTotal_home = shotsOffTargetTotal_home;
        this.shotsOffTargetTotal_away = shotsOffTargetTotal_away;
        this.shotsOnTargetAVG_overall = shotsOnTargetAVG_overall;
        this.shotsOnTargetAVG_home = shotsOnTargetAVG_home;
        this.shotsOnTargetAVG_away = shotsOnTargetAVG_away;
        this.shotsOffTargetAVG_overall = shotsOffTargetAVG_overall;
        this.shotsOffTargetAVG_home = shotsOffTargetAVG_home;
        this.shotsOffTargetAVG_away = shotsOffTargetAVG_away;
        this.possessionAVG_overall = possessionAVG_overall;
        this.possessionAVG_home = possessionAVG_home;
        this.possessionAVG_away = possessionAVG_away;
        this.foulsAVG_overall = foulsAVG_overall;
        this.foulsAVG_home = foulsAVG_home;
        this.foulsAVG_away = foulsAVG_away;
        this.foulsTotal_overall = foulsTotal_overall;
        this.foulsTotal_home = foulsTotal_home;
        this.foulsTotal_away = foulsTotal_away;
        this.offsidesTotal_overall = offsidesTotal_overall;
        this.offsidesTotal_home = offsidesTotal_home;
        this.offsidesTotal_away = offsidesTotal_away;
        this.offsidesAVG_overall = offsidesAVG_overall;
        this.offsidesAVG_home = offsidesAVG_home;
        this.offsidesAVG_away = offsidesAVG_away;
        this.offsidesOver05_overall = offsidesOver05_overall;
        this.offsidesOver15_overall = offsidesOver15_overall;
        this.offsidesOver25_overall = offsidesOver25_overall;
        this.offsidesOver35_overall = offsidesOver35_overall;
        this.offsidesOver45_overall = offsidesOver45_overall;
        this.offsidesOver55_overall = offsidesOver55_overall;
        this.offsidesOver65_overall = offsidesOver65_overall;
        this.offsidesOver05_home = offsidesOver05_home;
        this.offsidesOver15_home = offsidesOver15_home;
        this.offsidesOver25_home = offsidesOver25_home;
        this.offsidesOver35_home = offsidesOver35_home;
        this.offsidesOver45_home = offsidesOver45_home;
        this.offsidesOver55_home = offsidesOver55_home;
        this.offsidesOver65_home = offsidesOver65_home;
        this.offsidesOver05_away = offsidesOver05_away;
        this.offsidesOver15_away = offsidesOver15_away;
        this.offsidesOver25_away = offsidesOver25_away;
        this.offsidesOver35_away = offsidesOver35_away;
        this.offsidesOver45_away = offsidesOver45_away;
        this.offsidesOver55_away = offsidesOver55_away;
        this.offsidesOver65_away = offsidesOver65_away;
        this.offsidesFor_overall = offsidesFor_overall;
        this.dangerous_attacks_num_overall = dangerous_attacks_num_overall;
        this.attacks_num_overall = attacks_num_overall;
        this.dangerous_attacks_avg_overall = dangerous_attacks_avg_overall;
        this.dangerous_attacks_avg_home = dangerous_attacks_avg_home;
        this.dangerous_attacks_avg_away = dangerous_attacks_avg_away;
        this.attacks_avg_overall = attacks_avg_overall;
        this.attacks_avg_home = attacks_avg_home;
        this.attacks_avg_away = attacks_avg_away;
        this.teamStatsPercentages = teamStatsPercentages;
        this.teamCornerStats = teamCornerStats;
        this.teamGoalStats = teamGoalStats;
    }
}
