package org.example.tahmiinbackend.league_matches;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LeagueMatchesController {

    private final LeagueMatchesService leagueMatchesService;

    public LeagueMatchesController(LeagueMatchesService leagueMatchesService) {
        this.leagueMatchesService = leagueMatchesService;
    }
    @GetMapping("/auth/fetch-league-matches-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        leagueMatchesService.fetchLeagueMatchesDataAndSaveToDatabase();
    }
}
