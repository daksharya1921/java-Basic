package com.kodewala.firstabstractclass.ecomsystem;

public class Resellers extends OrderManagement {

	Resellers(String orderId, String productName) {
		super(orderId, productName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void placeOrder() {
		System.out.println("100 orders is placed from u");
		
	}

	@Override
	public void editOrder() {
		System.out.println("THere are some change in your items");
		
	}

	@Override
	public void confirmOrder() {
		System.out.println("u will recive payment after 7 days of order get delivery after that ");
		
	}
	
	public void refundOrder() {
		System.out.println("Resellers.refundOrder()");
	}

}
