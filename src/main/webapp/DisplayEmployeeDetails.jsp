<%@page import="com.revature.project1.bank.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayAllEmployeeDetails</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-"/>
<link type="text/css" rel="stylesheet" href="CSS/Style.css"/>
</head>
<body>
<div class="vertical-center" >
<h2>Employee-details</h2>
	<%
	List<Employee> employees = (List) session.getAttribute("allEmployees");
	%>
	<table cellpadding="10" cellspacing="10">
		<th>EmployeeId</th>
		<th>EmployeeName</th>
		<th>EmployeeMobileNo</th>
		<th>EmployeeEmail</th>
		<th>EmployeeSalary</th>
		<th>Delete</th>
		<%
		for (int i = 0; i < employees.size(); i++) { 
			Employee employee = employees.get(i);
		%>
		<tr>
			<td><%= employee.getEmployeeId() %></td>
			<td><%= employee.getEmployeeName() %></td>
			<td><%= employee.getEmployeeMobileNo()%></td>
			<td><%= employee.getEmployeeEmail()%></td>
			<td><%= employee.getEmployeeSalary()%></td>
			<td><a href="DeleteEmployeeController?employeeId<%=employee.getEmployeeId()%>">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
<br/>
<%= session.getAttribute("message") %>
<br/>
<a href="Find-DeleteEmployeeById">Search</a>
<a href="EmployeeOperations.jsp">GoBack</a>
</body>
</html>