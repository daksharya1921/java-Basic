package com.oops.encapulation;

public class Account {
	
	//public double balance ; // its not cuz its access modifier is public 
	private double balance ; // its well encuplcated cuz its access modifier is public we use mainly private access modifier for encuplication
	
	public double getter() {
		
		return balance;
	}
	
	public void setter(double balance) {  // we use setter public to modifiy the fields thats is in control way
		
		if(balance > 0)
		{
		this.balance = balance;
		}
	}

	

}
