package org.example.tahmiinbackend.btts_stats;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@Entity
@AllArgsConstructor
@Table
@JsonIgnoreProperties({"name_jp","name_tr","name_kr","name_pt","name_ru","name_es"})
public class TopTeamsData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_teams_data_id;
    private Integer seasonBTTS_overall;
    private Integer seasonMatchesPlayed_overall;
    private Integer seasonBTTSPercentage_overall;
    private Integer id;
    private String country;
    private String name;
    private String full_name;
    private Integer next_match_id;
    private Integer next_match_date;
    private String next_match_team;
    private Double odds_btts_yes;
    private String country_iso;
    public TopTeamsData() {
    }
}
