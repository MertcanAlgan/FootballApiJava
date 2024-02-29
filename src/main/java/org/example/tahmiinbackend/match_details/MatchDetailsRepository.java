package org.example.tahmiinbackend.match_details;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MatchDetailsRepository extends JpaRepository<MatchDetails, Long> {
    @Query("SELECT m FROM MatchDetails m WHERE m.match_details_id = ?1")
    Optional<MatchDetails> findMatchDetailsByMatchId(Long match_details_id);
}
