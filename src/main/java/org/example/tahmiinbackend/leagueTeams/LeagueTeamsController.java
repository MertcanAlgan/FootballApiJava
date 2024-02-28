package org.example.tahmiinbackend.leagueTeams;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LeagueTeamsController {
    private final LeagueTeamsService leagueTeamsService;
    public LeagueTeamsController(LeagueTeamsService leagueTeamsService){
        this.leagueTeamsService = leagueTeamsService;
    }
    @GetMapping("/auth/fetch-league-teams-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase(){leagueTeamsService.fetchLeagueTeamsDataAndSaveToDatabase();}
}
