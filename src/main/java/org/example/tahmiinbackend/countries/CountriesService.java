package org.example.tahmiinbackend.countries;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.tahmiinbackend.leagues.Leagues;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CountriesService {
    private static final String EXTERNAL_API_URL = "https://api.football-data-api.com/country-list?key=***";
    private final CountriesRepository countriesRepository;
    private final RestTemplate restTemplate;

    public CountriesService(RestTemplate restTemplate, CountriesRepository countriesRepository) {
        this.restTemplate = restTemplate;
        this.countriesRepository = countriesRepository;
    }
    @Transactional
    public void fetchCountriesDataAndSaveToDatabase() {
        JsonNode response = restTemplate.getForObject(EXTERNAL_API_URL, JsonNode.class);
        if (response != null && response.has("data")){
            JsonNode dataNode = response.get("data");
            Countries[] countriesDataArray = new ObjectMapper().convertValue(dataNode, Countries[].class);
            if (countriesDataArray != null) {
                countriesRepository.saveAll(Arrays.asList(countriesDataArray));
                System.out.println("Data successfully fetched and saved to the database!");
            } else {
                throw new RuntimeException("Data could not be fetched!");
            }
        }else {
            throw new RuntimeException("Data could not be fetched or 'data' part could not be found!");
        }
    }
    public List<Countries> getCountriesData() {
        return countriesRepository.findAll();
    }
}
