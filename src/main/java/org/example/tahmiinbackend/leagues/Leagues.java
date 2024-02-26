package org.example.tahmiinbackend.leagues;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.tahmiinbackend.season.Season;

import java.util.List;

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
    private String name;
    private String country;
    private String image;
    private String league_name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "league_id", referencedColumnName = "league_id")
    private List<Season> season;

    public Leagues() {
    }

    public Leagues(Long league_id, String name, String country, String image, String league_name, List<Season> season) {
        this.league_id = league_id;
        this.name = name;
        this.country = country;
        this.image = image;
        this.league_name = league_name;
        this.season = season;
    }

    public Leagues(String name, String country, String image, String league_name, List<Season> season) {
        this.name = name;
        this.country = country;
        this.image = image;
        this.league_name = league_name;
        this.season = season;
    }
}
