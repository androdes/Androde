package clickoticket.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private Long id;
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id=id;
    }
    
}
