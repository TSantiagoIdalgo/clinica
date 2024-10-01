package logic;

import com.mycompany.clinica.Person;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretario extends Person {
    @Basic
    private String sector;
    @OneToOne
    private Users user;

    public Secretario() {
    }

    public Secretario(String sector, Users user, String name, String lastname) {
        super(name, lastname);
        this.sector = sector;
        this.user = user;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
}
