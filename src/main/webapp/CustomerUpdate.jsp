<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerUpdate</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-"/>
<link type="text/css" rel="stylesheet" href="CSS/Style.css"/>
<script type="text/javascript" src="JS/CustomerUpdate.js"></script>
</head>
<body>
<div class="cs-login" >
<h1>You logged in at <%= new java.util.Date() %></h1>
<h2 align="center">UpdateForm</h2>
</div>
<div class="vertical-center">
<form action="CustomerUpdateController" method="post" onsubmit="return updateValidate()">
<table cellpadding="10" cellspacing="10">
<tr>
<td>CustomerAccNo</td>
<td><input type="number" name="customerAccNo" id="customerAccNo" /></td>
</tr>
<tr><td>Name</td> <td><input type="text" name="customerName" id="username"/></td></tr>
<tr><td>Password</td> <td><input type="password" name="customerPassword" id="password"/></td></tr>
<tr><td>Confirm-Password</td><td><input type="password" name="confirmpassword" id="confirmpassword"/></td></tr>
<tr><td>MobileNo</td> <td><input type="text" name="customerMobileNo" id="mobileno"/></td></tr>
<tr><td>EmailId</td> <td><input type="text" name="customerEmailId" id="email"/></td></tr>
<tr><td><input type="submit" name="submit" id="submit" value="Update"/></td>
<td><input type="reset" name="clear" id="clear" value="Clear"/></td></tr>
</table>
</form>
</div>
</body>
</html>