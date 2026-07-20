package com.kodewala.firstabstractclass.ecomsystem;

public abstract  class OrderManagement {
	
	String orderId,productName;
	
	OrderManagement(String orderId,String productName){
		this.orderId= orderId;
		this.productName = productName;
	}
	
	public abstract void placeOrder();
	
	public abstract void editOrder();
	
	public abstract void confirmOrder();
	
	public void orderStatus() {
		System.out.println("Order is in Placing phase");
	}
	
	public void orderDetails() {
		System.out.println("Order Id:"+orderId);
		System.out.println("Product Name:"+productName);
	}
	
	
}
