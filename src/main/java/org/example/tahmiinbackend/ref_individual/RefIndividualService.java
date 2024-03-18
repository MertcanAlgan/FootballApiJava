package org.example.tahmiinbackend.ref_individual;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class RefIndividualService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/referee?key=***&referee_id=207";
    private final RefIndividualRepository refIndividualRepository;

    private final RestTemplate restTemplate;

    public RefIndividualService(RefIndividualRepository refIndividualRepository, RestTemplate restTemplate) {
        this.refIndividualRepository = refIndividualRepository;
        this.restTemplate = restTemplate;
    }

    public void fetchRefIndividualDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);

        if (response != null && response.has("data")) {
            JsonNode dataNode = response.get("data");

            try {
                ObjectMapper mapper = new ObjectMapper();
                RefIndividual[] refs = mapper.convertValue(dataNode, RefIndividual[].class);
                refIndividualRepository.saveAll(Arrays.asList(refs));
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
