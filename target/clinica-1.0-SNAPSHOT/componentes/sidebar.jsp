

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

  <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
    <div class="sidebar-brand-icon rotate-n-15">
      <i class="fas fa-solid fa-tooth"></i>
    </div>
    <div class="sidebar-brand-text mx-3">Clinica</div>
  </a>

  <!-- Divider -->
  <hr class="sidebar-divider my-0">

  <!-- Nav Item - Dashboard -->
  <li class="nav-item active">
    <a class="nav-link" href="/clinica">
      <i class="fas fa-solid fa-bars"></i>
      <span>Menu</span></a>
  </li>

  <!-- Divider -->
  <hr class="sidebar-divider">

  <!-- Heading -->
  <div class="sidebar-heading">
    Interface
  </div>

  <!-- Nav Item - Pages Collapse Menu -->
  <li class="nav-item">
    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
       aria-expanded="true" aria-controls="collapseTwo">
      <i class="fas fa-solid fa-user"></i>
      <span>Pacientes</span>
    </a>
    <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#collapseTwo">
      <div class="bg-white py-2 collapse-inner rounded">
        <h6 class="collapse-header">Acciones:</h6>
        <a class="collapse-item" href="SvPacientesView">Ver Pacientes</a>
        <a class="collapse-item" href="SvPacientes">Alta Pacientes</a>
      </div>
    </div>
  </li>


  <!-- Nav Item - Utilities Collapse Menu -->
  <li class="nav-item">
    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
       aria-expanded="true" aria-controls="collapseUtilities">
      <i class="fas fa-hospital-user"></i>
      <span>Odontologos</span>
    </a>
    <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
         data-parent="#accordionSidebar">
      <div class="bg-white py-2 collapse-inner rounded">
        <h6 class="collapse-header">Acciones:</h6>
        <a class="collapse-item" href="SvOdontologos">Ver Odontologos</a>
        <a class="collapse-item" href="/clinica?path=altaOdontologo">Alta Odontologo</a>
      </div>
    </div>
  </li>

  <li class="nav-item">
    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUser"
       aria-expanded="true" aria-controls="collapseUser">
      <i class="fas fa-solid fa-user"></i>
      <span>Usuarios</span>
    </a>
    <div id="collapseUser" class="collapse" aria-labelledby="collapseUser" data-parent="#collapseUser">
      <div class="bg-white py-2 collapse-inner rounded">
        <h6 class="collapse-header">Acciones:</h6>
        <a class="collapse-item" href="SvUsers">Ver Usuarios</a>
      </div>
    </div>
  </li>

  <hr class="sidebar-divider d-none d-md-block">

  <!-- Sidebar Toggler (Sidebar) -->
  <div class="text-center d-none d-md-inline">
    <button class="rounded-circle border-0" id="sidebarToggle"></button>
  </div>

</ul>