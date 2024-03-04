package org.example.tahmiinbackend.leagues;

import jakarta.persistence.*;
import lombok.*;
import org.example.tahmiinbackend.season.Season;

import java.util.List;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
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
}
