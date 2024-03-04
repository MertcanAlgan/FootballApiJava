package org.example.tahmiinbackend.todays_matches;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TodaysMatchesController {
    private final TodaysMatchesService todaysMatchesService;

    public TodaysMatchesController(TodaysMatchesService todaysMatchesService) {
        this.todaysMatchesService = todaysMatchesService;
    }

    @RequestMapping("/auth/fetch-todays-matches-and-save-to-database")
    public void fetchTodaysMatchesAndSaveToDatabase() {
        todaysMatchesService.fetchTodaysMatchesAndSaveToDatabase();
    }
}
