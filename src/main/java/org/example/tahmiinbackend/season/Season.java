package org.example.tahmiinbackend.season;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@Builder
@Entity
@Table
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seasons_id;
    private Long id;
    private String year;

    public Season() {
    }
}
