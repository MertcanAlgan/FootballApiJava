package org.example.tahmiinbackend.user;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.userId = ?1")
    Optional<User> findUserByUserId(Long userId);
    Optional<User> findUserByUserName(String userName);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.isUserApproved = TRUE WHERE u.userId = ?1")
    void approveUser(Long userId);

    @Query("select i from User i where i.userEmail = ?1")
    Optional<User> findUserByUserEmail(String userEmail);
}
