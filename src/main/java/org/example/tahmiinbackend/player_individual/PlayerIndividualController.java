package org.example.tahmiinbackend.player_individual;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PlayerIndividualController {
    private final PlayerIndividualService playerIndividualService;

    public PlayerIndividualController(PlayerIndividualService playerIndividualService) {
        this.playerIndividualService = playerIndividualService;
    }

    @GetMapping("/auth/fetch-player-individual-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        playerIndividualService.fetchPlayerIndividualDataAndSaveToDatabase();
    }
}
