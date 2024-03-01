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
public class AllMatchesTableHome {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long all_matches_table_home_id;
    private Integer id;
    private Integer seasonGoals;
    private Integer seasonConceded;
    private Integer points;
    private Integer seasonGoalDifference;
    private Integer seasonWins;
    private Integer seasonDraws;
    private Integer seasonLosses_home;
    private Integer matchesPlayed;
    private String name;
    private String country;
    private String cleanName;
    private String shortHand;
    private Integer position;


    public AllMatchesTableHome() {
    }
}
