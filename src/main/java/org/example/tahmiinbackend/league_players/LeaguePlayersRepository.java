package org.example.tahmiinbackend.league_players;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LeaguePlayersRepository extends JpaRepository<LeaguePlayers, Long> {
    @Query("SELECT l FROM LeaguePlayers l WHERE l.league_players_id = ?1")
    Optional<LeaguePlayers> findLeaguePlayersById(Long league_players_id);

}
