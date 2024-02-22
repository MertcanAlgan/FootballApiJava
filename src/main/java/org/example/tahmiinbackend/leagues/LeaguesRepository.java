package org.example.tahmiinbackend.leagues;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LeaguesRepository extends JpaRepository<Leagues, Long> {
    @Query("SELECT l FROM Leagues l WHERE l.league_id = ?1")
    Optional<Leagues> findLeaguesByLeagueId(Long leagueId);

    @Query("SELECT l FROM Leagues l WHERE l.league_season = ?1")
    Optional<Leagues> findLeaguesByLeagueSeason(String leagueSeason);

    @Query("select l from Leagues l where l.country_id = ?1")
    List<Leagues> findLeaguesByCountryId(Long country_id);
}
