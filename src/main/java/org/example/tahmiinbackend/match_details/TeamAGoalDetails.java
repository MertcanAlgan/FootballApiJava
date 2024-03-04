package org.example.tahmiinbackend.match_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@Entity
@Table
@JsonIgnoreProperties({"extra" })
public class TeamAGoalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long team_a_goal_id;
    private Integer player_id;
    private String time;
    private Integer assist_player_id;

    public TeamAGoalDetails() {
    }
}
