package servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.ClinicaController;
import logic.Odontologo;
import logic.Paciente;
import logic.Turno;

@WebServlet(name = "SvPacientes", urlPatterns = {"/SvPacientes"})
public class SvPacientes extends HttpServlet {

  ClinicaController cc = new ClinicaController();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ArrayList<Odontologo> odontologos = this.cc.findAllOdontologo();
    HttpSession session = request.getSession();
    session.setAttribute("odontologos", odontologos);
    response.sendRedirect("/clinica/?path=altaPacientes");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int odontologoId = Integer.parseInt(request.getParameter("odontologo_id"));
    String pacienteName = request.getParameter("pacienteName");
    String pacienteLastName = request.getParameter("pacienteLastname");
    boolean has_os = Boolean.getBoolean(request.getParameter("has_os"));
    String hora_turno = request.getParameter("hora_turno");
    String fecha_turno = request.getParameter("fecha_turno");

    ArrayList<Turno> turnos = new ArrayList<>();
    Odontologo odontologo = this.cc.findOdontologo(odontologoId);
    Paciente newPaciente = new Paciente(has_os, turnos, pacienteName, pacienteLastName);
    this.cc.createPaciente(newPaciente);
    Turno newTurno = new Turno(fecha_turno, hora_turno, odontologo, newPaciente);
    this.cc.createTurno(newTurno);

    response.sendRedirect("/clinica");
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
