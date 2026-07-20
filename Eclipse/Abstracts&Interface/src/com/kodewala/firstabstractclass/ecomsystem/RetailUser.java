package com.kodewala.firstabstractclass.ecomsystem;

public class RetailUser extends OrderManagement {

	RetailUser(String orderId, String productName) {
		super(orderId, productName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeOrder() {
		System.out.println("Order is Placed !");
		
	}

	@Override
	public void editOrder() {
		System.out.println("Edit order press this BUTTON");
		
	}

	@Override
	public void confirmOrder() {
		System.out.println("Order is Confirmed");
		
	}
	
	public void deliveryCharge() {
		System.out.println("Delivery charge is 50");
	}

}
