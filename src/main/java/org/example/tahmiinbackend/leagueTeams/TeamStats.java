package org.example.tahmiinbackend.leagueTeams;

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


    public TeamStats() {
    }


}
