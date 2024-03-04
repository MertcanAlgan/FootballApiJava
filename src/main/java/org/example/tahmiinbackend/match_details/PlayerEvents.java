package org.example.tahmiinbackend.match_details;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@Builder
@Entity
@Table
public class PlayerEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long player_events_id;
    private String event_type;
    private String event_time;

    public PlayerEvents() {
    }

}
