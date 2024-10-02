<%@page import="java.util.ArrayList"%>
<%@page import="logic.Odontologo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <th>Especialidad</th>
            <th>Turnos</th>
            <th>Dias</th>
            <th>Hora</th>
            <th>Rol</th>
          </tr>
        </thead>
        <tbody>
          <%
            ArrayList<Odontologo> odontologos = (ArrayList<Odontologo>) request.getSession().getAttribute("odontologos");
            for (int i = 0; i < odontologos.size(); i++) {
          %>
          <tr>
            <th><%= odontologos.get(i).getId()%></th>
            <th><%= odontologos.get(i).getName()%></th>
            <th><%= odontologos.get(i).getLastname()%></th>
            <th><%= odontologos.get(i).getEspecialidad()%></th>
            <th style="max-width: 100px; white-space: nowrap; overflow-x: scroll">
              <%=odontologos.get(i).getTurnos().toString()%>
            </th>
            <th style="max-width: 100px; white-space: nowrap; overflow-x: scroll"><%= odontologos.get(i).getHorario().getDias().toString()%></th>
            <th><%= odontologos.get(i).getHorario().getHora_inicio()%>/<%= odontologos.get(i).getHorario().getHora_fin()%></th>
            <th><%= odontologos.get(i).getUser().getRole()%></th>
          </tr>

          <%}%>
        </tbody>
      </table>
    </div>
  </div>
</div>
</div>

</div>
</main>