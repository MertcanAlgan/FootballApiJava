package org.example.tahmiinbackend.leagueRefs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LeagueRefsController {
    private final LeagueRefsService leagueRefsService;

    public LeagueRefsController(LeagueRefsService leagueRefsService) {
        this.leagueRefsService = leagueRefsService;
    }

    @GetMapping("/auth/fetch-league-refs-and-save-to-database")
    public void fetchLeagueRefsAndSaveToDatabase() {
        leagueRefsService.fetchLeagueRefsAndSaveToDatabase();
    }
}
