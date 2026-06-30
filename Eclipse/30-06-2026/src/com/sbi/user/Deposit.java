package com.sbi.user;

public class Deposit {
	
	static {
		System.out.println("Deposit.enclosing_method()");
		
	}
	
	int accountNumber;
	int balance;
	int deposit;
	{
		
		System.out.println("Deposit.enclosing_method()1");
		
		
	}
	{
		System.out.println("Deposit.enclosing_method() 2");
	}
	
	Deposit(int _accountNumber,int _deposit){
		
		this(_accountNumber,1000, _deposit);
	}

	Deposit(int accountNumber,int _balance,int _deposit){
		super();
		this.accountNumber = accountNumber;
		this.balance = _balance;
		this.deposit = _deposit;
		
	}
	
	void totalBalance(int accountNumber,int balance, int deposit) {
		System.out.println("Account Number::"+accountNumber+"\nBalance:"+balance+"\nDeposit"+deposit+"Total balance:"+(balance+deposit));

		
	}

	
	
	}
	
