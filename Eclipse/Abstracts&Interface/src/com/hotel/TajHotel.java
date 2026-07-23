package com.hotel;

public class TajHotel implements IHotel {

	@Override
	public void booking() {
		System.out.println("TajHotel.booking()");
		
	}

	@Override
	public void pay() {
		//ServiceChargeUtil.serviceCharge(10000, 4);
		IHotel.serviceCharge(10000, 4);
		System.out.println("TajHotel.pay()");
		
	}

	@Override
	public boolean isAvaiable() {
		
		return true;
	}
	
	 public void pickup() {
			System.out.println("TajHotel.pickup()");
		}

}
