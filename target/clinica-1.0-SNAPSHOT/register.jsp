<%--
    Document   : register
    Created on : 30 sep. 2024, 20:34:17
    Author     : Tomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/scripts.jsp" %>
<%@include file="componentes/header.jsp" %>

<!DOCTYPE html>
<body class="bg-gradient-primary d-flex justify-content-center">

  <div class="container">
    <div class="row justify-content-center">

      <div class="col-xl-10 col-lg-12 col-md-9">

        <div class="card o-hidden border-0 shadow-lg my-5">
          <div class="card-body p-0">
            <div class="d-flex justify-content-center">
              <div class="col-lg-6">
                <div class="p-5">
                  <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                  </div>
                  <form class="user" action="SvUsers" method="POST">
                    <div class="form-group">
                      <input type="text" class="form-control form-control-user" id="username"
                             placeholder="Nombre de usuario" name="userName">
                    </div>
                    <div class="form-group">
                      <input type="email" class="form-control form-control-user" id="exampleInputEmail"
                             placeholder="Correo electronico" name="email">
                    </div>
                    <div class="form-group row">
                      <div class="col-sm-6 mb-3 mb-sm-0">
                        <input type="password" class="form-control form-control-user"
                               id="exampleInputPassword" placeholder="Contraseña" name="password">
                      </div>
                      <div class="col-sm-6">
                        <input type="text" class="form-control form-control-user"
                               id="exampleRepeatPassword" placeholder="Rol" name="role">
                      </div>
                    </div>
                    <button type="submit" class="btn btn-primary btn-user btn-block">
                      Register cuenta
                    </button>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>

    </div>

  </div>

</body>