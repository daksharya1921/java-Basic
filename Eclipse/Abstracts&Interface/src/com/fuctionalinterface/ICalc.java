package com.fuctionalinterface;


// Functional Interface also called SAM interface (Single Abstract Method ) which will have only SINGLE ABSTRACT METHOD 
// functional Interface  is introduced in java 8 to get lamda expression finally acheiving functional Programming
// 
@FunctionalInterface
public interface ICalc {
	
	public int calcualtion(int firstNumber , int secondNumber);

	public default void print() {
		printPrivate();
		System.out.println("Doing Calcultion");
	}
	
	
	public static void printStatic() {
		printPrivate();
		System.out.println("This is Static method");
	}
	private static void printPrivate() {
		System.out.println("THis is private method");
	}
}
