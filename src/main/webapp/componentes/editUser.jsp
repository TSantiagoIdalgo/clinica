
<%@page import="logic.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div>
  <%
    Users user = (Users) request.getSession().getAttribute("user");
    System.out.println(user.toString());
  %>
  <div class="card o-hidden border-0 shadow-lg my-5">
    <div class="card-body p-0">
      <!-- Nested Row within Card Body -->
      <div class="row d-flex justify-content-center w-100">
        <div class="col-lg-7">
          <div class="p-5">
            <div class="text-center">
              <h1 class="h4 text-gray-900 mb-4">Editar usuario!</h1>
            </div>
            <form class="user" action="SvUpdateUser" method="POST">
              <div class="form-group">
                <input type="text" class="form-control form-control-user" id="username"
                       placeholder="User name" name="userName" value="<%=user.getUserName()%>">
              </div>
              <div class="form-group">
                <input type="email" class="form-control form-control-user" id="exampleInputEmail"
                       placeholder="Email Address" name="email" value="<%=user.getEmail()%>">
              </div>
              <div class="form-group row">
                <div class="col-sm-6 mb-3 mb-sm-0">
                  <input type="password" class="form-control form-control-user" value="<%=user.getPassword()%>"
                         id="exampleInputPassword" placeholder="Password" name="password" >
                </div>
                <div class="col-sm-6">
                  <input type="text" class="form-control form-control-user"
                         id="exampleRepeatPassword" placeholder="Role" name="role" value="<%=user.getRole()%>">
                </div>
              </div>
              <input hidden value="<%= user.getId()%>" name="userId"/>
              <button type="submit" class="btn btn-primary btn-user btn-block">
                Editar usuario
              </button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

</div>