<%@page import="com.revature.project1.bank.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find-DeleteEmployee</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-"/>
<link type="text/css" rel="stylesheet" href="CSS/Style.css"/>
<script type="text/javascript" src="JS/EmployeeValidate.js"></script>
</head>
<body>
<div class="cs-login">
<h1>You logged in at<%=new java.util.Date()%></h1>
<h2 align="center">Find/Delete Form</h2>
</div>
<div class ="vertical-center">
<form  action="FindEmployeeByIdController" method="post" onsubmit="return employeeValidate()">
<table cellpadding="10" cellspacing="10">
<tr>
<td>EmployeeId</td>
<td><input type="text" name="employeeId" id="employeeId" /></td>
</tr>
<tr>
<td><input type="submit" value="Search" class="alert alert-danger"></td>
<td><input type="submit" value="Delete" formaction="DeleteEmployeeController" class="alert alert-danger"></td>
<td><input type="reset" value="Clear" class="alert alert-warning"></td>
</tr>
</table>
</form>
</div>
<br/>
<%= session.getAttribute("message") %>
<br/>
</body>
</html>