package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.ClinicaController;
import logic.Horario;
import logic.Odontologo;
import logic.Turno;
import logic.Users;

@WebServlet(name = "SvOdontologos", urlPatterns = {"/SvOdontologos"})
public class SvOdontologos extends HttpServlet {

  ClinicaController cc = new ClinicaController();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ArrayList<Odontologo> odontologos = this.cc.findAllOdontologo();
    HttpSession session = request.getSession();
    session.setAttribute("odontologos", odontologos);
    response.sendRedirect("/clinica?path=verOdontologos");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int userId = Integer.parseInt(request.getParameter("userId"));
    String name = request.getParameter("name");
    String lastName = request.getParameter("lastName");
    String especialidad = request.getParameter("especialidad");
    String[] dias = request.getParameterValues("dias");
    List<String> listOfDays = Arrays.asList(dias);
    ArrayList<Turno> turnos = new ArrayList<>();
    String inicio = request.getParameter("hora_inicio");
    String fin = request.getParameter("hora_fin");

    if (Integer.parseInt(inicio.split(":")[0]) >= Integer.parseInt(fin.split(":")[0])) {
      throw new ServletException("La hora de inicio no puede ser mayor que la hora final");
    }
    Horario newHorario = new Horario(listOfDays, inicio, fin);
    this.cc.createHorario(newHorario);
    Users user = this.cc.findUser(userId);
    Odontologo newOdontologo = new Odontologo(especialidad, turnos, newHorario, user, name, lastName);
    this.cc.createOdontologo(newOdontologo);

    response.sendRedirect("/clinica");
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
