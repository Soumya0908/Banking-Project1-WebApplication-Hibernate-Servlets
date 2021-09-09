function operationvalidate(){
	var customerAccNo = document.getElementById("customerAccNo").value;
	var amount = document.getElementById("amount").value;
	
	if(customerAccNo.length == 0){
		alert("Please enter customerAccountNumber");
		return false;
	}
	
	else if(amount < 0){
		alert("Amount can't be less than zero");
		return false;
	}
	
	else {
		return true;
		
	}
}