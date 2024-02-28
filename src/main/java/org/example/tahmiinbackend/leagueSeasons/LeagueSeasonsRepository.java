package org.example.tahmiinbackend.leagueSeasons;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LeagueSeasonsRepository extends JpaRepository<LeagueSeasons, Long> {
    @Query("select ls from LeagueSeasons ls where ls.league_seasons_id = ?1")
    Optional<LeagueSeasons> findLeagueSeasonsByLeague_seasons_id(Long league_seasons_id);
}
