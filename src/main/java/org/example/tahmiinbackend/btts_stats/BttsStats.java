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
public class BttsStats {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "btts_stats_sequence")
    @SequenceGenerator(name = "btts_stats_sequence", sequenceName = "btts_stats_sequence", allocationSize = 1)
    private Long btts_stats_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "btts_stats_id", referencedColumnName = "btts_stats_id")
    private TopTeams top_teams;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "btts_stats_id", referencedColumnName = "btts_stats_id")
    private TopFixtures top_fixtures;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "btts_stats_id", referencedColumnName = "btts_stats_id")
    private TopLeagues top_leagues;
    public BttsStats() {
    }
}
