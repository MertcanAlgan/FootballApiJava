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

    public Countries(Long country_id, Long id, String iso, String country, String name_jp, String name_tr, String name_kr, String name_pt, String name_ru, String name_es, String name_nl, String name_se, String name_de, Long iso_number) {
        this.country_id = country_id;
        this.id = id;
        this.iso = iso;
        this.country = country;
        this.name_jp = name_jp;
        this.name_tr = name_tr;
        this.name_kr = name_kr;
        this.name_pt = name_pt;
        this.name_ru = name_ru;
        this.name_es = name_es;
        this.name_nl = name_nl;
        this.name_se = name_se;
        this.name_de = name_de;
        this.iso_number = iso_number;
    }

    public Countries(Long id, String iso, String country, String name_jp, String name_tr, String name_kr, String name_pt, String name_ru, String name_es, String name_nl, String name_se, String name_de, Long iso_number) {
        this.id = id;
        this.iso = iso;
        this.country = country;
        this.name_jp = name_jp;
        this.name_tr = name_tr;
        this.name_kr = name_kr;
        this.name_pt = name_pt;
        this.name_ru = name_ru;
        this.name_es = name_es;
        this.name_nl = name_nl;
        this.name_se = name_se;
        this.name_de = name_de;
        this.iso_number = iso_number;
    }
}
