package logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

enum Dias { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO };

@Entity
public class Horario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @ElementCollection
    @CollectionTable(name = "horario_dias", joinColumns = @JoinColumn(name = "horario_id"))
    @Column(name = "dia")
    private List<Dias> dias;
    @Basic
    private int hora_inicio;
    @Basic
    private int hora_fin;

    public Horario() {
    }

    public Horario(List<Dias> dias, int hora_inicio, int hora_fin) {
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

    public List<Dias> getDias() {
        return dias;
    }

    public void setDias(List<Dias> dias) {
        this.dias = dias;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(int hora_fin) {
        this.hora_fin = hora_fin;
    }
    
    
}
