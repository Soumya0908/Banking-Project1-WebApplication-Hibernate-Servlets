<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeLogin</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="CSS/Style.css" />
<script type="text/javascript" src="JS/EmployeeValidate.js"></script>
</head>
<body>
<div class="cs-login">
<h1>You logged in at <%= new java.util.Date() %></h1>
<h2 align="center">Login Form</h2>
</div>
<div class="vertical-center">
<form action="AuthenticateEmployee" method="post" onsubmit="return employeeValidate()">
<table cellpadding="10" cellspacing="10">
<tr><td>EmployeeId </td><td><input  type="number" name="employeeId" id="employeeId" /></td></tr>
<tr><td>Password</td><td><input  type="password" name="employeePassword" id="password" /></td></tr>
<tr><td><input type="submit" value="Login" class="alert alert-danger" ></td>
<td><input type="reset" value="Clear" class="alert alert-warning"></td></tr>	
</table>
</form>
<a href="EmployeeSignup.html">EmployeeSignup</a>
<a href="Home.html">Home</a>
</div>
</body>
</html>