package org.example.tahmiinbackend.leagueTeams;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@Entity
@Table
@JsonIgnoreProperties({"url","alt_names", "official_sites"})
public class LeagueTeams {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "league_teams_sequence")
    @SequenceGenerator(name = "league_teams_sequence", sequenceName = "league_teams_sequence", allocationSize = 1)
    private Long league_teams_id;
    private Long id;
    private String name;
    private String cleanName;
    private String english_name;
    private String shortHand;
    private String country;
    private String continent;
    private String founded;
    private String image;
    private String flag_element;
    private String season;
    private String seasonClean;
    private Integer table_position;
    private Integer performance_rank;
    private Integer risk;
    private String season_format;
    private Long competition_id;
    private String full_name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "league_teams_id", referencedColumnName = "league_teams_id")
    private List<TeamStats> stats;

    public LeagueTeams() {
    }

}
