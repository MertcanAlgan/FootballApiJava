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
@JsonIgnoreProperties({})
public class TopFixturesData{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_fixtures_data_id;
    private Integer id;
    private Double avg_potential;
    private Integer date_unix;
    private Integer btts_potential;
    private Double odds_btts_yes;
    private Integer o25_potential;
    private String home_name;
    private String away_name;
    private String country;
    private String name;
    private Integer progress;
    private String country_iso;
    private Integer next_match_id;

    public TopFixturesData() {
    }
}
