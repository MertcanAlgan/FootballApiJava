package org.example.tahmiinbackend.leagueTeams;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@Entity
@Table
@JsonIgnoreProperties({"alt_names", "official_sites"})
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
    private String url;
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

    public LeagueTeams(Long league_teams_id, Long id, String name, String cleanName, String english_name, String shortHand, String country, String continent, String founded, String image, String flag_element, String season, String seasonClean, String url, Integer table_position, Integer performance_rank, Integer risk, String season_format, Long competition_id, String full_name, List<TeamStats> stats) {
        this.league_teams_id = league_teams_id;
        this.id = id;
        this.name = name;
        this.cleanName = cleanName;
        this.english_name = english_name;
        this.shortHand = shortHand;
        this.country = country;
        this.continent = continent;
        this.founded = founded;
        this.image = image;
        this.flag_element = flag_element;
        this.season = season;
        this.seasonClean = seasonClean;
        this.url = url;
        this.table_position = table_position;
        this.performance_rank = performance_rank;
        this.risk = risk;
        this.season_format = season_format;
        this.competition_id = competition_id;
        this.full_name = full_name;
        this.stats = stats;
    }

    public LeagueTeams(Long id, String name, String cleanName, String english_name, String shortHand, String country, String continent, String founded, String image, String flag_element, String season, String seasonClean, String url, Integer table_position, Integer performance_rank, Integer risk, String season_format, Long competition_id, String full_name, List<TeamStats> stats) {
        this.id = id;
        this.name = name;
        this.cleanName = cleanName;
        this.english_name = english_name;
        this.shortHand = shortHand;
        this.country = country;
        this.continent = continent;
        this.founded = founded;
        this.image = image;
        this.flag_element = flag_element;
        this.season = season;
        this.seasonClean = seasonClean;
        this.url = url;
        this.table_position = table_position;
        this.performance_rank = performance_rank;
        this.risk = risk;
        this.season_format = season_format;
        this.competition_id = competition_id;
        this.full_name = full_name;
        this.stats = stats;
    }
}
