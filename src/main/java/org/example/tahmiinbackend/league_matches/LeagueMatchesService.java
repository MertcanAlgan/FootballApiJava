package org.example.tahmiinbackend.league_matches;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LeagueMatchesService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/league-matches?key=***&season_id=9655";
    private final LeagueMatchesRepository leagueMatchesRepository;
    private final RestTemplate restTemplate;

    public LeagueMatchesService(LeagueMatchesRepository leagueMatchesRepository, RestTemplate restTemplate) {
        this.leagueMatchesRepository = leagueMatchesRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchLeagueMatchesDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataArray = response.get("data");

            if (dataArray.isArray()) {
                for (JsonNode dataNode : dataArray) {
                    LeagueMatches leagueMatches = new ObjectMapper().convertValue(dataNode, LeagueMatches.class);
                    leagueMatchesRepository.save(leagueMatches);
                }
                System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
            } else {
                throw new RuntimeException("'data' bir dizi değil!");
            }
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }
}
