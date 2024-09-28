package logic;

import com.mycompany.clinica.Person;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Responsable extends Person {
    @Basic
    private String type;
    @OneToOne
    private Paciente paciente;

    public Responsable() {
    }

    public Responsable(String type, Paciente paciente, String name, String lastname) {
        super(name, lastname);
        this.type = type;
        this.paciente = paciente;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
