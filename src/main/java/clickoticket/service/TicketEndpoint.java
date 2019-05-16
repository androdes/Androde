package clickoticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import clickoticket.db.Ticket;
import clickoticket.repositories.TicketRepository;

@RestController
public class TicketEndpoint {
    
    @Autowired
    private TicketRepository ticketRepository;
    
    @GetMapping("/tickets")
    List<Ticket> findAll() {
        return ticketRepository.findAll();
    }
    
}
