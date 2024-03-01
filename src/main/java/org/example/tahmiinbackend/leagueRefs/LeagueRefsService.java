package org.example.tahmiinbackend.leagueRefs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.tahmiinbackend.league_players.LeaguePlayers;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LeagueRefsService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/league-referees?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44&season_id=9655";

    private final LeagueRefsRepository leagueRefsRepository;
    private final RestTemplate restTemplate;


    public LeagueRefsService(LeagueRefsRepository leagueRefsRepository, RestTemplate restTemplate) {
        this.leagueRefsRepository = leagueRefsRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchLeagueRefsAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataArray = response.get("data");

            if (dataArray.isArray()) {
                for (JsonNode dataNode : dataArray) {
                    LeagueRefs leagueRefs = new ObjectMapper().convertValue(dataNode, LeagueRefs.class);
                    leagueRefsRepository.save(leagueRefs);
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
