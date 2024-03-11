package org.example.tahmiinbackend.tahmiin_by_writters;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@Entity
@AllArgsConstructor
@Table
public class TahmiinByWriters {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tahmiin_by_writters_sequence")
    @SequenceGenerator(name = "tahmiin_by_writters_sequence", sequenceName = "tahmiin_by_writters_sequence", allocationSize = 1)
    private Long tahmiin_by_writers_id;
    private Integer writerId;
    private Integer matchId;
    private String highlightedStat;
    private String comment;
    private String date;
    private Integer likes = 0;


    public TahmiinByWriters() {
    }
}
