package org.example.tahmiinbackend.countries;

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
public class Countries {
    @Id
    @SequenceGenerator(
            name = "countries_sequence",
            sequenceName = "countries_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "countries_sequence"
    )
    private Long country_id;
    private String country_name;
    private String country_logo;

    public Countries() {
    }

    public Countries(Long country_id, String country_name, String country_logo) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.country_logo = country_logo;
    }

    public Countries(String country_name, String country_logo) {
        this.country_name = country_name;
        this.country_logo = country_logo;
    }
}
