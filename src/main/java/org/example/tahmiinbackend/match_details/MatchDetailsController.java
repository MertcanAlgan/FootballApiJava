package org.example.tahmiinbackend.match_details;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MatchDetailsController {
    private final MatchDetailsService matchDetailsService;

    public MatchDetailsController(MatchDetailsService matchDetailsService) {
        this.matchDetailsService = matchDetailsService;
    }
    @GetMapping("/auth/fetch-match-details-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        matchDetailsService.fetchMatchDetailsDataAndSaveToDatabase();
    }
}
