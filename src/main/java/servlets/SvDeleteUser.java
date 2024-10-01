package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.ClinicaController;

@WebServlet(name = "SvDeleteUser", urlPatterns = {"/SvDeleteUser"})
public class SvDeleteUser extends HttpServlet {

  ClinicaController clinicaController = new ClinicaController();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int userId = Integer.parseInt(request.getParameter("userId"));
    this.clinicaController.deleteUser(userId);

    response.sendRedirect("/clinica");
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
