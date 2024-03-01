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
@JsonIgnoreProperties({""})
public class SpecificTablesGroups {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long specific_tables_groups_id;
    private String name;
    private Integer group_id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "specific_tables_id")
    private List<SpecificTablesGroupsTable> table;

    public SpecificTablesGroups() {
    }
}
