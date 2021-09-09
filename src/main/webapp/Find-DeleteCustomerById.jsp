<%@page import="com.revature.project1.bank.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find-DeleteCustomerById</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-"/>
<link type="text/css" rel="stylesheet" href="CSS/Style.css"/>
<script type="text/javascript" src="JS/CustomerValidate.js"></script>
</head>
<body>
<div class="cs-login">
<h1>You logged in at<%=new java.util.Date()%></h1>
<h2 align="center">Find/Delete Form</h2>
</div>
<div class ="vertical-center">
<form  action="FindCustomerById" method="post" onsubmit="return customerValidate()">
<table cellpadding="10" cellspacing="10">
<tr>
<td>CustomerId</td>
<td><input type="text" name="customerId" id="customerId" /></td>
</tr>
<tr>
<td><input type="submit" value="Search" class="alert alert-danger"></td>
<td><input type="submit" value="Delete" formaction="DeleteCustomerController" class="alert alert-danger"></td>
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