package logic;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Turno implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  @Basic
  private String fecha_turno;
  @Basic
  private String hora_turno;

  @ManyToOne
  @JsonBackReference
  private Odontologo odontologo;
  @ManyToOne
  @JsonBackReference
  private Paciente paciente;

  public Turno() {
  }

  public Turno(String fecha_turno, String hora_turno, Odontologo odontologo, Paciente paciente) {
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

  public String getFecha_turno() {
    return fecha_turno;
  }

  public void setFecha_turno(String fecha_turno) {
    this.fecha_turno = fecha_turno;
  }

  public String getHora_turno() {
    return hora_turno;
  }

  public void setHora_turno(String hora_turno) {
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

  @Override
  public String toString() {
    return "Turno{" + "id=" + id + ", fecha_turno=" + fecha_turno + ", hora_turno=" + hora_turno + '}';
  }

}
