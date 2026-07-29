package com.bank.account;

import java.io.Serializable;

public class Account implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// transient 
	private  int balance;
	private  String name;
	private String ifceCode;
	private String address;
	
	public Account(int _balance,String _name, String _ifceCode, String _address) {
		this.balance = _balance;
		this.name  =_name;
		this.ifceCode  = _ifceCode;
		this.address = _address;
	}
	
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}

}
