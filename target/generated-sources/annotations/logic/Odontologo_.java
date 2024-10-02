package logic;

import com.mycompany.clinica.Person_;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Horario;
import logic.Turno;
import logic.Users;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-10-02T14:01:39")
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Person_ {

    public static volatile SingularAttribute<Odontologo, Horario> horario;
    public static volatile ListAttribute<Odontologo, Turno> turnos;
    public static volatile SingularAttribute<Odontologo, String> especialidad;
    public static volatile SingularAttribute<Odontologo, Users> user;

}