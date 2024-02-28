package org.example.tahmiinbackend.leagueTeams;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface LeagueTeamsRepository extends JpaRepository<LeagueTeams, Long> {

    @Query("select lt from LeagueTeams lt where lt.league_teams_id = ?1")
    Optional<LeagueTeams> findLeagueTeamsByLeague_teams_id(Long league_teams_id);

}
