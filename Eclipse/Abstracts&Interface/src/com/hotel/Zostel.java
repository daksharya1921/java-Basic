package com.hotel;

public class Zostel implements IHotel {

	@Override
	public void booking() {
		System.out.println("Zostel.booking()");
		
	}

	@Override
	public void pay() {
		//ServiceChargeUtil.serviceCharge(1000, 18);
        IHotel.serviceCharge(184029, 16);
		System.out.println("Zostel.pay()");
		
	}

	@Override
	public boolean isAvaiable() {
		System.out.println("Zostel.isAvaiable()");
		return true;
	}

}