package org.example.tahmiinbackend.countries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CountriesRepository extends JpaRepository<Countries, Long> {
    @Query("SELECT c FROM Countries c WHERE c.country_id = ?1")
    Optional<Countries> findCountriesByCountryId(Long countryId);
}
