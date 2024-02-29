package org.example.tahmiinbackend.match_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@Builder
@Entity
@Table
@AllArgsConstructor
@JsonIgnoreProperties({"extra" })
public class TeamBGoalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long team_b_goal_id;
    private Integer player_id;
    private String time;
    private Integer assist_player_id;

    public TeamBGoalDetails() {
    }

}
