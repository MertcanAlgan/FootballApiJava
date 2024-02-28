package org.example.tahmiinbackend.season;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SeasonRepository extends JpaRepository<Season,Long> {
    @Query("select s from Season s where s.seasons_id=?1")
    Optional<Season> findSeasonBySeasons_id(Long seasons_id);
}
