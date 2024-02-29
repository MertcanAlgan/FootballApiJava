package org.example.tahmiinbackend.match_details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@JsonIgnoreProperties({"extra" })
public class TeamAGoalDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_a_goal_sequence")
    @SequenceGenerator(name = "team_a_goal_sequence", sequenceName = "team_a_goal_sequence", allocationSize = 1)
    private Long team_a_goal_id;
    private Integer player_id;
    private String time;
    private Integer assist_player_id;

    public TeamAGoalDetails() {
    }

    public TeamAGoalDetails(Long team_a_goal_id, Integer player_id, String time, Integer assist_player_id) {
        this.team_a_goal_id = team_a_goal_id;
        this.player_id = player_id;
        this.time = time;
        this.assist_player_id = assist_player_id;
    }

    public TeamAGoalDetails(Integer player_id, String time, Integer assist_player_id) {
        this.player_id = player_id;
        this.time = time;
        this.assist_player_id = assist_player_id;
    }
}
