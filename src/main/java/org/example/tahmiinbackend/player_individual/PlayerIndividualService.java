package org.example.tahmiinbackend.player_individual;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.tahmiinbackend.match_details.MatchDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class PlayerIndividualService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/player-stats?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44&player_id=471122";
    private final PlayerIndividualRepository playerIndividualRepository;

    private final RestTemplate restTemplate;

    public PlayerIndividualService(PlayerIndividualRepository playerIndividualRepository, RestTemplate restTemplate) {
        this.playerIndividualRepository = playerIndividualRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchPlayerIndividualDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataNode = response.get("data");

            try {
                ObjectMapper mapper = new ObjectMapper();
                PlayerIndividual[] players = mapper.convertValue(dataNode, PlayerIndividual[].class);
                playerIndividualRepository.saveAll(Arrays.asList(players));
                System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
            } catch (Exception e) {
                System.err.println("Hata: " + e.getMessage());
                System.err.println("Sorunlu veri: " + dataNode.toString());
            }
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }


}
