<%--
    Document   : altaOdontologo
    Created on : 30 sep. 2024, 16:02:46
    Author     : Tomas
--%>

<%@page import="logic.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<main>
  <%
    HttpSession cs = request.getSession();
    Users user = (Users) cs.getAttribute("currentUser");
    System.out.println(user.toString());
  %>
  <div class="card o-hidden border-0 shadow-lg my-5">
    <div class="card-body p-0">
      <!-- Nested Row within Card Body -->
      <div class="row d-flex justify-content-center w-100">
        <div class="col-lg-7">
          <div class="p-5">
            <div class="text-center">
              <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
            </div>
            <form class="user" action="SvOdontologos" method="POST">
              <input hidden value="<%= user.getId()%>" name="userId"/>
              <div class="row">
                <div class="col-sm-6">
                  <input type="text" class="form-control form-control-user"
                         id="exampleRepeatPassword" name="name" placeholder="Nombre">
                </div>
                <div class="col-sm-6">
                  <input type="text" class="form-control form-control-user"
                         id="exampleRepeatPassword" name="lastName" placeholder="Apellido">
                </div>
              </div>
              <label for="especialidad">Selecciona la especialidad:</label>
              <select name="especialidad" id="nombre" style="width: 200px">
                <option value="Dentista general">Dentista general</option>
                <option value="Ortodoncista">Ortodoncista</option> <!-- Opción predeterminada -->
                <option value="Prostodoncista">Prostodoncista</option>
              </select>
              <label for="dias">Selecciona los dias laborales:</label>
              <select name="dias" multiple="true" id="dias"  style="width: 200px">
                <option value="Lunes">Lunes</option>
                <option value="Martes">Martes</option> <!-- Opción predeterminada -->
                <option value="Miercoles">Miercoles</option>
                <option value="Jueves">Jueves</option>
                <option value="Viernes">Viernes</option>
                <option value="Sabado">Sabado</option>
                <option value="Domingo">Domingo</option>
              </select>
              <div class="row mb-4">
                <div class="col-sm-6">
                  <label>Hora de inicio</label>
                  <input type="time" class="form-control form-control-user"
                         id="exampleRepeatPassword" name="hora_inicio">
                </div>
                <div class="col-sm-6">
                  <label>Hora de salida</label>
                  <input type="time" class="form-control form-control-user"
                         id="exampleRepeatPassword" name="hora_fin">
                </div>
              </div>
              <button type="submit" class="btn btn-primary btn-user btn-block">
                Alta Odontologo
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</main>