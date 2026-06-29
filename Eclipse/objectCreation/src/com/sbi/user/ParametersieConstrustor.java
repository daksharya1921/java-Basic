package com.sbi.user;

public class ParametersieConstrustor {
	
	String name;
	String userId;
	String pwd;
	int balance;
	
	ParametersieConstrustor(){
		System.out.println("ParametersieConstrustor.SBIUser()");
	}
	
	ParametersieConstrustor(String _name, String _userId, String _pwd, int _balance){
		System.out.println("ParametersieConstrustor.SBIUser()");
//		name = _name;
//		userId = _userId;
//		pwd = _pwd;
//		balance = _balance;   
		
		this.name = _name;  //same just more readable
		this.userId = _userId;
		this.pwd = _pwd;
		this.balance = _balance;
	}
	
	
	
	

	public static void main(String[] args) {
		
		ParametersieConstrustor parametersieConst = new ParametersieConstrustor("Rahul", "Rahul21", "Test@12", 100000);
		
	}

}
