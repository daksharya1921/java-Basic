package com.flipkart;

public class Electronics extends Product {
	
	public String brand;
	public short warrantyYears;
	
	public double calculateDiscount() {
		double disPer = 10;
		//Apply a 10% discount if the price is greater than ₹50,000.
		if(price > 50000) {
			double discount = disPer/price*100;
			System.out.println("Discount :"+discount);
			price -= discount; 
			return price;
		}
		
		return price;

	}
	

}
