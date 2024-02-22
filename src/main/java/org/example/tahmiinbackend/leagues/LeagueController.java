package org.example.tahmiinbackend.leagues;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth/leagues")
public class LeagueController {
    private final LeaguesService leaguesService;

    public LeagueController(LeaguesService leaguesService) {
        this.leaguesService = leaguesService;
    }
    @GetMapping("/fetch-league-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        leaguesService.fetchLeagueDataAndSaveToDatabase();
    }

    @GetMapping("/get-leagues")
    public List<Leagues> getLeagueData() {
        return leaguesService.getLeagueData();
    }

    @GetMapping("/get-leagues/{league_id}")
    public Optional<Leagues> getLeagueDataById(@PathVariable("league_id") Long league_id) {
        System.out.println("league_id: " + league_id);
        return leaguesService.getLeagueDataById(league_id);
    }
    @PostMapping("/get-leagues-by-season")
    public Optional<Leagues> getLeagueDataBySeason(@RequestBody String league_season) {
        return leaguesService.getLeagueDataBySeason(league_season);
    }

    @GetMapping("/get-leagues-by-country-id/{country_id}")
    public List<Leagues> getLeagueDataByCountryId(@PathVariable("country_id") Long country_id) {
        return leaguesService.getLeagueDataByCountryId(country_id);
    }
}
