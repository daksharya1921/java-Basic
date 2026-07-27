package com.fuctionalinterface;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		
		Function<Integer, Integer> function = (amt) -> (amt- (amt*4/100));
		
		System.out.println(function.apply(200));

	}

}
