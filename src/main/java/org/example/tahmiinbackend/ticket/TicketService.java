package org.example.tahmiinbackend.ticket;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;
    public TicketService(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }
    public Page<Ticket> getTicketsByPage(int pageNumber, int size){
        Pageable pageable = PageRequest.of(pageNumber,size, Sort.by("ticketId").descending());
        return ticketRepository.findAll(pageable);
    }
    public void addNewTicket(Ticket ticket){
        ticketRepository.save(ticket);
    }
    @Transactional
    public void setTicketSolved(Long ticketId){
        boolean exists = ticketRepository.existsById(ticketId);
        if (!exists){
            throw new IllegalStateException("Ticket Bulunamadı");
        }
        try {
            ticketRepository.setTicketSolved(ticketId);
        } catch (Exception e){
            throw new IllegalStateException("Ticket Silinemitor", e);
        }
    }
}
