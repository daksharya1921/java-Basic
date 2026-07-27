package com.fuctionalinterface;

import java.util.function.Predicate;

public class PredicateFuctionalInterfaceExample {
	
	public static void main(String[] args) {
		
		// its already defined Fuctional interface -> Supplier
		Predicate<Integer> isGreater = (a) -> a>= 100;
		//Supplier
		System.out.println(isGreater.test(10));
		System.out.println(isGreater.test(190));
		System.out.println(isGreater.test(100));
	}

}
