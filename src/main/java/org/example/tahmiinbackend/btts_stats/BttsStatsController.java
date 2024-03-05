package org.example.tahmiinbackend.btts_stats;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BttsStatsController {
    private final BttsStatsService bttsStatsService;

    public BttsStatsController(BttsStatsService bttsStatsService){
        this.bttsStatsService = bttsStatsService;
    }

    @GetMapping("/auth/fetch-btts-stats-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase(){bttsStatsService.fetchBttsStatsAndSaveToDatabase();}

    @GetMapping("/auth/btts-stats/{btts_stats_id}")
    public BttsStats getBttsStatsById(@PathVariable Long btts_stats_id){
        return bttsStatsService.getBttsStatsById(btts_stats_id);
    }
}
