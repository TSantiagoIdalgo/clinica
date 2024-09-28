package logic;

import com.mycompany.clinica.Person_;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Horario;
import logic.Turno;
import logic.User;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-28T15:12:33")
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Person_ {

    public static volatile SingularAttribute<Odontologo, Horario> horario;
    public static volatile ListAttribute<Odontologo, Turno> turnos;
    public static volatile SingularAttribute<Odontologo, String> especialidad;
    public static volatile SingularAttribute<Odontologo, User> user;

}