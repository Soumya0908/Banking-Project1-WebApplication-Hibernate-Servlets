function customerValidate(){
	var customerAccNo = document.getElementById("customerAccNo");
	
	if(customerAccNo.length == 0){
		alert("Please enter the customerAccNo");
		return false;
	}
}