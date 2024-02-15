package org.example.tahmiinbackend.ticket;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
public class Ticket {
    @Id
    @SequenceGenerator(
            name = "ticket_sequence",
            sequenceName = "ticket_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ticket_sequence"
    )
    private Long ticketId;
    private String username;
    private String ticketHeader;
    private String ticketContent;
    private Boolean isTicketSolved = false;

    public Ticket() {
    }

    public Ticket(Long ticketId, String username, String ticketHeader, String ticketContent, Boolean isTicketSolved) {
        this.ticketId = ticketId;
        this.username = username;
        this.ticketHeader = ticketHeader;
        this.ticketContent = ticketContent;
        this.isTicketSolved = isTicketSolved;
    }

    public Ticket(String username, String ticketHeader, String ticketContent, Boolean isTicketSolved) {
        this.username = username;
        this.ticketHeader = ticketHeader;
        this.ticketContent = ticketContent;
        this.isTicketSolved = isTicketSolved;
    }
}
