package com.flipkart;

public class Clothing extends Product {
	
	public short size;
	public String color;

	
	
	public double calculateDiscount() {
		double disPer = 20;
	//  Apply a 20% discount if the price is greater than ₹2,000.
		if(price > 2000) {
			double discount = disPer/price*100;
			System.out.println("Discount :"+discount);
			price -= discount; 
			return price;
		}
		
		return price;

	}
}
