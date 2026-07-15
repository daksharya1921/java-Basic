package com.polymorphism.overloading;

class SignUp{
	
	void doLogin(String userId, String password) {
		
		System.out.println("SignUp.doLogin(String userId, String password)");
		
	}
	
	public int doLogin(String email, int password) {
		System.out.println("SignUp.doLogin(String email, int password)");
		
		return 0;
		
	}
	
	private void doLogin(long mobileNumber, String password) {
		System.out.println("SignUp.doLogin(long mobileNumber, String password)");
	}
	
	static void doLogin(String userName, String email, String passwprd) {
		
		System.out.println("SignUp.doLogin(String userName, String email, String passwprd)");
	}
	
	String doLogin(String passKey) {
		System.out.println("SignUp.doLogin(String passKey)");
		
		return "Hello using passKey Login";
	}
	
}




public class MethodOverloadingExample {
	
	
	

}
