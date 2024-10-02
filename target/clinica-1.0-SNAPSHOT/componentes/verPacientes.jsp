<%--
    Document   : verPacientes
    Created on : 30 sep. 2024, 11:04:24
    Author     : Tomas
--%>

<%@page import="logic.Paciente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<main>
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
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Tiene obra social?</th>
                <th>Turnos</th>
              </tr>
            </thead>
            <tbody>
              <%
                ArrayList<Paciente> odontologos = (ArrayList<Paciente>) request.getSession().getAttribute("pacientes");
                for (Paciente paciente : odontologos) {
              %>
              <tr>
                <th><%= paciente.getId()%></th>
                <th><%= paciente.getName()%></th>
                <th><%= paciente.getLastname()%></th>
                <th><%= paciente.isHas_os()%></th>
                <th style="max-width: 100px; white-space: nowrap; overflow-x: scroll"><%= paciente.getTurnos().toString()%></th>
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
</main>