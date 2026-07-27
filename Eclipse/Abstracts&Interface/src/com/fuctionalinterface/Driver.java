package com.fuctionalinterface;

public interface Driver {

	public static void main(String[] args) {
		
		
		
		ICalc calcTwoNumber;
		
	//	print.print();
		
		ICalc.printStatic();
		
		calcTwoNumber = (a,b) -> a+b;
		
		int result = calcTwoNumber.calcualtion(10, 15);
		System.out.println("Result : "+result);
		
		calcTwoNumber = (c,d) -> {
			int sub = c-d;
			
			return sub;
		};
		
		 result = calcTwoNumber.calcualtion(128, 15);
		System.out.println("Result : "+result);
		
		
		
	}
}
