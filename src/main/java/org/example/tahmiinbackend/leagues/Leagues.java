package org.example.tahmiinbackend.leagues;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
@Entity
@Table
public class Leagues {
    @Id
    @SequenceGenerator(
            name = "leagues_sequence",
            sequenceName = "leagues_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "leagues_sequence"
    )
    private Long league_id;
    private Long country_id;
    private String country_name;
    private String league_name;
    private String league_logo;
    private String country_logo;
    private String league_season;
    public Leagues() {
    }

    public Leagues(Long league_id, Long country_id, String country_name, String league_name, String league_logo, String country_logo, String league_season) {
        this.league_id = league_id;
        this.country_id = country_id;
        this.country_name = country_name;
        this.league_name = league_name;
        this.league_logo = league_logo;
        this.country_logo = country_logo;
        this.league_season = league_season;
    }

    public Leagues(Long country_id, String country_name, String league_name, String league_logo, String country_logo, String league_season) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.league_name = league_name;
        this.league_logo = league_logo;
        this.country_logo = country_logo;
        this.league_season = league_season;
    }
}
