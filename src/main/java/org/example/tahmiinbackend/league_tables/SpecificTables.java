package org.example.tahmiinbackend.league_tables;

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
@JsonIgnoreProperties({"description"})
public class SpecificTables {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long specific_tables_id;
    private String round;
    private Integer round_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "specific_tables_id")
    private List<SpecificTablesTable> table;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "specific_tables_id")
    private List<SpecificTablesGroups> groups;



    public SpecificTables() {
    }
}
