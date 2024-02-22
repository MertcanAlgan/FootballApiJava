package org.example.tahmiinbackend.countries;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/auth/countries")
public class CountriesController {
    private final CountriesService countriesService;
    public CountriesController(CountriesService countriesService) {
        this.countriesService = countriesService;
    }
    @GetMapping("/fetch-countries-data-and-save-to-database")
    public void fetchDataAndSaveToDatabase() {
        countriesService.fetchCountriesDataAndSaveToDatabase();
    }
    @GetMapping("/get-countries")
    public List<Countries> getCountriesData() {
        return countriesService.getCountriesData();
    }
    @GetMapping("/get-countries/{country_id}")
    public Countries getCountriesDataById(@PathVariable Long country_id) {
        return countriesService.getCountriesDataById(country_id);
    }
}
