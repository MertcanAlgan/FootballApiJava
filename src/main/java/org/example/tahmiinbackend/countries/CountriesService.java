package org.example.tahmiinbackend.countries;

import org.example.tahmiinbackend.leagues.Leagues;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CountriesService {
    private static final String EXTERNAL_API_URL = "https://notebook.batu.pl/get_countries";
    private final CountriesRepository countriesRepository;
    private final RestTemplate restTemplate;

    public CountriesService(RestTemplate restTemplate, CountriesRepository countriesRepository) {
        this.restTemplate = restTemplate;
        this.countriesRepository = countriesRepository;
    }
    @Transactional
    public void fetchCountriesDataAndSaveToDatabase() {
        Countries[] countriesDataArray = restTemplate.getForObject(EXTERNAL_API_URL, Countries[].class);

        if (countriesDataArray != null) {
            countriesRepository.saveAll(Arrays.asList(countriesDataArray));
            System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
        } else {
            throw new RuntimeException("Veri alınamadı!");
        }
    }
    public List<Countries> getCountriesData() {
        return countriesRepository.findAll();
    }
    public Countries getCountriesDataById(Long country_id) {
        return countriesRepository.findCountriesByCountryId(country_id).orElse(null);
    }
}
