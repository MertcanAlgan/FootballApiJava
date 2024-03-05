package org.example.tahmiinbackend.over25stats;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface Over25StatsRepository extends JpaRepository<Over25Stats, Long> {
    @Query("SELECT o FROM Over25Stats o WHERE o.over25_stats_id = ?1")
    Optional<Over25Stats> findOver25StatsById(Long over25_stats_id);
}
