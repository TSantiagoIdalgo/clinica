package logic;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Odontologo;
import logic.Paciente;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-30T17:44:15")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Date> hora_turno;
    public static volatile SingularAttribute<Turno, Paciente> paciente;
    public static volatile SingularAttribute<Turno, Integer> id;
    public static volatile SingularAttribute<Turno, Date> fecha_turno;
    public static volatile SingularAttribute<Turno, Odontologo> odontologo;

}