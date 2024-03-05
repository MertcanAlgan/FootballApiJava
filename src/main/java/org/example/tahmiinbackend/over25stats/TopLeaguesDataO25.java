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
@JsonIgnoreProperties({"name_jp","name_tr","name_kr","name_ru","name_es",})
public class TopLeaguesDataO25 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_leagues_data_id;
    private Double seasonAVG_overall;
    private Integer seasonOver25Percentage_overall;
    private Integer progress;
    private Integer id;
    private String name;
    private String country;
    private Integer domestic_scale;
    private Integer international_scale;
    private String status;
    private Integer division;
    private Integer starting_year;
    private Integer ending_year;
    private Integer comp_master_id;
    private String country_iso;
    public TopLeaguesDataO25() {
    }
}
