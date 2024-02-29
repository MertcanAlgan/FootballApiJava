package org.example.tahmiinbackend.match_details;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MatchDetailsService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/match?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44&match_id=6682526";
    private final MatchDetailsRepository matchDetailsRepository;
    private final RestTemplate restTemplate;

    public MatchDetailsService(MatchDetailsRepository matchDetailsRepository, RestTemplate restTemplate) {
        this.matchDetailsRepository = matchDetailsRepository;
        this.restTemplate = restTemplate;
    }
    public void fetchMatchDetailsDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataArray = response.get("data");

            if (dataArray != null) {
                for (JsonNode dataNode : dataArray) {
                    try {
                        MatchDetails matchDetails = new ObjectMapper().convertValue(dataNode, MatchDetails.class);
                        matchDetailsRepository.save(matchDetails);
                        System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
                    } catch (Exception e) {
                        System.err.println("Hata: " + e.getMessage());
                        System.err.println("Sorunlu veri: " + dataNode.toString());
                    }
                }
            } else {
                throw new RuntimeException("'data' null değerinde!");
            }
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }


}
