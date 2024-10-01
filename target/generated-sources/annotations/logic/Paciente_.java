package logic;

import com.mycompany.clinica.Person_;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Turno;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-30T17:44:15")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Person_ {

    public static volatile ListAttribute<Paciente, Turno> turnos;
    public static volatile SingularAttribute<Paciente, Boolean> has_os;

}