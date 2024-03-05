package org.example.tahmiinbackend.over25stats;

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
@JsonIgnoreProperties({})
public class TopFixturesO25 {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_fixtures_id;
    private String title;
    private String list_type;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "top_fixtures_id", referencedColumnName = "top_fixtures_id")
    private List<TopFixturesDataO25> data;


    public TopFixturesO25() {
    }
}
