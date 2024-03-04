package org.example.tahmiinbackend.leagueTeams;

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
@JsonIgnoreProperties({
        "offsidesTeamOver05Percentage_overall",
        "offsidesTeamOver15Percentage_overall",
        "offsidesTeamOver25Percentage_overall",
        "offsidesTeamOver35Percentage_overall",
        "offsidesTeamOver45Percentage_overall",
        "offsidesTeamOver55Percentage_overall",
        "offsidesTeamOver65Percentage_overall",
        "offsidesTeamOver05Percentage_home",
        "offsidesTeamOver15Percentage_home",
        "offsidesTeamOver25Percentage_home",
        "offsidesTeamOver35Percentage_home",
        "offsidesTeamOver45Percentage_home",
        "offsidesTeamOver55Percentage_home",
        "offsidesTeamOver65Percentage_home",
        "offsidesTeamOver05Percentage_away",
        "offsidesTeamOver15Percentage_away",
        "offsidesTeamOver25Percentage_away",
        "offsidesTeamOver35Percentage_away",
        "offsidesTeamOver45Percentage_away",
        "offsidesTeamOver55Percentage_away",
        "offsidesTeamOver65Percentage_away",
        })
public class TeamStatsPercentage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_stats_percentage_sequence")
    @SequenceGenerator(name = "team_stats_percentage_sequence", sequenceName = "team_stats_percentage_sequence", allocationSize = 1)
    private Long team_stats_percentage_id;
    private Integer seasonCSPercentage_overall;
    private Integer seasonCSPercentage_home;
    private Integer seasonCSPercentage_away;
    private Integer seasonCSPercentageHT_overall;
    private Integer seasonCSPercentageHT_home;
    private Integer seasonCSPercentageHT_away;
    private Integer seasonFTSPercentage_overall;
    private Integer seasonFTSPercentage_home;
    private Integer seasonFTSPercentage_away;
    private Integer seasonFTSPercentageHT_overall;
    private Integer seasonFTSPercentageHT_home;
    private Integer seasonFTSPercentageHT_away;
    private Integer winPercentage_overall;
    private Integer winPercentage_home;
    private Integer winPercentage_away;
    private Integer drawPercentage_overall;
    private Integer drawPercentage_home;
    private Integer drawPercentage_away;
    private Integer losePercentage_overall;
    private Integer losePercentage_home;
    private Integer losePercentage_away;
    private Integer leadingAtHTPercentage_overall;
    private Integer leadingAtHTPercentage_home;
    private Integer leadingAtHTPercentage_away;
    private Integer drawingAtHTPercentage_home;
    private Integer drawingAtHTPercentage_away;
    private Integer drawingAtHTPercentage_overall;
    private Integer trailingAtHTPercentage_home;
    private Integer trailingAtHTPercentage_away;
    private Integer trailingAtHTPercentage_overall;
    private Integer seasonOver55Percentage_overall;
    private Integer seasonOver45Percentage_overall;
    private Integer seasonOver35Percentage_overall;
    private Integer seasonOver25Percentage_overall;
    private Integer seasonOver15Percentage_overall;
    private Integer seasonOver05Percentage_overall;
    private Integer seasonUnder55Percentage_overall;
    private Integer seasonUnder45Percentage_overall;
    private Integer seasonUnder35Percentage_overall;
    private Integer seasonUnder25Percentage_overall;
    private Integer seasonUnder15Percentage_overall;
    private Integer seasonUnder05Percentage_overall;
    private Integer seasonOver55Percentage_home;
    private Integer seasonOver45Percentage_home;
    private Integer seasonOver35Percentage_home;
    private Integer seasonOver25Percentage_home;
    private Integer seasonOver15Percentage_home;
    private Integer seasonOver05Percentage_home;
    private Integer seasonUnder55Percentage_home;
    private Integer seasonUnder45Percentage_home;
    private Integer seasonUnder35Percentage_home;
    private Integer seasonUnder25Percentage_home;
    private Integer seasonUnder15Percentage_home;
    private Integer seasonUnder05Percentage_home;
    private Integer seasonOver55Percentage_away;
    private Integer seasonOver45Percentage_away;
    private Integer seasonOver35Percentage_away;
    private Integer seasonOver25Percentage_away;
    private Integer seasonOver15Percentage_away;
    private Integer seasonOver05Percentage_away;
    private Integer seasonUnder55Percentage_away;
    private Integer seasonUnder45Percentage_away;
    private Integer seasonUnder35Percentage_away;
    private Integer seasonUnder25Percentage_away;
    private Integer seasonUnder15Percentage_away;
    private Integer seasonUnder05Percentage_away;
    private Integer seasonOver25PercentageHT_overall;
    private Integer seasonOver15PercentageHT_overall;
    private Integer seasonOver05PercentageHT_overall;
    private Integer seasonOver25PercentageHT_home;
    private Integer seasonOver15PercentageHT_home;
    private Integer seasonOver05PercentageHT_home;
    private Integer seasonOver25PercentageHT_away;
    private Integer seasonOver15PercentageHT_away;
    private Integer seasonOver05PercentageHT_away;
    private Integer over05CardsPercentage_overall;
    private Integer over15CardsPercentage_overall;
    private Integer over25CardsPercentage_overall;
    private Integer over35CardsPercentage_overall;
    private Integer over45CardsPercentage_overall;
    private Integer over55CardsPercentage_overall;
    private Integer over65CardsPercentage_overall;
    private Integer over75CardsPercentage_overall;
    private Integer over85CardsPercentage_overall;
    private Integer over05CardsPercentage_home;
    private Integer over15CardsPercentage_home;
    private Integer over25CardsPercentage_home;
    private Integer over35CardsPercentage_home;
    private Integer over45CardsPercentage_home;
    private Integer over55CardsPercentage_home;
    private Integer over65CardsPercentage_home;
    private Integer over75CardsPercentage_home;
    private Integer over85CardsPercentage_home;
    private Integer over05CardsPercentage_away;
    private Integer over15CardsPercentage_away;
    private Integer over25CardsPercentage_away;
    private Integer over35CardsPercentage_away;
    private Integer over45CardsPercentage_away;
    private Integer over55CardsPercentage_away;
    private Integer over65CardsPercentage_away;
    private Integer over75CardsPercentage_away;
    private Integer over85CardsPercentage_away;
    private Integer over05CardsForPercentage_overall;
    private Integer over15CardsForPercentage_overall;
    private Integer over25CardsForPercentage_overall;
    private Integer over35CardsForPercentage_overall;
    private Integer over45CardsForPercentage_overall;
    private Integer over55CardsForPercentage_overall;
    private Integer over65CardsForPercentage_overall;
    private Integer over05CardsForPercentage_away;
    private Integer over15CardsForPercentage_away;
    private Integer over25CardsForPercentage_away;
    private Integer over35CardsForPercentage_away;
    private Integer over45CardsForPercentage_away;
    private Integer over55CardsForPercentage_away;
    private Integer over65CardsForPercentage_away;
    private Integer over05CardsAgainstPercentage_overall;
    private Integer over15CardsAgainstPercentage_overall;
    private Integer over25CardsAgainstPercentage_overall;
    private Integer over35CardsAgainstPercentage_overall;
    private Integer over45CardsAgainstPercentage_overall;
    private Integer over55CardsAgainstPercentage_overall;
    private Integer over65CardsAgainstPercentage_overall;
    private Integer over05CardsAgainstPercentage_home;
    private Integer over15CardsAgainstPercentage_home;
    private Integer over25CardsAgainstPercentage_home;
    private Integer over35CardsAgainstPercentage_home;
    private Integer over45CardsAgainstPercentage_home;
    private Integer over55CardsAgainstPercentage_home;
    private Integer over65CardsAgainstPercentage_home;
    private Integer over05CardsAgainstPercentage_away;
    private Integer over15CardsAgainstPercentage_away;
    private Integer over25CardsAgainstPercentage_away;
    private Integer over35CardsAgainstPercentage_away;
    private Integer over45CardsAgainstPercentage_away;
    private Integer over55CardsAgainstPercentage_away;
    private Integer over65CardsAgainstPercentage_away;
    private Integer firstGoalScoredPercentage_home;
    private Integer firstGoalScoredPercentage_away;
    private Integer firstGoalScoredPercentage_overall;
    private Integer over05OffsidesPercentage_overall;
    private Integer over15OffsidesPercentage_overall;
    private Integer over25OffsidesPercentage_overall;
    private Integer over35OffsidesPercentage_overall;
    private Integer over45OffsidesPercentage_overall;
    private Integer over55OffsidesPercentage_overall;
    private Integer over65OffsidesPercentage_overall;
    private Integer over05OffsidesPercentage_home;
    private Integer over15OffsidesPercentage_home;
    private Integer over25OffsidesPercentage_home;
    private Integer over35OffsidesPercentage_home;
    private Integer over45OffsidesPercentage_home;
    private Integer over55OffsidesPercentage_home;
    private Integer over65OffsidesPercentage_home;
    private Integer over05OffsidesPercentage_away;
    private Integer over15OffsidesPercentage_away;
    private Integer over25OffsidesPercentage_away;
    private Integer over35OffsidesPercentage_away;
    private Integer over45OffsidesPercentage_away;
    private Integer over55OffsidesPercentage_away;
    private Integer over65OffsidesPercentage_away;
    private Integer over25_2hg_percentage_overall;
    private Integer over15_2hg_percentage_overall;
    private Integer over05_2hg_percentage_overall;
    private Integer over25_2hg_percentage_home;
    private Integer over15_2hg_percentage_home;
    private Integer over05_2hg_percentage_home;
    private Integer over25_2hg_percentage_away;
    private Integer over15_2hg_percentage_away;
    private Integer over05_2hg_percentage_away;
    private Integer wins_2hg_percentage_overall;
    private Integer wins_2hg_percentage_home;
    private Integer wins_2hg_percentage_away;
    private Integer draws_2hg_percentage_overall;
    private Integer draws_2hg_percentage_home;
    private Integer draws_2hg_percentage_away;
    private Integer losses_2hg_percentage_overall;
    private Integer losses_2hg_percentage_home;
    private Integer losses_2hg_percentage_away;
    private Integer over05CardsForPercentage_home;
    private Integer over15CardsForPercentage_home;
    private Integer over25CardsForPercentage_home;
    private Integer over35CardsForPercentage_home;
    private Integer over45CardsForPercentage_home;
    private Integer over55CardsForPercentage_home;
    private Integer over65CardsForPercentage_home;

    public TeamStatsPercentage() {
    }


}
