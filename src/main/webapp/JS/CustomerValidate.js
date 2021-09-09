function validate(){
	
	alert("WELCOME TO BANKAPP")
	
	var customerAccNo = document.getElementById("customerAccNo").value;
	var password = document.getElementById("password").value;
	
	if(customerAccNo.length ==0){
		alert("Please enter the customerid")
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
	
	
   else if(password!=confirmpassword){
		alert("Password does not match");
		return false;	
	}
	else{
		return true;
	}
	}
	