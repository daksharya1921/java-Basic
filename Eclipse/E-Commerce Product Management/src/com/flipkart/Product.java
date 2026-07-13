package com.flipkart;

public class Product {
	
	public String productId;
	public String productName;
	public double price;
	
	
	
	
	
	public void acceptDetails(String _productId, String _productName, double _price ) {
		this.productId = _productId;
		this.productName = _productName;
		this.price = _price;
		
	}
	
	public void displayDetails() {
		System.out.println("Product Id:"+productId);
		System.out.println("Product Name:"+productName);
		System.out.println("Product price:"+price);
		
	}

	public double calculateDiscount() {
		return price;
	}
}
