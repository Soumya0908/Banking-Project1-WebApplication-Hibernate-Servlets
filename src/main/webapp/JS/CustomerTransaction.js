function validateTransaction(){
	
	var senderId = document.getElementById("senderId").value;
	var receiverId = document.getElementById("receiverId").value;
	var amount = document.getElementById("amount").value;
	
	if(senderId.length == 0){
		
		alert("Please enter senderId");
		return false;
		
	}
	
	else if(receiverId.length == 0){
		
		alert("Please enter receiverId");
		return false;
		
	}
	else if(amount.length == 0){
		alert("Amount cant be less than zero");
		return false;
	}
	
	else{
	    return true;
	}


}
