package com.hotel;

public class Novotel implements IHotel {

	@Override
	public void booking() {
		System.out.println("Novotel.booking()");
		
	}

	@Override
	public void pay() {
		//ServiceChargeUtil.serviceCharge(100020, 5);
		IHotel.serviceCharge(100020, 5);
		System.out.println("Novotel.pay()");
		
	}

	@Override
	public boolean isAvaiable() {
		System.out.println("Novotel.isAvaiable()");
		return true;
	}

}

