package com.flipkart;

public class MainApp {

	public static void main(String[] args) {
		
		Book b = new Book();
		
		
		b.acceptDetails("Why", "yui9", 100);
		double b1 = b.calculateDiscount();
		System.out.println("Final Price: "+b1);
	}
}
