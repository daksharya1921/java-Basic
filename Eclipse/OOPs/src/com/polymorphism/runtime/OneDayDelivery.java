package com.polymorphism.runtime;

public class OneDayDelivery extends ExpressDelivery {
	
	@Override
	public void estimateTime(String startingAdress, String destionAddress) {

		System.out.println("OneDayDelivery.estimateTime()");
	}

}
