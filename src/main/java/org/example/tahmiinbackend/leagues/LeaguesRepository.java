package org.example.tahmiinbackend.leagues;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface LeaguesRepository extends JpaRepository<Leagues, Long> {
    @Query("SELECT l FROM Leagues l WHERE l.league_id = ?1")
    Optional<Leagues> findLeaguesByLeagueId(Long leagueId);

    @Query("SELECT l FROM Leagues l WHERE l.country = :country")
    List<Leagues> findLeaguesByCountry(@Param("country") String country);

    @Query("SELECT l FROM Leagues l WHERE LOWER(l.name) LIKE LOWER(concat('%', :name, '%'))")
    List<Leagues> findLeaguesByName(@Param("name") String name);
}
