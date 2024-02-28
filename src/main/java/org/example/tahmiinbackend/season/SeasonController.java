package org.example.tahmiinbackend.season;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SeasonController {
    private final SeasonService seasonService;

    public SeasonController(SeasonService seasonService){
        this.seasonService = seasonService;
    }

    @GetMapping("/auth/seasons/get-seasons-by-seasons-id/{seasons_id}")
    public Optional<Season> getSeasonBySeasonsId(@PathVariable("seasons_id") Long seasons_id){
        return seasonService.getSeasonsBySeasonsId(seasons_id);
    }
}
