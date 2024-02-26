package org.example.tahmiinbackend.countries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountriesController {
    private final CountriesService countriesService;
    public CountriesController(CountriesService countriesService) {
        this.countriesService = countriesService;
    }
    @GetMapping("/fetch-countries-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        countriesService.fetchCountriesDataAndSaveToDatabase();
    }
    @GetMapping("auth/countries/get-countries")
    public List<Countries> getCountriesData() {
        return countriesService.getCountriesData();
    }
}
