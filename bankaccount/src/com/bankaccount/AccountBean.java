package com.bankaccount;

public class AccountBean {
	private double ReceivingBalance,DepositAmount,WithdrawAmount;  

	public void setReceivingBalance(double rbalance) {  
	    this.ReceivingBalance = rbalance;  
	}  
	 
	public void setDepositAmount(double damount) {  
	    this.DepositAmount = damount;  
	}  
	
	public void setWithdrawAmount(double wamount){
		this.WithdrawAmount = wamount;
	}

	public boolean isValidWithdrawal(){  
	    if(ReceivingBalance > WithdrawAmount){  
	        return false;  
	    }  
	    else{  
	        return true;
}
}
}