package org.example.tahmiinbackend.league_tables;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
@JsonIgnoreProperties({})
public class MainTables {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "main_tables_sequence")
    @SequenceGenerator(name = "main_tables_sequence", sequenceName = "main_tables_sequence", allocationSize = 1)
    private Long main_tables_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_tables_id", referencedColumnName = "main_tables_id")
    private List<LeagueTables> league_table;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_tables_id", referencedColumnName = "main_tables_id")
    private List<SpecificTables> specific_tables;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_tables_id", referencedColumnName = "main_tables_id")
    private List<AllMatchesTableOverall> all_matches_table_overall;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_tables_id", referencedColumnName = "main_tables_id")
    private List<AllMatchesTableHome> all_matches_table_home;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "main_tables_id", referencedColumnName = "main_tables_id")
    private List<AllMatchesTableAway> all_matches_table_away;

    public MainTables() {
    }
}
