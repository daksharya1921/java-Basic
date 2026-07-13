package com.flipkart;

public class Book extends Product {

	String author;
	String genre;
	
	// Apply a 5% discount on every book
	public double calculateDiscount() {
		double disPer = 5;
	
		
			double discount = disPer/price*100;
			System.out.println("Discount :"+discount);
			price -= discount; 
			
		
	
		return price;

	}
}
