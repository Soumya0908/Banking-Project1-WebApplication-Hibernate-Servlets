<%@page import="com.revature.project1.bank.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayCustomerDetails</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-"/>
<link type="text/css" rel="stylesheet" href="CSS/Style.css"/>
</head>
<body>
<div class="vertical-center" >
	<h2 align="center">Customer Details Are</h2>
	<%
	List<Customer> customers = (List) session.getAttribute("allCustomers");
	%>
	<table align="center" cellspecing="10" cellpadding="10">
		<th>CustomerId</th>
		<th>CustomerAccNo</th>
		<th>CustomerName</th>
		<th>CustomerMobileNo</th>
		<th>CustomerEmail</th>
		<th>CustomerBalance</th>
		<th>RegistrationDate</th>

		<%
		for(int i = 0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
		%>
		<tr>
			<td><%=customer.getCustomerId()%></td>
			<td><%=customer.getCustomerAccNo()%></td>
			<td><%=customer.getCustomerName()%></td>		
			<td><%=customer.getCustomerMobileNo()%></td>
			<td><%=customer.getCustomerEmailId()%></td>
			<td><%=customer.getCustomerBalance() %></td>
			<td><%=customer.getRegistrationDate()%></td>
			<td><a href="DeleteCustomerController?customerId=<%= customer.getCustomerId() %>">Delete</a></td>
		</tr>
		<%
		}
		%>
	</table>
<tr><td><a href="Find-DeleteCustomerById.jsp">Search</a>
</td>
<td><a href="CustomerOperations">GoBack</a>
</td>
</tr>
</div>
</body>
</html>