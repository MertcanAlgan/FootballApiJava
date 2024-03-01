package org.example.tahmiinbackend.league_tables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TablesRepository extends JpaRepository<MainTables, Long> {

    @Query("SELECT t FROM MainTables t WHERE t.main_tables_id = ?1")
    Optional<MainTables> findMainTablesById(Long main_tables_id);
}
