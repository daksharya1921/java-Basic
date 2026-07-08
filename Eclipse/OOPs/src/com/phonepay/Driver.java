package com.phonepay;

public class Driver {

	public static void main(String[] args) {

		Account account = new Account(1000, "35467890@upi");
		System.out.println(account.getCheckBalance());
		
		
		account.setPay(30); // here pay the balance using using upi 
		System.out.println(account.getCheckBalance());
		
		
		account.setAcceptPayment(500); // here accepting the balance using qr code
		System.out.println(account.getCheckBalance());

	}

}
