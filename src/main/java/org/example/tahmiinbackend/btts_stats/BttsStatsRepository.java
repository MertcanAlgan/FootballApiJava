package org.example.tahmiinbackend.btts_stats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BttsStatsRepository extends JpaRepository<BttsStats, Long> {

    @Query("SELECT b FROM BttsStats b WHERE b.btts_stats_id = ?1")
    Optional<BttsStats> findBttsStatsById(Long btts_stats_id);
}
