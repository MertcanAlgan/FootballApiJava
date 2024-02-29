package org.example.tahmiinbackend.match_details;

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
public class PlayerEvents {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long player_events_id;
    private String event_type;
    private String event_time;

    public PlayerEvents() {
    }

    public PlayerEvents(Long player_events_id, String event_type, String event_time) {
        this.player_events_id = player_events_id;
        this.event_type = event_type;
        this.event_time = event_time;
    }

    public PlayerEvents(String event_type, String event_time) {
        this.event_type = event_type;
        this.event_time = event_time;
    }
}
