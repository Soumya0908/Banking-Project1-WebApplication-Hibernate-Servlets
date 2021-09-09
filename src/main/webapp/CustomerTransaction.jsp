
<%@page import="com.revature.project1.bank.model.Customer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amount-Transaction</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link type="text/css" rel="stylesheet" href="CSS/Style.css" />
<script type="text/javascript" src="JS/CustomerTransaction.js"></script>
</head>
<body>
<div class="c-trans1" >
<h1>You logged in at<%=new java.util.Date()%></h1>
</div>
<div class="vertical-center" >
<form action="CustomerControllerTransaction" method="post" onsubmit= "return validateTransaction()">
<table align-content="center" cellpadding="10" cellspacing="10">
<tr><td>SenderAccNo</td><td><input type ="number" name ="senderId" id ="senderId"/></td></tr>
<tr><td>ReceiverAccNo</td><td> <input type="number" name="receiverId" id="receiverId"/></td></tr>
<tr><td>Enter Amount</td><td><input type="number" name="amount" id="amount"/></td></tr>
<tr><td><input type="submit" name="customerTransaction" id="customerTransaction" value="Transfer"/></td>
<td><input type ="reset" name="clear" id="clear" value="Clear"/></tr>
</table>
</form>
</div>
</body>
</html>