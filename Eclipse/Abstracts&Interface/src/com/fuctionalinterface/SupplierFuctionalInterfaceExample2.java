package com.fuctionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFuctionalInterfaceExample2 {
	
	
	
	public static void main(String[] args) {
		
		Supplier<String> printSomething = () -> "Hello";
		
		
		Supplier<Integer> otp = () -> 1000000+ new Random().nextInt();
		
		System.out.println(printSomething.get());
		System.out.println(otp.get());
	}

}
