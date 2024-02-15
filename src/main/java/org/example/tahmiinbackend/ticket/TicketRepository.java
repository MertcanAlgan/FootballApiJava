package org.example.tahmiinbackend.ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
    @Modifying
    @Transactional
    @Query("update Ticket t set t.isTicketSolved = true where t.ticketId =?1")
    void setTicketSolved(Long ticketId);
}
