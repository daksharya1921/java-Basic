package com.kodewala.firstabstractclass.ecomsystem;

public class PremiumUser extends OrderManagement {

	PremiumUser(String orderId, String productName) {
		super(orderId, productName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeOrder() {
		System.out.println("PremiumUser.placeOrder()");
		
	}

	@Override
	public void editOrder() {
		System.out.println("PremiumUser.editOrder()");
		
	}

	@Override
	public void confirmOrder() {
		System.out.println("PremiumUser.confirmOrder()");
		
	}
	
	public void freeGift() {
		System.out.println("U will get a free Gift ");
	}
	
	
}
