package org.example.tahmiinbackend.tahmiin_by_writters;


import jakarta.persistence.*;
import lombok.*;
import org.example.tahmiinbackend.user.User;

import java.util.Date;

@Getter
@Setter
@Data
@Builder
@Entity
@AllArgsConstructor
@Table
public class TahmiinByWritters {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tahmiin_by_writters_sequence")
    @SequenceGenerator(name = "tahmiin_by_writters_sequence", sequenceName = "tahmiin_by_writters_sequence", allocationSize = 1)
    private Long tahmiin_by_writters_id;
    private String header;
    private String content;
    private String highlightedMatch;
    private String highlightStatistics;
    private Integer maxLength;
    private String date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
    public TahmiinByWritters() {
    }
}
