package com.polymorphism.runtime;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("---------------------Reference is Delivery Object Created at runtime is ExpressDelivery()-----------");
		System.out.println();
		
		Delivery del = new ExpressDelivery();
		del.estimateTime("India", "Nepal");
		
		System.out.println();
		
		System.out.println("---------------------Reference is Delivery Object Created at runtime is OneDayDelivery()-----------");
		
		System.out.println();
		
		del = new OneDayDelivery();
		del.estimateTime("Banglore", "Patna");
		
		System.out.println();
		
		System.out.println("---------------------Reference is Delivery Object Created at runtime is  Delivery()-----------");
		
		System.out.println();
		
		del = new Delivery();
		del.estimateTime("Asia", "Africa");

	}

}
