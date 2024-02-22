package org.example.tahmiinbackend.leagues;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class LeaguesService {
    private static final String EXTERNAL_API_URL = "https://notebook.batu.pl/get_leagues";
    private final LeaguesRepository leagueRepository;
    private final RestTemplate restTemplate;

    public LeaguesService(RestTemplate restTemplate, LeaguesRepository leagueRepository) {
        this.restTemplate = restTemplate;
        this.leagueRepository = leagueRepository;
    }
    @Transactional
    public void fetchLeagueDataAndSaveToDatabase() {
        Leagues[] leagueDataArray = restTemplate.getForObject(EXTERNAL_API_URL, Leagues[].class);

        if (leagueDataArray != null) {
            leagueRepository.saveAll(Arrays.asList(leagueDataArray));
            System.out.println("Veri başarıyla alındı ve veritabanına kaydedildi!");
        } else {
            throw new RuntimeException("Veri alınamadı!");
        }
    }
    public List<Leagues> getLeagueData() {
        return leagueRepository.findAll();
    }
    public Optional<Leagues> getLeagueDataById(Long league_id) {
        return leagueRepository.findLeaguesByLeagueId(league_id);
    }
    public Optional<Leagues> getLeagueDataBySeason(String league_season) {
        return leagueRepository.findLeaguesByLeagueSeason(league_season);
    }
    public List<Leagues> getLeagueDataByCountryId(Long country_id) {
        return leagueRepository.findLeaguesByCountryId(country_id);
    }
}
