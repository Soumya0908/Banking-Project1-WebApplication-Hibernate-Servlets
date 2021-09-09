<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeUpdate</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-"/>
<link type="text/css" rel="stylesheet" href="CSS/Style.css"/>
<script type="text/javascript" src="JS/EmployeeUpdate.js"></script>
</head>
<body>
<h2>You logged in at <%= new java.util.Date() %></h2>
<h3 align="center",color="white" >UpdateForm</h3>
</div>
<div class="vertical-center">
<form action="EmployeeUpdateController" method="post" onsubmit="return updateValidate()">
<table cellpadding="10" cellspacing="10">
<tr>
<td>EmployeeId</td>
<td><input type="number" name="employeeId" id="employeeId" /></td>
</tr>
<tr><td>Name</td> <td><input type="text" name="employeeName" id="username"/></td></tr>
<tr><td>Password</td> <td><input type="password" name="employeePassword" id="password"/></td></tr>
<tr><td>ConfirmPassword</td> <td><input type="password" name="confirmPassword" id="confirmPassword"/></td></tr>
<tr><td>MobileNo</td> <td><input type="text" name="employeeMobileNo" id="mobileNo"/></td></tr>
<tr><td>EmailId</td> <td><input type="text" name="employeeEmail" id="email"/></td></tr>
<tr><td>Salary</td><td><input type="number" name="employeeSalary" id="salary"/></td></tr>
<tr><td><input type="submit" name="submit" id="submit" value="Update"/></td>
<td><input type="reset" name="clear" id="clear" value="Clear"/></td></tr>
</table>
</form>
</div>
</body>
</html>