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
public class TopTeams {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long top_teams_id;
    private String title;
    private String list_type;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "top_teams_id", referencedColumnName = "top_teams_id")
    private List<TopTeamsData> data;

    public TopTeams() {
    }

}
