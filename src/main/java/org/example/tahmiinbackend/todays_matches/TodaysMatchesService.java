package org.example.tahmiinbackend.todays_matches;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.tahmiinbackend.leagueRefs.LeagueRefs;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TodaysMatchesService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/todays-matches?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44";

    private final TodaysMatchesRepository todaysMatchesRepository;
    private final RestTemplate restTemplate;

    public TodaysMatchesService(TodaysMatchesRepository todaysMatchesRepository, RestTemplate restTemplate) {
        this.todaysMatchesRepository = todaysMatchesRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchTodaysMatchesAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataArray = response.get("data");

            if (dataArray.isArray()) {
                for (JsonNode dataNode : dataArray) {
                    TodaysMatches todaysMatches = new ObjectMapper().convertValue(dataNode, TodaysMatches.class);
                    todaysMatchesRepository.save(todaysMatches);
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
