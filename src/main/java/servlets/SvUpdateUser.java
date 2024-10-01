package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.ClinicaController;
import logic.Users;

@WebServlet(name = "SvUpdateUser", urlPatterns = {"/SvUpdateUser"})
public class SvUpdateUser extends HttpServlet {

  ClinicaController clinicaController = new ClinicaController();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int userId = Integer.parseInt(request.getParameter("userId"));
    Users user = this.clinicaController.findUser(userId);
    HttpSession session = request.getSession();
    session.setAttribute("user", user);
    response.sendRedirect("/clinica?path=editUser");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int userId = Integer.parseInt(request.getParameter("userId"));
    String userName = request.getParameter("userName");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String role = request.getParameter("role");

    Users userUpdated = this.clinicaController.findUser(userId);
    userUpdated.setEmail(email);
    userUpdated.setPassword(password);
    userUpdated.setRole(role);
    userUpdated.setUserName(userName);
    this.clinicaController.updateUser(userUpdated);
    response.sendRedirect("/clinica");
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
