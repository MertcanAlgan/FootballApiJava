package org.example.tahmiinbackend.leagues;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LeaguesService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/league-list?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44";
    private final LeaguesRepository leagueRepository;
    private final RestTemplate restTemplate;

    public LeaguesService(RestTemplate restTemplate, LeaguesRepository leagueRepository) {
        this.restTemplate = restTemplate;
        this.leagueRepository = leagueRepository;
    }
    @Transactional
    public void fetchLeagueDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataNode = response.get("data");
            Leagues[] leagueDataArray = new ObjectMapper().convertValue(dataNode, Leagues[].class);

            if (leagueDataArray != null) {
                leagueRepository.saveAll(Arrays.asList(leagueDataArray));
                System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
            } else {
                throw new RuntimeException("Veri alınamadı!");
            }
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }
    public List<Leagues> getLeagueData() {
        return leagueRepository.findAll();
    }
    public Optional<Leagues> getLeagueDataById(Long league_id) {
        return leagueRepository.findLeaguesByLeagueId(league_id);
    }
}
