package org.example.tahmiinbackend.countries;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
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
    private Long id;
    private String iso;
    private String country;
    private String name_jp;
    private String name_tr;
    private String name_kr;
    private String name_pt;
    private String name_ru;
    private String name_es;
    private String name_nl;
    private String name_se;
    private String name_de;
    private Long iso_number;

    public Countries() {
    }
}
