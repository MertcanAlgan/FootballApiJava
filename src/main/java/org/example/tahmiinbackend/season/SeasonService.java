package org.example.tahmiinbackend.season;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeasonService {
    private final SeasonRepository seasonRepository;

    public SeasonService(SeasonRepository seasonRepository){
        this.seasonRepository = seasonRepository;
    }

    public Optional<Season> getSeasonsBySeasonsId(Long seasons_id){
        return seasonRepository.findSeasonBySeasons_id(seasons_id);
    }
}
