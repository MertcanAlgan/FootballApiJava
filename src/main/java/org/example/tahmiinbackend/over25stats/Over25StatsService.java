package org.example.tahmiinbackend.over25stats;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Over25StatsService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/stats-data-over25?key=***";

    private final Over25StatsRepository over25StatsRepository;

    private final RestTemplate restTemplate;

    public Over25StatsService(Over25StatsRepository over25StatsRepository, RestTemplate restTemplate) {
        this.over25StatsRepository = over25StatsRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchOver25StatsAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataNode = response.get("data");

            Over25Stats over25Stats = new ObjectMapper().convertValue(dataNode, Over25Stats.class);
            over25StatsRepository.save(over25Stats);

            System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }

    public Over25Stats getOver25StatsById(Long over25_stats_id) {
        return over25StatsRepository.findOver25StatsById(over25_stats_id)
                .orElseThrow(() -> new RuntimeException("Veri bulunamadı!"));
    }
}
