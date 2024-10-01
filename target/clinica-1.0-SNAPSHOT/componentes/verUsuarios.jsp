<%--
    Document   : verUsuarios
    Created on : 30 sep. 2024, 14:46:37
    Author     : Tomas
--%>

<%@page import="logic.Users"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<div class="container-fluid mt-5">
  <div class="card shadow mb-4">
    <div class="card-header py-3">
      <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
    </div>
    <div class="card-body">
      <div class="table-responsive">
        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
          <thead>
            <tr>
              <th>id</th>
              <th>Name</th>
              <th>Email</th>
              <th>Rol</th>
              <th style="width: 225px">Accion</th>
            </tr>
          </thead>
          <tbody>
            <%
              ArrayList<Users> users = (ArrayList<Users>) request.getSession().getAttribute("users");
              for (Users user : users) {
            %>
            <tr>
              <th><%= user.getId()%></th>
              <th><%= user.getUserName()%></th>
              <th><%= user.getEmail()%></th>
              <th><%= user.getRole()%></th>
              <th style="display: flex; width: max-content">
                <form action="SvDeleteUser" method="POST">
                  <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px">
                    <i class="fas fa-trash-alt"></i>ELIMINAR
                  </button>
                  <input name="userId" value="<%= user.getId()%>" hidden/>
                </form>
                <form action="SvUpdateUser" method="GET">
                  <button type="submit" class="btn btn-primary btn-user btn-block" style="margin-left: 5px; width: 120px">
                    <i class="fas fa-pencil-alt"></i>Edit
                  </button>
                  <input name="userId" value="<%= user.getId()%>" hidden/>
                </form>
              </th>
            </tr>

            <%}%>
          </tbody>
        </table>
      </div>
    </div>
  </div>

</div>
<!-- /.container-fluid -->

</div>