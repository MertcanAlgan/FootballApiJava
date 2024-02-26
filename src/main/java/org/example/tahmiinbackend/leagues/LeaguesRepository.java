package org.example.tahmiinbackend.leagues;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LeaguesRepository extends JpaRepository<Leagues, Long> {
    @Query("SELECT l FROM Leagues l WHERE l.league_id = ?1")
    Optional<Leagues> findLeaguesByLeagueId(Long leagueId);
}
