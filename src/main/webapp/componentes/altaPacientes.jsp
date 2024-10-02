<%@page import="logic.Odontologo"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="card o-hidden border-0 shadow-lg my-5">
  <div class="card-body p-0">
    <!-- Nested Row within Card Body -->
    <div class="row d-flex justify-content-center w-100">
      <div class="col-lg-7">
        <div class="p-5">
          <div class="text-center">
            <h1 class="h4 text-gray-900 mb-4">Registrar paciente</h1>
          </div>
          <%
            ArrayList<Odontologo> odontologos = (ArrayList<Odontologo>) request.getSession().getAttribute("odontologos");
            for (Odontologo odontologo : odontologos) {
              System.out.println(odontologo.toString());
            }
          %>
          <form class="user" action="SvPacientes" method="POST">
            <div class="form-group row">
              <div class="col-sm-6 mb-3 mb-sm-0">
                <input type="text" class="form-control form-control-user" id="exampleFirstName"
                       placeholder="Nombre del paciente" name="pacienteName">
              </div>
              <div class="col-sm-6">
                <input type="text" class="form-control form-control-user" id="exampleLastName"
                       placeholder="Apellido del paciente" name="pacienteLastname">
              </div>
            </div>
            <div class="form-group">
              <label for="has_os">Tiene obra social</label>
              <select name="has_os" id="has_os" style="width: 200px">
                <option value="true">Si</option>
                <option value="false" selected>No</option>
              </select>
            </div>
            <div class="form-group  justify-content-sm-between">
              <div class="d-flex flex-column">
                <label for="fecha_turno">Seleccione la fecha del turno</label>
                <input type="date" class="form-control form-control-user"
                       id="fecha_turno" name="fecha_turno">
              </div>
              <div class="d-flex flex-column">
                <label for="hora_turno">Seleccione la hora del turno</label>
                <input type="time" class="form-control form-control-user"
                       id="hora_turno" name="hora_turno">
              </div>
              <div class="d-flex flex-column">
                <label for="odontologo_id">Selecciona el Odontologo:</label>
                <select style="height: 50px; border-radius: 10rem; text-align: center" name="odontologo_id" id="odontologo_id" style="width: 200px">
                  <%
                    for (Odontologo odontologo : odontologos) {
                  %>
                  <option value="<%=odontologo.getId()%>"><%=odontologo.getName()%></option>
                  <%}%>
                </select>
              </div>
            </div>
            <button type="submit" class="btn btn-primary btn-user btn-block">
              Registrar paciente
            </button>
          </form>
        </div>
      </div>
    </div>
  </div>
</div>