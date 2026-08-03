package com.exceptiontrycatch;

public class Driver {
	
	public static int pValue;

	public static void main(String[] args) {
	
		System.out.println("Driver.main() STARTTTTTTTTTTTTTTTTTTTTT");
		
		try {
			
			
//			String name = null;
//			System.out.println("length "+name.length());
			Driver d = new Driver();
			
			d.printSomething(pValue);
			d.fetchValue(args[0]);
		}
		catch(NullPointerException e) {
			System.err.println("Name value is NULL");
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Please provide the value");
			e.printStackTrace();
		}
		
		System.out.println("Driver.main() ENDDDDDDDDDDDDDDDDDD");
		
	}

	private void printSomething(int value) {
		System.out.println("Driver.printSomething() START");
		
		try {
			int result = 5/value;
		
		System.out.println(result);
		
		}
		catch(ArithmeticException e) {
			System.err.println("Number is dividing by the Zero ");
		}
		
		
		System.out.println("Printinggggggggggggggggggg");
		
		System.out.println("Driver.printSomething() END");
	}
	
	private void fetchValue(String stringExample) {
		System.out.println("Driver.fetchValue() STARTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		
		
		
		System.out.println("Driver.fetchValue() ENDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		
	}
}
