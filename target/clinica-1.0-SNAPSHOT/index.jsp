<%@page import="logic.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp" %>
<!DOCTYPE html>
<html lang="en">
  <body id="page-top" class="d-flex w-100">
    <%
      HttpSession currentSession = request.getSession();
      Users currentUser = (Users) currentSession.getAttribute("currentUser");
      if (currentUser == null) {
        response.sendRedirect("/clinica/login.jsp");
      }
    %>
    <%@include file="componentes/sidebar.jsp" %>
    <div id="wrapper" class="w-100">
      <div id="content-wrapper" class="d-flex flex-column">
        <div id="content">
          <%@include file="componentes/topbar.jsp" %>
          <div class="container-fluid">
            <div class="d-sm-flex flex-column justify-content-between mb-4">
              <h1 class="h3 mb-0 text-gray-800">Clinica Odontologica</h1>
              <%String path = request.getParameter("path");
                String[] paths = {"altaPacientes", "verPacientes", "altaOdontologo", "altaUsuarios", "verUsuarios", "verOdontologos", "editUser"};
                boolean isValidPath = false;
                for (String p : paths) {
                  if (p.equals(path)) {
                    isValidPath = true;
                    break;
                  }
                }
                String root = null;
                root = isValidPath ? root = "componentes/" + path + ".jsp" : "componentes/errorNotFound.jsp";
                System.out.println("RUTA:" + path);
                if (path == null) {
              %>
              <jsp:include page="./componentes/landing.jsp"/>
              <%} else {%>
              <jsp:include page="<%= root%>" />
              <%}%>
            </div>
          </div>

        </div>

      </div>
    </div>
  </body>

  <%@include file="componentes/scripts.jsp" %>
</html>