package org.example.tahmiinbackend.season;

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
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seasons_id;
    private Long id;
    private String year;

    public Season() {
    }

    public Season(Long seasons_id, Long id, String year) {
        this.seasons_id = seasons_id;
        this.id = id;
        this.year = year;
    }

    public Season(Long id, String year) {
        this.id = id;
        this.year = year;
    }
}
