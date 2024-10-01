package logic;

import com.mycompany.clinica.Person;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Person {
    @Basic
    private String especialidad;
    @OneToMany(mappedBy = "odontologo")
    private ArrayList<Turno> turnos;

    @OneToOne
    private Horario horario;
    @OneToOne
    private Users user;

    public Odontologo() {
    }

    public Odontologo(String especialidad, ArrayList<Turno> turnos, Horario horario, Users user, String name, String lastname) {
        super(name, lastname);
        this.especialidad = especialidad;
        this.turnos = turnos;
        this.horario = horario;
        this.user = user;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
}
