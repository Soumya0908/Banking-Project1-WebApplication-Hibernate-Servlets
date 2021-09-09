function employeeValidate(){
	
	alert("Welcome to Bank-App");
	
	var employeeId = document.getElementById("employeeId").value;
	var password = document.getElementById("password").value;
	
	if(employeeId.length == 0)
	{
		alert("Please enter employeeId");
		return false;
	}
   else if(password.length == 0)
	{
		alert("Please enter the password");
		return false;
	}
	else if(password.length <6 ||password.length >10)
	
	{
		alert("Please enter the password length in between 6-10 characters");
		return false;
	}
	else{
		return true;
	}
	
}