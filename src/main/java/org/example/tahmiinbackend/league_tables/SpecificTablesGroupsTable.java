package org.example.tahmiinbackend.league_tables;

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
@JsonIgnoreProperties({"url","seasonURL_overall","seasonURL_home","seasonURL_away","corrections","zone"})
public class SpecificTablesGroupsTable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long specific_tables_groups_table_id;
    private Integer id;
    private Integer seasonGoals_home;
    private Integer seasonGoals_away;
    private Integer seasonConceded_away;
    private Integer seasonConceded_home;
    private Integer seasonGoals;
    private Integer points;
    private Integer seasonConceded;
    private Integer seasonGoalDifference;
    private Integer seasonWins_home;
    private Integer seasonWins_away;
    private Integer seasonWins_overall;
    private Integer seasonDraws_home;
    private Integer seasonDraws_away;
    private Integer seasonDraws_overall;
    private Integer seasonLosses_home;
    private Integer seasonLosses_away;
    private Integer seasonLosses_overall;
    private Integer matchesPlayed;
    private String name;
    private String country;
    private String cleanName;
    private String shortHand;
    private Integer position;
    private String wdl_record;

    public SpecificTablesGroupsTable() {
    }

}
