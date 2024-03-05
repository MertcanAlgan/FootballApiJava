package org.example.tahmiinbackend.over25stats;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Over25StatsController {
    private final Over25StatsService over25StatsService;

    public Over25StatsController(Over25StatsService over25StatsService){
        this.over25StatsService = over25StatsService;
    }

    @GetMapping("/auth/fetch-over25-stats-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase(){over25StatsService.fetchOver25StatsAndSaveToDatabase();}

    @GetMapping("/auth/over25-stats/{over25_stats_id}")
    public Over25Stats getOver25StatsById(@PathVariable Long over25_stats_id){
        return over25StatsService.getOver25StatsById(over25_stats_id);
    }
}
