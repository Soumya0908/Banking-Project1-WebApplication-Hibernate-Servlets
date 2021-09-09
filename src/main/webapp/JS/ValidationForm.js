function validation(){	
	
	alert("Welcome to BankApp")
	
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var confirmPassword = document.getElementById("confirmPassword").value;
	var mobileNo = document.getElementById("mobileNo").value;
	var email = document.getElementById("email").value;
	var salary = document.getElementById("salary").value;
	
	if(username.length == 0){
		alert("Enter the username");
		return false;
	}
	else if(password.length == 0){
		alert("Enter the password");
		return false;
	}
	else if(password < 6 || password >10){
		alert("Enter the password range in between 6-10");
		return false;
	}
	else if(password!= confirmPassword){
		alert("Password does not match");
		return false;
	}
	else if(mobileNo.length == 0 && mobileNo.length >10){
		alert("Please enter the correct mobile Number ");
		return false;
	}
	else if(email.length == 0){
		alert("Please enter valid Email");
		return false;
	}
	else if(salary < 1000){
		alert("Salary cant be less than 1000");
		return false;
	}
	else{
		alert("EmployeeDetails has been stored successfully")
		return true;
	}
}