package org.example.tahmiinbackend.leagues;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
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

    @GetMapping("auth/leagues/get-leagues/{league_id}")
    public Optional<Leagues> getLeagueDataById(@PathVariable("league_id") Long league_id) {
        System.out.println("league_id: " + league_id);
        return leaguesService.getLeagueDataById(league_id);
    }
    @PostMapping("auth/leagues/get-leagues-by-country")
    public List<Leagues> getLeaguesByCountry(@RequestBody Map<String, String> requestBody) {
        String country = requestBody.get("country");
        return leaguesService.getLeaguesByCountry(country);
    }
    @PostMapping("auth/leagues/get-leagues-by-name")
    public List<Leagues> getLeaguesByName(@RequestBody Map<String, String> requestBody){
        String name = requestBody.get("name");
        return leaguesService.getLeaguesByName(name);
    }
}
