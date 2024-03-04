package org.example.tahmiinbackend.ticket;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@AllArgsConstructor
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
}
