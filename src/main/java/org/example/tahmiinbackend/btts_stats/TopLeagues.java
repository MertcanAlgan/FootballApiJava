package org.example.tahmiinbackend.btts_stats;

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
public class TopLeagues {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_leagues_id;
    private String title;
    private String list_type;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "top_leagues_id", referencedColumnName = "top_leagues_id")
    private List<TopLeaguesData> data;
    public TopLeagues() {
    }
}
