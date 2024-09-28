package logic;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logic.Dias;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-09-28T15:12:33")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Integer> hora_inicio;
    public static volatile ListAttribute<Horario, Dias> dias;
    public static volatile SingularAttribute<Horario, Integer> hora_fin;
    public static volatile SingularAttribute<Horario, Integer> id;

}