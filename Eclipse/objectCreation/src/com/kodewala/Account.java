package com.kodewala;

public class Account {
	
	int amount;
	String name;

	public Account() {
		// first line of this constructor is this cuz we used this keyword
		this("Raj", 1000);
	}
	
	Account(int _amount,String _name){
		//first line of this constructor is super() cuz we used this keyword
		super();//its means object class objects no args constructors 
		this.amount= _amount;
		this.name = _name;
	}
	
	Account(String _name, int _amount ){
		
		//first line of this constructor is super() cuz we didn't write anything its automatically assign its as super() thats calls objects class no args constructor
		this.amount= _amount;
		this.name = _name;
	}
	
	
}
