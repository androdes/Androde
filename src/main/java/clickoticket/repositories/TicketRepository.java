package clickoticket.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import clickoticket.db.Ticket;


public interface TicketRepository extends JpaRepository<Ticket, Long>{
}
