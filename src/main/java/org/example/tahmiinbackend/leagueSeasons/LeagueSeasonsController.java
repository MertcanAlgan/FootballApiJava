package org.example.tahmiinbackend.leagueSeasons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LeagueSeasonsController {
    private final LeagueSeasonsService leagueSeasonsService;

    public LeagueSeasonsController(LeagueSeasonsService leagueSeasonsService){
        this.leagueSeasonsService = leagueSeasonsService;
    }

    @GetMapping("/auth/fetch-league-seasons-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase(){leagueSeasonsService.fetchLeagueSeasonDataAndSaveToDatabase();}


    @GetMapping("/auth/get-league-seasons-by-id/{league_seasons_id}")
    public Optional<LeagueSeasons> getLeagueSeasonsDataById(@PathVariable("league_seasons_id") Long league_seasons_id){
        return leagueSeasonsService.getLeagueSeasonsDataById(league_seasons_id);
    }
}
