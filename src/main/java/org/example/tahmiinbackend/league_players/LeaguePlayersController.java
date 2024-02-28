package org.example.tahmiinbackend.league_players;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LeaguePlayersController {
    private final LeaguePlayersService leaguePlayersService;

    public LeaguePlayersController(LeaguePlayersService leaguePlayersService) {
        this.leaguePlayersService = leaguePlayersService;
    }

    @GetMapping("/auth/fetch-league-players-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        leaguePlayersService.fetchLeaguePlayersDataAndSaveToDatabase();
    }
}
