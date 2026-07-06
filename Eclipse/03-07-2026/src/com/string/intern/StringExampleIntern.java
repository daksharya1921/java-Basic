package com.string.intern;

public class StringExampleIntern {

	public static void main(String[] args) {
		
		//String s1 = "Hello" +"Hello"; // its will be in scp 
		
		String s2 = "Hello"; // Scp
		String s3 = "Hello"; // Scp
		
		String s4 = s2+s3; // only in heap;
		
		String s5 = s4.intern(); // its will place into scp too
		
		System.out.println(s4 == s5);
		
		
		
		
		
		
		


	}

}
