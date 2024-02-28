package org.example.tahmiinbackend.league_matches;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LeagueMatchesRepository extends JpaRepository<LeagueMatches, Long> {
    @Query("SELECT l FROM LeagueMatches l WHERE l.id = ?1")
    Optional<LeagueMatches>  findLeagueMatchesById(Long id);
}
