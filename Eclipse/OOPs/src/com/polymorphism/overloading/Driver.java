package com.polymorphism.overloading;

public class Driver {

	public static void main(String[] args) {
		
		SignUp su = new SignUp();
		System.out.println("------------------This method return type is String -----------------------------------");
		System.out.println(su.doLogin("rertftyghop-cgh p"));
		System.out.println("---------------This method is static method--------------------------------------");
		su.doLogin("daiwik", "daiwik@login.com", "Test@1234");

	}

}
