package com.exception;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main() start");
		
		
		
		String name = "daksh Arya";
		//String name = null; // NullPointerException if we try to do operation on null value 
		//String name = args[0]; // -> ArrayIndexOutOfBoundsException if we don't pass any thing then this expection will come
		
		System.out.println("Length of name"+name.length());
		
		Driver d = new Driver();
		d.doSomething();
		
		System.out.println("Driver.main() END");
	}
	
	private void doSomething() {
		System.out.println("Driver.doSomething() Start");
		System.out.println("Something something");
		System.out.println("Driver.doSomething() END");
	}
}
