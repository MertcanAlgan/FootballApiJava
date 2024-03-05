package org.example.tahmiinbackend.over25stats;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@Entity
@AllArgsConstructor
@Table
public class Over25Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "over25_stats_sequence")
    @SequenceGenerator(name = "over25_stats_sequence", sequenceName = "over25_stats_sequence", allocationSize = 1)
    private Long over25_stats_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "over25_stats_id", referencedColumnName = "over25_stats_id")
    private TopTeamsO25 top_teams;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "over25_stats_id", referencedColumnName = "over25_stats_id")
    private TopFixturesO25 top_fixtures;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "over25_stats_id", referencedColumnName = "over25_stats_id")
    private TopLeaguesO25 top_leagues;
    public Over25Stats() {
    }
}
