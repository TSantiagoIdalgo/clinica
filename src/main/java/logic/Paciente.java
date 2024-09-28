package logic;

import com.mycompany.clinica.Person;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Paciente extends Person {
    @Basic
    private boolean has_os;
    @OneToMany(mappedBy = "paciente")
    private ArrayList<Turno> turnos;

    public Paciente() {
    }

    public Paciente(boolean has_os, ArrayList<Turno> turnos, String name, String lastname) {
        super(name, lastname);
        this.has_os = has_os;
        this.turnos = turnos;
    }

    public boolean isHas_os() {
        return has_os;
    }

    public void setHas_os(boolean has_os) {
        this.has_os = has_os;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
}
