function updateValidate(){
	
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var confirmpassword = document.getElementById("confirmpassword").value;
	var mobileno = document.getElementById("mobileno").value;
	var email = document.getElementById("email").value;

 if(username.length == 0)
	{
		alert("Please enter username");
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
	
	else if(mobileno.length <10){	
		alert("please enter the correct mobile number");
		return false;
	}
	
	else if(email.length == 0){
		alert("please enter your email");
		return false;
	}
	
}