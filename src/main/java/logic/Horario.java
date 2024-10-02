package logic;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Horario implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id;
  @ElementCollection(fetch = FetchType.EAGER)
  @CollectionTable(name = "horario_dias", joinColumns = @JoinColumn(name = "horario_id"))
  @Column(name = "dia")
  private List<String> dias;
  @Basic
  private String hora_inicio;
  @Basic
  private String hora_fin;

  public Horario() {
  }

  public Horario(List<String> dias, String hora_inicio, String hora_fin) {
    this.dias = dias;
    this.hora_inicio = hora_inicio;
    this.hora_fin = hora_fin;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<String> getDias() {
    return dias;
  }

  public void setDias(List<String> dias) {
    this.dias = dias;
  }

  public String getHora_inicio() {
    return hora_inicio;
  }

  public void setHora_inicio(String hora_inicio) {
    this.hora_inicio = hora_inicio;
  }

  public String getHora_fin() {
    return hora_fin;
  }

  public void setHora_fin(String hora_fin) {
    this.hora_fin = hora_fin;
  }

  @Override
  public String toString() {
    return "Horario{" + "id=" + id + ", dias=" + dias + ", hora_inicio=" + hora_inicio + ", hora_fin=" + hora_fin + '}';
  }

}
