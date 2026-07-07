package com.string.inmethods;

public class StringBuilderExample {

	public static void main(String[] args) {

		
		StringBuilder sBulider = new StringBuilder("Hello "); // -> "Hello " in SCP
		sBulider.append("Daksh ");  // -> Daksh in SCP
		//System.out.println(sBulider); // "Hello Daksh" -> same object  sBulider is append/modify
		
		sBulider.append("Arya"); // -> "Arya" its also in SCP 
		System.out.println(sBulider);  // Hello Daksh Arya - same object  sBulider is append/modify
		
		//So total of object created is 4 -> 3 in SCP And One is heap i.e Hello Daksh Arya
		

		
		
		//Buffer -> slow and thread safe , Synchronized , Secure
		//Builder -> fast and not thread safe , non- Synchronized , not secure

	}

}
