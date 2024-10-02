package logic;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Odontologo;
import logic.Paciente;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-10-02T14:01:39")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, String> hora_turno;
    public static volatile SingularAttribute<Turno, Paciente> paciente;
    public static volatile SingularAttribute<Turno, Integer> id;
    public static volatile SingularAttribute<Turno, String> fecha_turno;
    public static volatile SingularAttribute<Turno, Odontologo> odontologo;

}