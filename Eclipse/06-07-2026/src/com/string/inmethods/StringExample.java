package com.string.inmethods;

public class StringExample {

	
	public void nonRepating(String something) {
		
		String text = something;
		
		char[] inputArr1 = text.toCharArray();
		
		for(int index = 0; index<inputArr1.length; index++) {
			
			char currentChar = inputArr1[index];
			
			if(text.indexOf(currentChar) == text.lastIndexOf(currentChar)) {
				System.out.println(currentChar);
				break;
			}
		}
 		
		
	}
	
	
	public static void main(String[] args) {
		
		StringExample se =new StringExample();
		
		String something = "rtsadsd";
		
		se.nonRepating(something);
		
	}
}
