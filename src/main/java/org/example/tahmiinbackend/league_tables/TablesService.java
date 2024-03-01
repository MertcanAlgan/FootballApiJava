package org.example.tahmiinbackend.league_tables;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.tahmiinbackend.leagueRefs.LeagueRefs;
import org.example.tahmiinbackend.match_details.MatchDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TablesService {

    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/league-tables?key=b4c96aa77c4b2329ef750b7d756ea708865bbaae3c257660ba39dfa013493d44&season_id=9655";

    private final TablesRepository tablesRepository;
    private final RestTemplate restTemplate;

    public TablesService(TablesRepository tablesRepository, RestTemplate restTemplate) {
        this.tablesRepository = tablesRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchTablesAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataNode = response.get("data");

            try {
                ObjectMapper mapper = new ObjectMapper();
                MainTables mainTables = mapper.readValue(dataNode.toString(), MainTables.class);
                tablesRepository.save(mainTables);
                System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
            } catch (Exception e) {
                System.err.println("Hata: " + e.getMessage());
                System.err.println("Sorunlu veri: " + dataNode.toString());
            }
        } else {
            throw new RuntimeException("Veri alınamadı veya 'data' kısmı bulunamadı!");
        }
    }

    public MainTables getTablesById(Long main_tables_id) {
        return tablesRepository.findMainTablesById(main_tables_id)
                .orElseThrow(() -> new RuntimeException("Veri bulunamadı!"));
    }

}
