
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/scripts.jsp" %>
<%@include file="componentes/header.jsp" %>

<body class="bg-gradient-primary w-100">

  <div class="container w-100">

    <!-- Outer Row -->
    <div class="row justify-content-center w-100">

      <div class="col-xl-10 col-lg-12 col-md-9 w-100">

        <div class="card o-hidden border-0 shadow-lg my-5 w-100">
          <div class="card-body p-0 w-100">
            <div class="row w-100">
              <div class="w-100">
                <div class="p-5 w-100">
                  <div class="text-center">
                    <h1 class="h4 text-gray-900 mb-4">Login</h1>
                  </div>
                  <form class="user w-100" action="SvLogin" method="POST">
                    <div class="form-group">
                      <input type="email" class="form-control form-control-user"
                             id="exampleInputEmail" aria-describedby="emailHelp"
                             placeholder="Correo electronico..." name="email">
                    </div>
                    <div class="form-group">
                      <input type="password" class="form-control form-control-user"
                             id="exampleInputPassword" placeholder="Contraseña" name="password">
                    </div>
                    <div class="form-group">
                      <div class="custom-control custom-checkbox small">
                        <input type="checkbox" class="custom-control-input" id="customCheck">
                        <label class="custom-control-label" for="customCheck">Remember
                          Me</label>
                      </div>
                    </div>
                    <button type="submit" class="btn btn-primary btn-user btn-block">
                      Ingresar
                    </button>
                  </form>
                  <hr>
                  <div class="text-center">
                    <a class="small" href="forgot-password.html">Forgot Password?</a>
                  </div>
                  <div class="text-center">
                    <a class="small" href="register.jsp">Create an Account!</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>

    </div>

  </div>

</body>