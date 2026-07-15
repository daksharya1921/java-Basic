package com.polymorphism.runtime;

public class ExpressDelivery extends Delivery {

	@Override
	public void estimateTime(String startingAdress, String destionAddress) {

		System.out.println("ExpressDelivery.estimateTime()");
	}

}
