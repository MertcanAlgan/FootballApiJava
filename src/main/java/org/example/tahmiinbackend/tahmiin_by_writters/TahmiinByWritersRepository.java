package org.example.tahmiinbackend.tahmiin_by_writters;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TahmiinByWritersRepository extends JpaRepository<TahmiinByWriters, Long> {
    @Query("select t from TahmiinByWriters t ORDER BY t.tahmiin_by_writers_id DESC")
    List<TahmiinByWriters> findTahmiinByWritersByDescendingId();

    @Modifying
    @Query("UPDATE TahmiinByWriters t SET t.likes = t.likes + 1 WHERE t.tahmiin_by_writers_id = ?1")
    void incrementLikes(Long tahmiin_by_writers_id);
}
