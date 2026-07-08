package com.phonepay;

public class Account {
	
	private double balance;
	private String upiId;
	
	public Account(double _balance, String _upiId) {
		this.balance = _balance;
		this.upiId = _upiId;
	}

	public void setAcceptPayment(double amount) {
		balance = balance + amount;

	}

	public void setPay(double amount) {
		if (balance <= amount) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficent balance");
		}
	}

	public double getCheckBalance() {

		return balance;

	}

}
