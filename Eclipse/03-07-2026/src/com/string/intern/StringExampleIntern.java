package com.string.intern;

public class StringExampleIntern {

	public static void main(String[] args) {
		
		String s1 = "Hello" +"Daksh"; // its will be in scp 
		
		String s2 = "Hello"; // Scp
		String s3 = "Daksh"; // Scp
		
		String s4 = s2+s3; // only in heap;
		
		String s5 = s4.intern(); // its will place into scp too
		
		
		
		
		
		
		


	}

}
