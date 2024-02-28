package org.example.tahmiinbackend.leagueSeasons;

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

    public LeagueSeasons(Long league_seasons_id, Long id, String tsapi_id, String name, String english_name, String name_tr, String country, Integer domestic_scale, Integer international_scale, String status, String format, Integer division, String no_home_away, Integer starting_year, Integer ending_year, Integer women, String continent, Long comp_master_id, String image, Integer clubNum, String season, Integer goalTimingDisabled, Integer totalMatches, Integer matchesCompleted, Integer canceledMatchesNum, Integer game_week, Integer total_game_week, Integer round, Integer progress, Integer total_goals, Integer home_teams_goals, Integer home_teams_conceded, Integer away_teams_goals, Integer away_teams_conceded, Double seasonAVG_overall, Double seasonAVG_home, Double seasonAVG_away, Integer btts_matches, Integer seasonBTTSPercentage, Integer seasonCSPercentage, Integer home_teams_clean_sheets, Integer away_teams_clean_sheets, Integer home_teams_failed_to_score, Integer away_teams_failed_to_score, Integer riskNum, Integer homeAttackAdvantagePercentage, Integer homeDefenceAdvantagePercentage, Integer homeOverallAdvantage, Double cornersAVG_overall, Double cornersAVG_home, Double cornersAVG_away, Integer cornersTotal_overall, Integer cornersTotal_home, Integer cornersTotal_away, Double cardsAVG_overall, Double cardsAVG_home, Double cardsAVG_away, Integer cardsTotal_overall, Integer cardsTotal_home, Integer cardsTotal_away, Integer foulsTotal_overall, Integer foulsTotal_home, Integer foulsTotal_away, Double foulsAVG_overall, Double foulsAVG_home, Double foulsAVG_away, Integer shotsTotal_overall, Integer shotsTotal_home, Integer shotsTotal_away, Double shotsAVG_overall, Double shotsAVG_home, Double shotsAVG_away, Integer offsidesTotal_overall, Integer offsidesTotal_home, Integer offsidesTotal_away, Double offsidesAVG_overall, Double offsidesAVG_home, Double offsidesAVG_away, Integer offsidesOver05_overall, Integer offsidesOver15_overall, Integer offsidesOver25_overall, Integer offsidesOver35_overall, Integer offsidesOver45_overall, Integer offsidesOver55_overall, Integer offsidesOver65_overall, Integer over05OffsidesPercentage_overall, Integer over15OffsidesPercentage_overall, Integer over25OffsidesPercentage_overall, Integer over35OffsidesPercentage_overall, Integer over45OffsidesPercentage_overall, Integer over55OffsidesPercentage_overall, Integer over65OffsidesPercentage_overall, Integer seasonOver05Percentage_overall, Integer seasonOver15Percentage_overall, Integer seasonOver25Percentage_overall, Integer seasonOver35Percentage_overall, Integer seasonOver45Percentage_overall, Integer seasonOver55Percentage_overall, Integer seasonUnder05Percentage_overall, Integer seasonUnder15Percentage_overall, Integer seasonUnder25Percentage_overall, Integer seasonUnder35Percentage_overall, Integer seasonUnder45Percentage_overall, Integer seasonUnder55Percentage_overall, Integer cornersRecorded_matches, Integer cardsRecorded_matches, Integer offsidesRecorded_matches, Integer over65Corners_overall, Integer over75Corners_overall, Integer over85Corners_overall, Integer over95Corners_overall, Integer over105Corners_overall, Integer over115Corners_overall, Integer over125Corners_overall, Integer over135Corners_overall, Integer over145Corners_overall, Integer over65CornersPercentage_overall, Integer over75CornersPercentage_overall, Integer over85CornersPercentage_overall, Integer over95CornersPercentage_overall, Integer over105CornersPercentage_overall, Integer over115CornersPercentage_overall, Integer over125CornersPercentage_overall, Integer over135CornersPercentage_overall, Integer over145CornersPercentage_overall, Integer over05Cards_overall, Integer over15Cards_overall, Integer over25Cards_overall, Integer over35Cards_overall, Integer over45Cards_overall, Integer over55Cards_overall, Integer over65Cards_overall, Integer over75Cards_overall, Integer over05CardsPercentage_overall, Integer over15CardsPercentage_overall, Integer over25CardsPercentage_overall, Integer over35CardsPercentage_overall, Integer over45CardsPercentage_overall, Integer over55CardsPercentage_overall, Integer over65CardsPercentage_overall, Integer over75CardsPercentage_overall, Integer homeWins, Integer draws, Integer awayWins, Integer homeWinPercentage, Integer drawPercentage, Integer awayWinPercentage, Integer shotsRecorded_matches, Integer foulsRecorded_matches, Integer failed_to_score_total, Integer clean_sheets_total, Integer round_format, Integer goals_min_0_to_10, Integer goals_min_11_to_20, Integer goals_min_21_to_30, Integer goals_min_31_to_40, Integer goals_min_41_to_50, Integer goals_min_51_to_60, Integer goals_min_61_to_70, Integer goals_min_71_to_80, Integer goals_min_81_to_90, Integer goals_min_0_to_15, Integer goals_min_16_to_30, Integer goals_min_31_to_45, Integer goals_min_46_to_60, Integer goals_min_61_to_75, Integer goals_min_76_to_90, Integer player_count, Integer over05_fhg_num, Integer over15_fhg_num, Integer over25_fhg_num, Integer over35_fhg_num, Integer over05_fhg_percentage, Integer over15_fhg_percentage, Integer over25_fhg_percentage, Integer over35_fhg_percentage, Integer over05_2hg_num, Integer over15_2hg_num, Integer over25_2hg_num, Integer over35_2hg_num, Integer over05_2hg_percentage, Integer over15_2hg_percentage, Integer over25_2hg_percentage, Integer over35_2hg_percentage, Integer goalTimingsRecorded_num, Integer averageAttendance, Integer cornerTimingRecorded_matches, Integer corners_fh_num, Integer corners_2h_num, Double corners_fh_avg, Double corners_2h_avg, Integer corners_fh_over4_num, Integer corners_2h_over4_num, Integer corners_fh_over4_percentage, Integer corners_2h_over4_percentage, Integer corners_fh_over5_num, Integer corners_2h_over5_num, Integer corners_fh_over5_percentage, Integer corners_2h_over5_percentage, Integer corners_fh_over6_num, Integer corners_2h_over6_num, Integer corners_fh_over6_percentage, Integer corners_2h_over6_percentage, Integer attack_num_recoded_matches, Integer dangerous_attacks_num, Integer attacks_num, Double dangerous_attacks_avg, Double attacks_avg, Double xg_avg, Integer possessions_recorded_matches, String seasonOver05_num, String seasonOver15_num, String seasonOver25_num, String seasonOver35_num, String seasonOver45_num, String seasonOver55_num, String seasonUnder05_num, String seasonUnder15_num, String seasonUnder25_num, String seasonUnder35_num, String seasonUnder45_num, String seasonUnder55_num, String shortHand, String db_english_name, String iso, String type, String footystats_url, List<TopScorers> top_scorers, List<TopAssists> top_assists, List<TopCleanSheets> top_clean_sheets) {
        this.league_seasons_id = league_seasons_id;
        this.id = id;
        this.tsapi_id = tsapi_id;
        this.name = name;
        this.english_name = english_name;
        this.name_tr = name_tr;
        this.country = country;
        this.domestic_scale = domestic_scale;
        this.international_scale = international_scale;
        this.status = status;
        this.format = format;
        this.division = division;
        this.no_home_away = no_home_away;
        this.starting_year = starting_year;
        this.ending_year = ending_year;
        this.women = women;
        this.continent = continent;
        this.comp_master_id = comp_master_id;
        this.image = image;
        this.clubNum = clubNum;
        this.season = season;
        this.goalTimingDisabled = goalTimingDisabled;
        this.totalMatches = totalMatches;
        this.matchesCompleted = matchesCompleted;
        this.canceledMatchesNum = canceledMatchesNum;
        this.game_week = game_week;
        this.total_game_week = total_game_week;
        this.round = round;
        this.progress = progress;
        this.total_goals = total_goals;
        this.home_teams_goals = home_teams_goals;
        this.home_teams_conceded = home_teams_conceded;
        this.away_teams_goals = away_teams_goals;
        this.away_teams_conceded = away_teams_conceded;
        this.seasonAVG_overall = seasonAVG_overall;
        this.seasonAVG_home = seasonAVG_home;
        this.seasonAVG_away = seasonAVG_away;
        this.btts_matches = btts_matches;
        this.seasonBTTSPercentage = seasonBTTSPercentage;
        this.seasonCSPercentage = seasonCSPercentage;
        this.home_teams_clean_sheets = home_teams_clean_sheets;
        this.away_teams_clean_sheets = away_teams_clean_sheets;
        this.home_teams_failed_to_score = home_teams_failed_to_score;
        this.away_teams_failed_to_score = away_teams_failed_to_score;
        this.riskNum = riskNum;
        this.homeAttackAdvantagePercentage = homeAttackAdvantagePercentage;
        this.homeDefenceAdvantagePercentage = homeDefenceAdvantagePercentage;
        this.homeOverallAdvantage = homeOverallAdvantage;
        this.cornersAVG_overall = cornersAVG_overall;
        this.cornersAVG_home = cornersAVG_home;
        this.cornersAVG_away = cornersAVG_away;
        this.cornersTotal_overall = cornersTotal_overall;
        this.cornersTotal_home = cornersTotal_home;
        this.cornersTotal_away = cornersTotal_away;
        this.cardsAVG_overall = cardsAVG_overall;
        this.cardsAVG_home = cardsAVG_home;
        this.cardsAVG_away = cardsAVG_away;
        this.cardsTotal_overall = cardsTotal_overall;
        this.cardsTotal_home = cardsTotal_home;
        this.cardsTotal_away = cardsTotal_away;
        this.foulsTotal_overall = foulsTotal_overall;
        this.foulsTotal_home = foulsTotal_home;
        this.foulsTotal_away = foulsTotal_away;
        this.foulsAVG_overall = foulsAVG_overall;
        this.foulsAVG_home = foulsAVG_home;
        this.foulsAVG_away = foulsAVG_away;
        this.shotsTotal_overall = shotsTotal_overall;
        this.shotsTotal_home = shotsTotal_home;
        this.shotsTotal_away = shotsTotal_away;
        this.shotsAVG_overall = shotsAVG_overall;
        this.shotsAVG_home = shotsAVG_home;
        this.shotsAVG_away = shotsAVG_away;
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
        this.over05OffsidesPercentage_overall = over05OffsidesPercentage_overall;
        this.over15OffsidesPercentage_overall = over15OffsidesPercentage_overall;
        this.over25OffsidesPercentage_overall = over25OffsidesPercentage_overall;
        this.over35OffsidesPercentage_overall = over35OffsidesPercentage_overall;
        this.over45OffsidesPercentage_overall = over45OffsidesPercentage_overall;
        this.over55OffsidesPercentage_overall = over55OffsidesPercentage_overall;
        this.over65OffsidesPercentage_overall = over65OffsidesPercentage_overall;
        this.seasonOver05Percentage_overall = seasonOver05Percentage_overall;
        this.seasonOver15Percentage_overall = seasonOver15Percentage_overall;
        this.seasonOver25Percentage_overall = seasonOver25Percentage_overall;
        this.seasonOver35Percentage_overall = seasonOver35Percentage_overall;
        this.seasonOver45Percentage_overall = seasonOver45Percentage_overall;
        this.seasonOver55Percentage_overall = seasonOver55Percentage_overall;
        this.seasonUnder05Percentage_overall = seasonUnder05Percentage_overall;
        this.seasonUnder15Percentage_overall = seasonUnder15Percentage_overall;
        this.seasonUnder25Percentage_overall = seasonUnder25Percentage_overall;
        this.seasonUnder35Percentage_overall = seasonUnder35Percentage_overall;
        this.seasonUnder45Percentage_overall = seasonUnder45Percentage_overall;
        this.seasonUnder55Percentage_overall = seasonUnder55Percentage_overall;
        this.cornersRecorded_matches = cornersRecorded_matches;
        this.cardsRecorded_matches = cardsRecorded_matches;
        this.offsidesRecorded_matches = offsidesRecorded_matches;
        this.over65Corners_overall = over65Corners_overall;
        this.over75Corners_overall = over75Corners_overall;
        this.over85Corners_overall = over85Corners_overall;
        this.over95Corners_overall = over95Corners_overall;
        this.over105Corners_overall = over105Corners_overall;
        this.over115Corners_overall = over115Corners_overall;
        this.over125Corners_overall = over125Corners_overall;
        this.over135Corners_overall = over135Corners_overall;
        this.over145Corners_overall = over145Corners_overall;
        this.over65CornersPercentage_overall = over65CornersPercentage_overall;
        this.over75CornersPercentage_overall = over75CornersPercentage_overall;
        this.over85CornersPercentage_overall = over85CornersPercentage_overall;
        this.over95CornersPercentage_overall = over95CornersPercentage_overall;
        this.over105CornersPercentage_overall = over105CornersPercentage_overall;
        this.over115CornersPercentage_overall = over115CornersPercentage_overall;
        this.over125CornersPercentage_overall = over125CornersPercentage_overall;
        this.over135CornersPercentage_overall = over135CornersPercentage_overall;
        this.over145CornersPercentage_overall = over145CornersPercentage_overall;
        this.over05Cards_overall = over05Cards_overall;
        this.over15Cards_overall = over15Cards_overall;
        this.over25Cards_overall = over25Cards_overall;
        this.over35Cards_overall = over35Cards_overall;
        this.over45Cards_overall = over45Cards_overall;
        this.over55Cards_overall = over55Cards_overall;
        this.over65Cards_overall = over65Cards_overall;
        this.over75Cards_overall = over75Cards_overall;
        this.over05CardsPercentage_overall = over05CardsPercentage_overall;
        this.over15CardsPercentage_overall = over15CardsPercentage_overall;
        this.over25CardsPercentage_overall = over25CardsPercentage_overall;
        this.over35CardsPercentage_overall = over35CardsPercentage_overall;
        this.over45CardsPercentage_overall = over45CardsPercentage_overall;
        this.over55CardsPercentage_overall = over55CardsPercentage_overall;
        this.over65CardsPercentage_overall = over65CardsPercentage_overall;
        this.over75CardsPercentage_overall = over75CardsPercentage_overall;
        this.homeWins = homeWins;
        this.draws = draws;
        this.awayWins = awayWins;
        this.homeWinPercentage = homeWinPercentage;
        this.drawPercentage = drawPercentage;
        this.awayWinPercentage = awayWinPercentage;
        this.shotsRecorded_matches = shotsRecorded_matches;
        this.foulsRecorded_matches = foulsRecorded_matches;
        this.failed_to_score_total = failed_to_score_total;
        this.clean_sheets_total = clean_sheets_total;
        this.round_format = round_format;
        this.goals_min_0_to_10 = goals_min_0_to_10;
        this.goals_min_11_to_20 = goals_min_11_to_20;
        this.goals_min_21_to_30 = goals_min_21_to_30;
        this.goals_min_31_to_40 = goals_min_31_to_40;
        this.goals_min_41_to_50 = goals_min_41_to_50;
        this.goals_min_51_to_60 = goals_min_51_to_60;
        this.goals_min_61_to_70 = goals_min_61_to_70;
        this.goals_min_71_to_80 = goals_min_71_to_80;
        this.goals_min_81_to_90 = goals_min_81_to_90;
        this.goals_min_0_to_15 = goals_min_0_to_15;
        this.goals_min_16_to_30 = goals_min_16_to_30;
        this.goals_min_31_to_45 = goals_min_31_to_45;
        this.goals_min_46_to_60 = goals_min_46_to_60;
        this.goals_min_61_to_75 = goals_min_61_to_75;
        this.goals_min_76_to_90 = goals_min_76_to_90;
        this.player_count = player_count;
        this.over05_fhg_num = over05_fhg_num;
        this.over15_fhg_num = over15_fhg_num;
        this.over25_fhg_num = over25_fhg_num;
        this.over35_fhg_num = over35_fhg_num;
        this.over05_fhg_percentage = over05_fhg_percentage;
        this.over15_fhg_percentage = over15_fhg_percentage;
        this.over25_fhg_percentage = over25_fhg_percentage;
        this.over35_fhg_percentage = over35_fhg_percentage;
        this.over05_2hg_num = over05_2hg_num;
        this.over15_2hg_num = over15_2hg_num;
        this.over25_2hg_num = over25_2hg_num;
        this.over35_2hg_num = over35_2hg_num;
        this.over05_2hg_percentage = over05_2hg_percentage;
        this.over15_2hg_percentage = over15_2hg_percentage;
        this.over25_2hg_percentage = over25_2hg_percentage;
        this.over35_2hg_percentage = over35_2hg_percentage;
        this.goalTimingsRecorded_num = goalTimingsRecorded_num;
        this.averageAttendance = averageAttendance;
        this.cornerTimingRecorded_matches = cornerTimingRecorded_matches;
        this.corners_fh_num = corners_fh_num;
        this.corners_2h_num = corners_2h_num;
        this.corners_fh_avg = corners_fh_avg;
        this.corners_2h_avg = corners_2h_avg;
        this.corners_fh_over4_num = corners_fh_over4_num;
        this.corners_2h_over4_num = corners_2h_over4_num;
        this.corners_fh_over4_percentage = corners_fh_over4_percentage;
        this.corners_2h_over4_percentage = corners_2h_over4_percentage;
        this.corners_fh_over5_num = corners_fh_over5_num;
        this.corners_2h_over5_num = corners_2h_over5_num;
        this.corners_fh_over5_percentage = corners_fh_over5_percentage;
        this.corners_2h_over5_percentage = corners_2h_over5_percentage;
        this.corners_fh_over6_num = corners_fh_over6_num;
        this.corners_2h_over6_num = corners_2h_over6_num;
        this.corners_fh_over6_percentage = corners_fh_over6_percentage;
        this.corners_2h_over6_percentage = corners_2h_over6_percentage;
        this.attack_num_recoded_matches = attack_num_recoded_matches;
        this.dangerous_attacks_num = dangerous_attacks_num;
        this.attacks_num = attacks_num;
        this.dangerous_attacks_avg = dangerous_attacks_avg;
        this.attacks_avg = attacks_avg;
        this.xg_avg = xg_avg;
        this.possessions_recorded_matches = possessions_recorded_matches;
        this.seasonOver05_num = seasonOver05_num;
        this.seasonOver15_num = seasonOver15_num;
        this.seasonOver25_num = seasonOver25_num;
        this.seasonOver35_num = seasonOver35_num;
        this.seasonOver45_num = seasonOver45_num;
        this.seasonOver55_num = seasonOver55_num;
        this.seasonUnder05_num = seasonUnder05_num;
        this.seasonUnder15_num = seasonUnder15_num;
        this.seasonUnder25_num = seasonUnder25_num;
        this.seasonUnder35_num = seasonUnder35_num;
        this.seasonUnder45_num = seasonUnder45_num;
        this.seasonUnder55_num = seasonUnder55_num;
        this.shortHand = shortHand;
        this.db_english_name = db_english_name;
        this.iso = iso;
        this.type = type;
        this.footystats_url = footystats_url;
        this.top_scorers = top_scorers;
        this.top_assists = top_assists;
        this.top_clean_sheets = top_clean_sheets;
    }

    public LeagueSeasons(Long id, String tsapi_id, String name, String english_name, String name_tr, String country, Integer domestic_scale, Integer international_scale, String status, String format, Integer division, String no_home_away, Integer starting_year, Integer ending_year, Integer women, String continent, Long comp_master_id, String image, Integer clubNum, String season, Integer goalTimingDisabled, Integer totalMatches, Integer matchesCompleted, Integer canceledMatchesNum, Integer game_week, Integer total_game_week, Integer round, Integer progress, Integer total_goals, Integer home_teams_goals, Integer home_teams_conceded, Integer away_teams_goals, Integer away_teams_conceded, Double seasonAVG_overall, Double seasonAVG_home, Double seasonAVG_away, Integer btts_matches, Integer seasonBTTSPercentage, Integer seasonCSPercentage, Integer home_teams_clean_sheets, Integer away_teams_clean_sheets, Integer home_teams_failed_to_score, Integer away_teams_failed_to_score, Integer riskNum, Integer homeAttackAdvantagePercentage, Integer homeDefenceAdvantagePercentage, Integer homeOverallAdvantage, Double cornersAVG_overall, Double cornersAVG_home, Double cornersAVG_away, Integer cornersTotal_overall, Integer cornersTotal_home, Integer cornersTotal_away, Double cardsAVG_overall, Double cardsAVG_home, Double cardsAVG_away, Integer cardsTotal_overall, Integer cardsTotal_home, Integer cardsTotal_away, Integer foulsTotal_overall, Integer foulsTotal_home, Integer foulsTotal_away, Double foulsAVG_overall, Double foulsAVG_home, Double foulsAVG_away, Integer shotsTotal_overall, Integer shotsTotal_home, Integer shotsTotal_away, Double shotsAVG_overall, Double shotsAVG_home, Double shotsAVG_away, Integer offsidesTotal_overall, Integer offsidesTotal_home, Integer offsidesTotal_away, Double offsidesAVG_overall, Double offsidesAVG_home, Double offsidesAVG_away, Integer offsidesOver05_overall, Integer offsidesOver15_overall, Integer offsidesOver25_overall, Integer offsidesOver35_overall, Integer offsidesOver45_overall, Integer offsidesOver55_overall, Integer offsidesOver65_overall, Integer over05OffsidesPercentage_overall, Integer over15OffsidesPercentage_overall, Integer over25OffsidesPercentage_overall, Integer over35OffsidesPercentage_overall, Integer over45OffsidesPercentage_overall, Integer over55OffsidesPercentage_overall, Integer over65OffsidesPercentage_overall, Integer seasonOver05Percentage_overall, Integer seasonOver15Percentage_overall, Integer seasonOver25Percentage_overall, Integer seasonOver35Percentage_overall, Integer seasonOver45Percentage_overall, Integer seasonOver55Percentage_overall, Integer seasonUnder05Percentage_overall, Integer seasonUnder15Percentage_overall, Integer seasonUnder25Percentage_overall, Integer seasonUnder35Percentage_overall, Integer seasonUnder45Percentage_overall, Integer seasonUnder55Percentage_overall, Integer cornersRecorded_matches, Integer cardsRecorded_matches, Integer offsidesRecorded_matches, Integer over65Corners_overall, Integer over75Corners_overall, Integer over85Corners_overall, Integer over95Corners_overall, Integer over105Corners_overall, Integer over115Corners_overall, Integer over125Corners_overall, Integer over135Corners_overall, Integer over145Corners_overall, Integer over65CornersPercentage_overall, Integer over75CornersPercentage_overall, Integer over85CornersPercentage_overall, Integer over95CornersPercentage_overall, Integer over105CornersPercentage_overall, Integer over115CornersPercentage_overall, Integer over125CornersPercentage_overall, Integer over135CornersPercentage_overall, Integer over145CornersPercentage_overall, Integer over05Cards_overall, Integer over15Cards_overall, Integer over25Cards_overall, Integer over35Cards_overall, Integer over45Cards_overall, Integer over55Cards_overall, Integer over65Cards_overall, Integer over75Cards_overall, Integer over05CardsPercentage_overall, Integer over15CardsPercentage_overall, Integer over25CardsPercentage_overall, Integer over35CardsPercentage_overall, Integer over45CardsPercentage_overall, Integer over55CardsPercentage_overall, Integer over65CardsPercentage_overall, Integer over75CardsPercentage_overall, Integer homeWins, Integer draws, Integer awayWins, Integer homeWinPercentage, Integer drawPercentage, Integer awayWinPercentage, Integer shotsRecorded_matches, Integer foulsRecorded_matches, Integer failed_to_score_total, Integer clean_sheets_total, Integer round_format, Integer goals_min_0_to_10, Integer goals_min_11_to_20, Integer goals_min_21_to_30, Integer goals_min_31_to_40, Integer goals_min_41_to_50, Integer goals_min_51_to_60, Integer goals_min_61_to_70, Integer goals_min_71_to_80, Integer goals_min_81_to_90, Integer goals_min_0_to_15, Integer goals_min_16_to_30, Integer goals_min_31_to_45, Integer goals_min_46_to_60, Integer goals_min_61_to_75, Integer goals_min_76_to_90, Integer player_count, Integer over05_fhg_num, Integer over15_fhg_num, Integer over25_fhg_num, Integer over35_fhg_num, Integer over05_fhg_percentage, Integer over15_fhg_percentage, Integer over25_fhg_percentage, Integer over35_fhg_percentage, Integer over05_2hg_num, Integer over15_2hg_num, Integer over25_2hg_num, Integer over35_2hg_num, Integer over05_2hg_percentage, Integer over15_2hg_percentage, Integer over25_2hg_percentage, Integer over35_2hg_percentage, Integer goalTimingsRecorded_num, Integer averageAttendance, Integer cornerTimingRecorded_matches, Integer corners_fh_num, Integer corners_2h_num, Double corners_fh_avg, Double corners_2h_avg, Integer corners_fh_over4_num, Integer corners_2h_over4_num, Integer corners_fh_over4_percentage, Integer corners_2h_over4_percentage, Integer corners_fh_over5_num, Integer corners_2h_over5_num, Integer corners_fh_over5_percentage, Integer corners_2h_over5_percentage, Integer corners_fh_over6_num, Integer corners_2h_over6_num, Integer corners_fh_over6_percentage, Integer corners_2h_over6_percentage, Integer attack_num_recoded_matches, Integer dangerous_attacks_num, Integer attacks_num, Double dangerous_attacks_avg, Double attacks_avg, Double xg_avg, Integer possessions_recorded_matches, String seasonOver05_num, String seasonOver15_num, String seasonOver25_num, String seasonOver35_num, String seasonOver45_num, String seasonOver55_num, String seasonUnder05_num, String seasonUnder15_num, String seasonUnder25_num, String seasonUnder35_num, String seasonUnder45_num, String seasonUnder55_num, String shortHand, String db_english_name, String iso, String type, String footystats_url, List<TopScorers> top_scorers, List<TopAssists> top_assists, List<TopCleanSheets> top_clean_sheets) {
        this.id = id;
        this.tsapi_id = tsapi_id;
        this.name = name;
        this.english_name = english_name;
        this.name_tr = name_tr;
        this.country = country;
        this.domestic_scale = domestic_scale;
        this.international_scale = international_scale;
        this.status = status;
        this.format = format;
        this.division = division;
        this.no_home_away = no_home_away;
        this.starting_year = starting_year;
        this.ending_year = ending_year;
        this.women = women;
        this.continent = continent;
        this.comp_master_id = comp_master_id;
        this.image = image;
        this.clubNum = clubNum;
        this.season = season;
        this.goalTimingDisabled = goalTimingDisabled;
        this.totalMatches = totalMatches;
        this.matchesCompleted = matchesCompleted;
        this.canceledMatchesNum = canceledMatchesNum;
        this.game_week = game_week;
        this.total_game_week = total_game_week;
        this.round = round;
        this.progress = progress;
        this.total_goals = total_goals;
        this.home_teams_goals = home_teams_goals;
        this.home_teams_conceded = home_teams_conceded;
        this.away_teams_goals = away_teams_goals;
        this.away_teams_conceded = away_teams_conceded;
        this.seasonAVG_overall = seasonAVG_overall;
        this.seasonAVG_home = seasonAVG_home;
        this.seasonAVG_away = seasonAVG_away;
        this.btts_matches = btts_matches;
        this.seasonBTTSPercentage = seasonBTTSPercentage;
        this.seasonCSPercentage = seasonCSPercentage;
        this.home_teams_clean_sheets = home_teams_clean_sheets;
        this.away_teams_clean_sheets = away_teams_clean_sheets;
        this.home_teams_failed_to_score = home_teams_failed_to_score;
        this.away_teams_failed_to_score = away_teams_failed_to_score;
        this.riskNum = riskNum;
        this.homeAttackAdvantagePercentage = homeAttackAdvantagePercentage;
        this.homeDefenceAdvantagePercentage = homeDefenceAdvantagePercentage;
        this.homeOverallAdvantage = homeOverallAdvantage;
        this.cornersAVG_overall = cornersAVG_overall;
        this.cornersAVG_home = cornersAVG_home;
        this.cornersAVG_away = cornersAVG_away;
        this.cornersTotal_overall = cornersTotal_overall;
        this.cornersTotal_home = cornersTotal_home;
        this.cornersTotal_away = cornersTotal_away;
        this.cardsAVG_overall = cardsAVG_overall;
        this.cardsAVG_home = cardsAVG_home;
        this.cardsAVG_away = cardsAVG_away;
        this.cardsTotal_overall = cardsTotal_overall;
        this.cardsTotal_home = cardsTotal_home;
        this.cardsTotal_away = cardsTotal_away;
        this.foulsTotal_overall = foulsTotal_overall;
        this.foulsTotal_home = foulsTotal_home;
        this.foulsTotal_away = foulsTotal_away;
        this.foulsAVG_overall = foulsAVG_overall;
        this.foulsAVG_home = foulsAVG_home;
        this.foulsAVG_away = foulsAVG_away;
        this.shotsTotal_overall = shotsTotal_overall;
        this.shotsTotal_home = shotsTotal_home;
        this.shotsTotal_away = shotsTotal_away;
        this.shotsAVG_overall = shotsAVG_overall;
        this.shotsAVG_home = shotsAVG_home;
        this.shotsAVG_away = shotsAVG_away;
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
        this.over05OffsidesPercentage_overall = over05OffsidesPercentage_overall;
        this.over15OffsidesPercentage_overall = over15OffsidesPercentage_overall;
        this.over25OffsidesPercentage_overall = over25OffsidesPercentage_overall;
        this.over35OffsidesPercentage_overall = over35OffsidesPercentage_overall;
        this.over45OffsidesPercentage_overall = over45OffsidesPercentage_overall;
        this.over55OffsidesPercentage_overall = over55OffsidesPercentage_overall;
        this.over65OffsidesPercentage_overall = over65OffsidesPercentage_overall;
        this.seasonOver05Percentage_overall = seasonOver05Percentage_overall;
        this.seasonOver15Percentage_overall = seasonOver15Percentage_overall;
        this.seasonOver25Percentage_overall = seasonOver25Percentage_overall;
        this.seasonOver35Percentage_overall = seasonOver35Percentage_overall;
        this.seasonOver45Percentage_overall = seasonOver45Percentage_overall;
        this.seasonOver55Percentage_overall = seasonOver55Percentage_overall;
        this.seasonUnder05Percentage_overall = seasonUnder05Percentage_overall;
        this.seasonUnder15Percentage_overall = seasonUnder15Percentage_overall;
        this.seasonUnder25Percentage_overall = seasonUnder25Percentage_overall;
        this.seasonUnder35Percentage_overall = seasonUnder35Percentage_overall;
        this.seasonUnder45Percentage_overall = seasonUnder45Percentage_overall;
        this.seasonUnder55Percentage_overall = seasonUnder55Percentage_overall;
        this.cornersRecorded_matches = cornersRecorded_matches;
        this.cardsRecorded_matches = cardsRecorded_matches;
        this.offsidesRecorded_matches = offsidesRecorded_matches;
        this.over65Corners_overall = over65Corners_overall;
        this.over75Corners_overall = over75Corners_overall;
        this.over85Corners_overall = over85Corners_overall;
        this.over95Corners_overall = over95Corners_overall;
        this.over105Corners_overall = over105Corners_overall;
        this.over115Corners_overall = over115Corners_overall;
        this.over125Corners_overall = over125Corners_overall;
        this.over135Corners_overall = over135Corners_overall;
        this.over145Corners_overall = over145Corners_overall;
        this.over65CornersPercentage_overall = over65CornersPercentage_overall;
        this.over75CornersPercentage_overall = over75CornersPercentage_overall;
        this.over85CornersPercentage_overall = over85CornersPercentage_overall;
        this.over95CornersPercentage_overall = over95CornersPercentage_overall;
        this.over105CornersPercentage_overall = over105CornersPercentage_overall;
        this.over115CornersPercentage_overall = over115CornersPercentage_overall;
        this.over125CornersPercentage_overall = over125CornersPercentage_overall;
        this.over135CornersPercentage_overall = over135CornersPercentage_overall;
        this.over145CornersPercentage_overall = over145CornersPercentage_overall;
        this.over05Cards_overall = over05Cards_overall;
        this.over15Cards_overall = over15Cards_overall;
        this.over25Cards_overall = over25Cards_overall;
        this.over35Cards_overall = over35Cards_overall;
        this.over45Cards_overall = over45Cards_overall;
        this.over55Cards_overall = over55Cards_overall;
        this.over65Cards_overall = over65Cards_overall;
        this.over75Cards_overall = over75Cards_overall;
        this.over05CardsPercentage_overall = over05CardsPercentage_overall;
        this.over15CardsPercentage_overall = over15CardsPercentage_overall;
        this.over25CardsPercentage_overall = over25CardsPercentage_overall;
        this.over35CardsPercentage_overall = over35CardsPercentage_overall;
        this.over45CardsPercentage_overall = over45CardsPercentage_overall;
        this.over55CardsPercentage_overall = over55CardsPercentage_overall;
        this.over65CardsPercentage_overall = over65CardsPercentage_overall;
        this.over75CardsPercentage_overall = over75CardsPercentage_overall;
        this.homeWins = homeWins;
        this.draws = draws;
        this.awayWins = awayWins;
        this.homeWinPercentage = homeWinPercentage;
        this.drawPercentage = drawPercentage;
        this.awayWinPercentage = awayWinPercentage;
        this.shotsRecorded_matches = shotsRecorded_matches;
        this.foulsRecorded_matches = foulsRecorded_matches;
        this.failed_to_score_total = failed_to_score_total;
        this.clean_sheets_total = clean_sheets_total;
        this.round_format = round_format;
        this.goals_min_0_to_10 = goals_min_0_to_10;
        this.goals_min_11_to_20 = goals_min_11_to_20;
        this.goals_min_21_to_30 = goals_min_21_to_30;
        this.goals_min_31_to_40 = goals_min_31_to_40;
        this.goals_min_41_to_50 = goals_min_41_to_50;
        this.goals_min_51_to_60 = goals_min_51_to_60;
        this.goals_min_61_to_70 = goals_min_61_to_70;
        this.goals_min_71_to_80 = goals_min_71_to_80;
        this.goals_min_81_to_90 = goals_min_81_to_90;
        this.goals_min_0_to_15 = goals_min_0_to_15;
        this.goals_min_16_to_30 = goals_min_16_to_30;
        this.goals_min_31_to_45 = goals_min_31_to_45;
        this.goals_min_46_to_60 = goals_min_46_to_60;
        this.goals_min_61_to_75 = goals_min_61_to_75;
        this.goals_min_76_to_90 = goals_min_76_to_90;
        this.player_count = player_count;
        this.over05_fhg_num = over05_fhg_num;
        this.over15_fhg_num = over15_fhg_num;
        this.over25_fhg_num = over25_fhg_num;
        this.over35_fhg_num = over35_fhg_num;
        this.over05_fhg_percentage = over05_fhg_percentage;
        this.over15_fhg_percentage = over15_fhg_percentage;
        this.over25_fhg_percentage = over25_fhg_percentage;
        this.over35_fhg_percentage = over35_fhg_percentage;
        this.over05_2hg_num = over05_2hg_num;
        this.over15_2hg_num = over15_2hg_num;
        this.over25_2hg_num = over25_2hg_num;
        this.over35_2hg_num = over35_2hg_num;
        this.over05_2hg_percentage = over05_2hg_percentage;
        this.over15_2hg_percentage = over15_2hg_percentage;
        this.over25_2hg_percentage = over25_2hg_percentage;
        this.over35_2hg_percentage = over35_2hg_percentage;
        this.goalTimingsRecorded_num = goalTimingsRecorded_num;
        this.averageAttendance = averageAttendance;
        this.cornerTimingRecorded_matches = cornerTimingRecorded_matches;
        this.corners_fh_num = corners_fh_num;
        this.corners_2h_num = corners_2h_num;
        this.corners_fh_avg = corners_fh_avg;
        this.corners_2h_avg = corners_2h_avg;
        this.corners_fh_over4_num = corners_fh_over4_num;
        this.corners_2h_over4_num = corners_2h_over4_num;
        this.corners_fh_over4_percentage = corners_fh_over4_percentage;
        this.corners_2h_over4_percentage = corners_2h_over4_percentage;
        this.corners_fh_over5_num = corners_fh_over5_num;
        this.corners_2h_over5_num = corners_2h_over5_num;
        this.corners_fh_over5_percentage = corners_fh_over5_percentage;
        this.corners_2h_over5_percentage = corners_2h_over5_percentage;
        this.corners_fh_over6_num = corners_fh_over6_num;
        this.corners_2h_over6_num = corners_2h_over6_num;
        this.corners_fh_over6_percentage = corners_fh_over6_percentage;
        this.corners_2h_over6_percentage = corners_2h_over6_percentage;
        this.attack_num_recoded_matches = attack_num_recoded_matches;
        this.dangerous_attacks_num = dangerous_attacks_num;
        this.attacks_num = attacks_num;
        this.dangerous_attacks_avg = dangerous_attacks_avg;
        this.attacks_avg = attacks_avg;
        this.xg_avg = xg_avg;
        this.possessions_recorded_matches = possessions_recorded_matches;
        this.seasonOver05_num = seasonOver05_num;
        this.seasonOver15_num = seasonOver15_num;
        this.seasonOver25_num = seasonOver25_num;
        this.seasonOver35_num = seasonOver35_num;
        this.seasonOver45_num = seasonOver45_num;
        this.seasonOver55_num = seasonOver55_num;
        this.seasonUnder05_num = seasonUnder05_num;
        this.seasonUnder15_num = seasonUnder15_num;
        this.seasonUnder25_num = seasonUnder25_num;
        this.seasonUnder35_num = seasonUnder35_num;
        this.seasonUnder45_num = seasonUnder45_num;
        this.seasonUnder55_num = seasonUnder55_num;
        this.shortHand = shortHand;
        this.db_english_name = db_english_name;
        this.iso = iso;
        this.type = type;
        this.footystats_url = footystats_url;
        this.top_scorers = top_scorers;
        this.top_assists = top_assists;
        this.top_clean_sheets = top_clean_sheets;
    }
}
