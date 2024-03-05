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
@JsonIgnoreProperties({})
public class TopFixturesDataO25 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_fixtures_data_id;
    private Integer id;
    private Integer o25_potential;
    private Double odds_ft_over25;
    private String home_name;
    private String away_name;
    private Double avg_potential;
    private Integer date_unix;
    private String country;
    private String name;
    private Integer progress;
    private String country_iso;
    private Integer next_match_id;

    public TopFixturesDataO25() {
    }
}
