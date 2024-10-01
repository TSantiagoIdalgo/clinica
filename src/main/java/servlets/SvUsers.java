package servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.*;

@WebServlet(name = "SvUsers", urlPatterns = {"/SvUsers"})
public class SvUsers extends HttpServlet {

  ClinicaController clinicaController = new ClinicaController();

  protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ArrayList<Users> users = this.clinicaController.findAllUsers();
    HttpSession session = request.getSession();
    session.setAttribute("users", users);
    response.sendRedirect("/clinica?path=verUsuarios");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
    String email = request.getParameter("email");
    String role = request.getParameter("role");
    Users newUser = new Users(userName, password, role, email);
    this.clinicaController.createUser(newUser);
    System.out.println(newUser.toString());

    response.sendRedirect("/clinica/login.jsp");
  }

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
