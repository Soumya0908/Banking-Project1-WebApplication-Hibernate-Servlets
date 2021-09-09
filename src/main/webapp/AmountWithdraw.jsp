<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amount-Withdraw</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="CSS/Style.css" />
<script type="text/javascript" src="JS/OperationValidate.js"></script>
</head>
<body>
<div class="cs-login" >
<h1>You logged in at <%= new java.util.Date() %></h1>
<h2 align="center">Amount-Withdraw</h2>
</div>
<div class="vertical-center">
<form action="AmountWithdraw" method="post" onsubmit ="return operationvalidate()">
<table cellpadding="10" cellspacing="10">
<tr>
<td>CustomerAccNo</td>
<td><input type="number" name="customerAccNo" id="customerAccNo" /></td>
</tr>
<tr><td>Enter-Amount</td><td><input type="number" name="amount" id="amount"/></td></tr>
<tr><td> <input type="submit" value="WithDraw" class="alert alert-danger" >
</td><td><input type="reset" value="Clear" class="alert alert-warning"></td></tr>	
</table>
</form>
<a href="CustomerOperations.jsp">CustomerOperations</a>
</div>
</body>
</html>