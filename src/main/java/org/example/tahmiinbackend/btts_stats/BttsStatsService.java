package org.example.tahmiinbackend.btts_stats;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BttsStatsService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/stats-data-btts?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44";

    private final BttsStatsRepository bttsStatsRepository;

    private final RestTemplate restTemplate;

    public BttsStatsService(BttsStatsRepository bttsStatsRepository, RestTemplate restTemplate) {
        this.bttsStatsRepository = bttsStatsRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchBttsStatsAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataNode = response.get("data");

            BttsStats bttsStats = new ObjectMapper().convertValue(dataNode, BttsStats.class);
            bttsStatsRepository.save(bttsStats);

            System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }

    public BttsStats getBttsStatsById(Long btts_stats_id) {
        return bttsStatsRepository.findBttsStatsById(btts_stats_id)
                .orElseThrow(() -> new RuntimeException("Veri bulunamadı!"));
    }
}
