package org.example.tahmiinbackend.over25stats;

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
public class TopTeamsDataO25 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_teams_data_id;
    private Integer seasonOver25Num_overall;
    private Double seasonAVG_overall;
    private Integer seasonMatchesPlayed_overall;
    private Integer seasonOver25Percentage_overall;
    private Integer seasonUnder25Percentage_overall;
    private Integer id;
    private String country;
    private String name;
    private String full_name;
    private Integer next_match_id;
    private Integer next_match_date;
    private String next_match_team;
    private Double odds_ft_over25;
    private String country_iso;

    public TopTeamsDataO25() {
    }
}
