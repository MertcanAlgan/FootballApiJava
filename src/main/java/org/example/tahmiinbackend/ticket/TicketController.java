package org.example.tahmiinbackend.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:3000")
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    @GetMapping("ticket/page/{pageNumber}")
    public ResponseEntity<Page<Ticket>> getTicketsByPage(
            @PathVariable int pageNumber,
            @RequestParam(defaultValue = "5") int size){
        Page<Ticket> tickets = ticketService.getTicketsByPage(pageNumber, size);
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }
    @PostMapping("auth/ticket")
    public void addNewTicket(@RequestBody Ticket ticket){
        ticketService.addNewTicket(ticket);
    }
    @PostMapping("ticket/{ticketId}/solved")
    public ResponseEntity<String> setTicketSolved(@PathVariable Long ticketId){
        ticketService.setTicketSolved(ticketId);
        return ResponseEntity.ok("Ticket Çözüldü");
    }
}
