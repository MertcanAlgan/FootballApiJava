package org.example.tahmiinbackend.testing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TestingRepository extends JpaRepository<Testing, Long> {
    @Query("SELECT t from Testing t where t.id = ?1")
    Optional<Testing> findTestingById(Long id);
}
