package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_turno;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hora_turno;
    
    @ManyToOne
    private Odontologo odontologo;
    @ManyToOne
    private Paciente paciente;

    public Turno() {
    }

    public Turno(Date fecha_turno, Date hora_turno, Odontologo odontologo, Paciente paciente) {
        this.fecha_turno = fecha_turno;
        this.hora_turno = hora_turno;
        this.odontologo = odontologo;
        this.paciente = paciente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public Date getHora_turno() {
        return hora_turno;
    }

    public void setHora_turno(Date hora_turno) {
        this.hora_turno = hora_turno;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    
}
