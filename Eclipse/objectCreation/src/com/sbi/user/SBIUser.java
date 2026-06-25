package com.sbi.user;

public class SBIUser {
	
	String userId;
	String name;
	String pwd;
	int balance;
	
	SBIUser(){
		
		System.out.println("      This is inside SBIUser COnstrustor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("SBIUser.main(  ) Start");
		
	//	new SBIUser(); // object created of SBIUser using name of class
		
		SBIUser sbiUser = new SBIUser();
//     Type     refe Name new  object created for the class SBIUser
		
		
		System.out.println("SBIUser.main()  End");
	}

}
