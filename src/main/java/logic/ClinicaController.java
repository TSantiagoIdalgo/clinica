package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistence.*;
import persistence.exceptions.NonexistentEntityException;

public class ClinicaController {

  OdontologoJpaController odontologoJpa = new OdontologoJpaController();
  SecretarioJpaController secretarioJpa = new SecretarioJpaController();
  UserJpaController userJpa = new UserJpaController();
  HorarioJpaController horarioJpa = new HorarioJpaController();
  PacienteJpaController pacienteJpa = new PacienteJpaController();
  ResponsableJpaController responsableJpa = new ResponsableJpaController();
  TurnoJpaController turnoJpa = new TurnoJpaController();

  public void createOdontologo(Odontologo odontologo) {
    this.odontologoJpa.create(odontologo);
  }

  public Odontologo findOdontologo(int id) {
    return this.odontologoJpa.findOdontologo(id);
  }

  public ArrayList<Odontologo> findAllOdontologo() {
    List<Odontologo> odontologos = this.odontologoJpa.findOdontologoEntities();
    return new ArrayList<Odontologo>(odontologos);
  }

  public Odontologo updateOdontologo(Odontologo odontologo) {
    try {
      this.odontologoJpa.edit(odontologo);
    } catch (Exception ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return this.findOdontologo(odontologo.getId());
  }

  public Odontologo deleteOdontologo(int id) {
    Odontologo odontologo = this.findOdontologo(id);
    try {
      this.odontologoJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return odontologo;
  }

  public void createSecretario(Secretario secretario) {
    this.secretarioJpa.create(secretario);
  }

  public Secretario findSecreatrio(int id) {
    return this.secretarioJpa.findSecretario(id);
  }

  public ArrayList<Secretario> findAllSecretario() {
    List<Secretario> secretarios = this.secretarioJpa.findSecretarioEntities();
    return new ArrayList<Secretario>(secretarios);
  }

  public Secretario updateSecretario(Secretario secretario) {
    try {
      this.secretarioJpa.edit(secretario);
    } catch (Exception ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }
    return this.findSecreatrio(secretario.getId());
  }

  public Secretario deleteSecretario(int id) {
    Secretario secretario = this.findSecreatrio(id);
    try {
      this.secretarioJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return secretario;
  }

  public void createUser(Users user) {
    this.userJpa.create(user);
  }

  public Users findUser(int id) {
    return this.userJpa.findUser(id);
  }

  public Users getLogin(String email, String password) {
    List<Users> users = this.findAllUsers();
    for (Users user : users) {
      if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
        return user;
      }
    }
    return null;
  }

  public ArrayList<Users> findAllUsers() {
    List<Users> users = this.userJpa.findUserEntities();
    return new ArrayList<Users>(users);
  }

  public Users updateUser(Users user) {
    try {
      this.userJpa.edit(user);
    } catch (Exception ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }
    return this.findUser(user.getId());
  }

  public Users deleteUser(int id) {
    Users user = this.findUser(id);
    try {
      this.userJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }
    return user;
  }

  public void createPaciente(Paciente paciente) {
    this.pacienteJpa.create(paciente);
  }

  public Paciente findPaciente(int id) {
    return this.pacienteJpa.findPaciente(id);
  }

  public ArrayList<Paciente> findAllPacientes() {
    List<Paciente> pacientes = this.pacienteJpa.findPacienteEntities();
    return new ArrayList<Paciente>(pacientes);
  }

  public Paciente updatePaciente(Paciente paciente) {
    try {
      this.pacienteJpa.edit(paciente);
    } catch (Exception ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return this.findPaciente(paciente.getId());
  }

  public Paciente deletePaciente(int id) {
    Paciente paciente = this.findPaciente(id);
    try {
      this.pacienteJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return paciente;
  }

  public void createHorario(Horario horario) {
    this.horarioJpa.create(horario);
  }

  public Horario findHorario(int id) {
    return this.horarioJpa.findHorario(id);
  }

  public ArrayList<Horario> findAllHorarios() {
    List<Horario> horarios = this.horarioJpa.findHorarioEntities();
    return new ArrayList<Horario>(horarios);
  }

  public Horario updateHorario(Horario horario) {
    try {
      this.horarioJpa.edit(horario);
    } catch (Exception ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return this.findHorario(horario.getId());
  }

  public Horario deleteHorario(int id) {
    Horario horario = this.findHorario(id);
    try {
      this.horarioJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return horario;
  }

  public void createResponseble(Responsable responsable) {
    this.responsableJpa.create(responsable);
  }

  public Responsable findResponsable(int id) {
    return this.responsableJpa.findResponsable(id);
  }

  public ArrayList<Responsable> findAllResponsables() {
    List<Responsable> responsables = this.responsableJpa.findResponsableEntities();
    return new ArrayList<Responsable>(responsables);
  }

  public Responsable updateResponsable(Responsable responsable) {
    try {
      this.responsableJpa.edit(responsable);
    } catch (Exception ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return this.findResponsable(responsable.getId());
  }

  public Responsable deleteResponsable(int id) {
    Responsable responsable = this.findResponsable(id);
    try {
      this.responsableJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return responsable;
  }

  public void createTurno(Turno turno) {
    this.turnoJpa.create(turno);
  }

  public Turno findTurno(int id) {
    return this.turnoJpa.findTurno(id);
  }

  public ArrayList<Turno> findAllTurno() {
    List<Turno> turnos = this.turnoJpa.findTurnoEntities();
    return new ArrayList<Turno>(turnos);
  }

  public Turno updateTurno(Turno turno) {
    try {
      this.turnoJpa.edit(turno);
    } catch (Exception ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return this.findTurno(turno.getId());
  }

  public Turno deleteTurno(int id) {
    Turno turno = this.findTurno(id);
    try {
      this.turnoJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
      Logger.getLogger(ClinicaController.class.getName()).log(Level.SEVERE, null, ex);
    }

    return turno;
  }
}
