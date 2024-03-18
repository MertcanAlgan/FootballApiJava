package org.example.tahmiinbackend.leagueSeasons;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.tahmiinbackend.countries.Countries;
import org.example.tahmiinbackend.leagues.Leagues;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LeagueSeasonsService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/league-season?key=***&season_id=9655";

    private final LeagueSeasonsRepository leagueSeasonsRepository;
    private final RestTemplate restTemplate;

    public LeagueSeasonsService(RestTemplate restTemplate, LeagueSeasonsRepository leagueSeasonsRepository) {
        this.leagueSeasonsRepository = leagueSeasonsRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchLeagueSeasonDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataNode = response.get("data");

            LeagueSeasons leagueSeasons = new ObjectMapper().convertValue(dataNode, LeagueSeasons.class);
            leagueSeasonsRepository.save(leagueSeasons);

            System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }

    public Optional<LeagueSeasons> getLeagueSeasonsDataById(Long league_seasons_id){
        return leagueSeasonsRepository.findLeagueSeasonsByLeague_seasons_id(league_seasons_id);
    }

}