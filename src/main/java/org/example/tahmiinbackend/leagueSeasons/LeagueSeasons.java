package org.example.tahmiinbackend.leagueSeasons;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@Entity
@AllArgsConstructor
@Table
@JsonIgnoreProperties({"name_jp",
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
        "seasonGoalsScored_home_teams",
        "seasonGoalsScored_away_teams",
        "seasonConceded_home_teams",
        "seasonConceded_away_teams",
})
public class LeagueSeasons {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "league_seasons_sequence")
    @SequenceGenerator(name = "league_seasons_sequence", sequenceName = "league_sequence", allocationSize = 1)
    private Long league_seasons_id;
    private Long id;
    private String tsapi_id;
    private String name;
    private String english_name;
    private String name_tr;
    private String country;
    private Integer domestic_scale;
    private Integer international_scale;
    private String status;
    private String format;
    private Integer division;
    private String no_home_away;
    private Integer starting_year;
    private Integer ending_year;
    private Integer women;
    private String continent;
    private Long comp_master_id;
    private String image;
    private Integer clubNum;
    private String season;
    private Integer goalTimingDisabled;
    private Integer totalMatches;
    private Integer matchesCompleted;
    private Integer canceledMatchesNum;
    private Integer game_week;
    private Integer total_game_week;
    private Integer round;
    private Integer progress;
    private Integer total_goals;
    private Integer home_teams_goals;
    private Integer home_teams_conceded;
    private Integer away_teams_goals;
    private Integer away_teams_conceded;
    private Double seasonAVG_overall;
    private Double seasonAVG_home;
    private Double seasonAVG_away;
    private Integer btts_matches;
    private Integer seasonBTTSPercentage;
    private Integer seasonCSPercentage;
    private Integer home_teams_clean_sheets;
    private Integer away_teams_clean_sheets;
    private Integer home_teams_failed_to_score;
    private Integer away_teams_failed_to_score;
    private Integer riskNum;
    private Integer homeAttackAdvantagePercentage;
    private Integer homeDefenceAdvantagePercentage;
    private Integer homeOverallAdvantage;
    private Double cornersAVG_overall;
    private Double cornersAVG_home;
    private Double cornersAVG_away;
    private Integer cornersTotal_overall;
    private Integer cornersTotal_home;
    private Integer cornersTotal_away;
    private Double cardsAVG_overall;
    private Double cardsAVG_home;
    private Double cardsAVG_away;
    private Integer cardsTotal_overall;
    private Integer cardsTotal_home;
    private Integer cardsTotal_away;
    private Integer foulsTotal_overall;
    private Integer foulsTotal_home;
    private Integer foulsTotal_away;
    private Double foulsAVG_overall;
    private Double foulsAVG_home;
    private Double foulsAVG_away;
    private Integer shotsTotal_overall;
    private Integer shotsTotal_home;
    private Integer shotsTotal_away;
    private Double shotsAVG_overall;
    private Double shotsAVG_home;
    private Double shotsAVG_away;
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
    private Integer over05OffsidesPercentage_overall;
    private Integer over15OffsidesPercentage_overall;
    private Integer over25OffsidesPercentage_overall;
    private Integer over35OffsidesPercentage_overall;
    private Integer over45OffsidesPercentage_overall;
    private Integer over55OffsidesPercentage_overall;
    private Integer over65OffsidesPercentage_overall;
    private Integer seasonOver05Percentage_overall;
    private Integer seasonOver15Percentage_overall;
    private Integer seasonOver25Percentage_overall;
    private Integer seasonOver35Percentage_overall;
    private Integer seasonOver45Percentage_overall;
    private Integer seasonOver55Percentage_overall;
    private Integer seasonUnder05Percentage_overall;
    private Integer seasonUnder15Percentage_overall;
    private Integer seasonUnder25Percentage_overall;
    private Integer seasonUnder35Percentage_overall;
    private Integer seasonUnder45Percentage_overall;
    private Integer seasonUnder55Percentage_overall;
    private Integer cornersRecorded_matches;
    private Integer cardsRecorded_matches;
    private Integer offsidesRecorded_matches;
    private Integer over65Corners_overall;
    private Integer over75Corners_overall;
    private Integer over85Corners_overall;
    private Integer over95Corners_overall;
    private Integer over105Corners_overall;
    private Integer over115Corners_overall;
    private Integer over125Corners_overall;
    private Integer over135Corners_overall; // Burada bir yazım hatası var, düzeltildi
    private Integer over145Corners_overall;
    private Integer over65CornersPercentage_overall;
    private Integer over75CornersPercentage_overall;
    private Integer over85CornersPercentage_overall;
    private Integer over95CornersPercentage_overall;
    private Integer over105CornersPercentage_overall;
    private Integer over115CornersPercentage_overall;
    private Integer over125CornersPercentage_overall;
    private Integer over135CornersPercentage_overall;
    private Integer over145CornersPercentage_overall;
    private Integer over05Cards_overall;
    private Integer over15Cards_overall;
    private Integer over25Cards_overall;
    private Integer over35Cards_overall;
    private Integer over45Cards_overall;
    private Integer over55Cards_overall;
    private Integer over65Cards_overall;
    private Integer over75Cards_overall;
    private Integer over05CardsPercentage_overall;
    private Integer over15CardsPercentage_overall;
    private Integer over25CardsPercentage_overall;
    private Integer over35CardsPercentage_overall;
    private Integer over45CardsPercentage_overall;
    private Integer over55CardsPercentage_overall;
    private Integer over65CardsPercentage_overall;
    private Integer over75CardsPercentage_overall;
    private Integer homeWins;
    private Integer draws;
    private Integer awayWins;
    private Integer homeWinPercentage;
    private Integer drawPercentage;
    private Integer awayWinPercentage;
    private Integer shotsRecorded_matches;
    private Integer foulsRecorded_matches;
    private Integer failed_to_score_total;
    private Integer clean_sheets_total;
    private Integer round_format;
    private Integer goals_min_0_to_10;
    private Integer goals_min_11_to_20;
    private Integer goals_min_21_to_30;
    private Integer goals_min_31_to_40;
    private Integer goals_min_41_to_50;
    private Integer goals_min_51_to_60;
    private Integer goals_min_61_to_70;
    private Integer goals_min_71_to_80;
    private Integer goals_min_81_to_90;
    private Integer goals_min_0_to_15;
    private Integer goals_min_16_to_30;
    private Integer goals_min_31_to_45;
    private Integer goals_min_46_to_60;
    private Integer goals_min_61_to_75;
    private Integer goals_min_76_to_90;
    private Integer player_count;
    private Integer over05_fhg_num;
    private Integer over15_fhg_num;
    private Integer over25_fhg_num;
    private Integer over35_fhg_num;
    private Integer over05_fhg_percentage;
    private Integer over15_fhg_percentage;
    private Integer over25_fhg_percentage;
    private Integer over35_fhg_percentage;
    private Integer over05_2hg_num;
    private Integer over15_2hg_num;
    private Integer over25_2hg_num;
    private Integer over35_2hg_num;
    private Integer over05_2hg_percentage;
    private Integer over15_2hg_percentage;
    private Integer over25_2hg_percentage;
    private Integer over35_2hg_percentage;
    private Integer goalTimingsRecorded_num;
    private Integer averageAttendance;
    private Integer cornerTimingRecorded_matches;
    private Integer corners_fh_num;
    private Integer corners_2h_num;
    private Double corners_fh_avg;
    private Double corners_2h_avg;
    private Integer corners_fh_over4_num;
    private Integer corners_2h_over4_num;
    private Integer corners_fh_over4_percentage;
    private Integer corners_2h_over4_percentage;
    private Integer corners_fh_over5_num;
    private Integer corners_2h_over5_num;
    private Integer corners_fh_over5_percentage;
    private Integer corners_2h_over5_percentage;
    private Integer corners_fh_over6_num;
    private Integer corners_2h_over6_num;
    private Integer corners_fh_over6_percentage;
    private Integer corners_2h_over6_percentage;
    private Integer attack_num_recoded_matches;
    private Integer dangerous_attacks_num;
    private Integer attacks_num;
    private Double dangerous_attacks_avg;
    private Double attacks_avg;
    private Double xg_avg;
    private Integer possessions_recorded_matches;
    private String seasonOver05_num;
    private String seasonOver15_num;
    private String seasonOver25_num;
    private String seasonOver35_num;
    private String seasonOver45_num;
    private String seasonOver55_num;
    private String seasonUnder05_num;
    private String seasonUnder15_num;
    private String seasonUnder25_num;
    private String seasonUnder35_num;
    private String seasonUnder45_num;
    private String seasonUnder55_num;
    private String shortHand;
    private String db_english_name;
    private String iso;
    private String type;
    private String footystats_url;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "league_seasons_id", referencedColumnName = "league_seasons_id")
    private List<TopScorers> top_scorers;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "league_seasons_id", referencedColumnName = "league_seasons_id")
    private List<TopAssists> top_assists;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "league_seasons_id", referencedColumnName = "league_seasons_id")
    private List<TopCleanSheets> top_clean_sheets;

    public LeagueSeasons() {
    }

}
