<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeOperations</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-"/>
<link type="text/css" rel="stylesheet" href="CSS/Style.css"/>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-light bg-light">
  <a class="navbar-brand" href="Home.html">HOME</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="EmployeeUpdate.jsp">UPDATE-DETAILS</a>
      </li>
      <br/>
      <br/>
         <li class="nav-item">
        <a class="nav-link" href="Find-DeleteEmployeeById.jsp">FIND & DELETE-EMPLOYEE-DETAILS</a>
      </li> 
       <br/>
      <br/> 
      <li class="nav-item">
        <a class="nav-link" href="Find-DeleteCustomerById.jsp">VALIDATE&DELETE-CUSTOMER</a>
    </ul>
  </div>
  <form class="form-inline p-2">
         <a class="btn btn-outline-success my-2 my-sm-0" href="EmployeeLogin.jsp">Logout</a>
  </form>
</nav>
</body>
</html>