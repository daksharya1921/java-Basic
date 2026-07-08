package com.oops.encapulation;

public class User {

	public static void main(String[] args) {
		
		Account account = new Account();
		
//		System.out.println("account.balance "+account.balance); // compiler Error cuz its private and well encapulated
//		
//		account.balance = -4567890; // compiler Error cuz its private and well encapulated
//		
//		System.out.println("account.balance "+account.balance); // compiler Error cuz its private and well encapulated
		
		
		// for well ecplucated fields we use setter method to set the value we can give condition if needed
		// for well ecplucated fields we use getter method to get the value

		
		// only getter to get default the value
		System.out.println("account.getter(): "+account.getter());
		
		
		// by setting methods we can get the value -> using getter to print that value
		
		// set the value using setter method
		account.setter(-34356789);	
		System.out.println("account.getter() after setting value as -34356789 : "+account.getter());  //  cuz we have predefine condition thats why its not set
		
		// so now
		account.setter(3456789);
		System.out.println("account.getter() after setting value as 3456789 : "+account.getter());  // this will print cuz its condition is met thats why its will print 
		
		
		// this all i do for hide data from the other class to modify as the wanna change to have some condition using access modifier 
		
	}

}
