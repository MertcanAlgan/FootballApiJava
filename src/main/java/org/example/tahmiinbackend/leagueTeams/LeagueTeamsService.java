package org.example.tahmiinbackend.leagueTeams;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.tahmiinbackend.leagueSeasons.LeagueSeasons;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeagueTeamsService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/league-teams?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44&season_id=9655&include=stats";

    private final LeagueTeamsRepository leagueTeamsRepository;
    private final RestTemplate restTemplate;

    public LeagueTeamsService(RestTemplate restTemplate, LeagueTeamsRepository leagueTeamsRepository) {
        this.leagueTeamsRepository = leagueTeamsRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchLeagueTeamsDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataArray = response.get("data");

            if (dataArray.isArray()) {
                for (JsonNode dataNode : dataArray) {
                    LeagueTeams leagueTeams = new ObjectMapper().convertValue(dataNode, LeagueTeams.class);
                    leagueTeamsRepository.save(leagueTeams);
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
