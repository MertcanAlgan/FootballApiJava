package org.example.tahmiinbackend.league_tables;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@Entity
@Table
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long zone_id;
    private String name;
    private Integer number;

    public Zone() {
    }
}
