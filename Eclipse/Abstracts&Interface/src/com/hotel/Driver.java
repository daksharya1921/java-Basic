package com.hotel;

public class Driver {

	public static void main(String[] args) {
		IHotel hotel = new Zostel();
		hotel.booking();
		hotel.pickup();
		hotel.pay();
	//	hotel.serviceCharge;
		
	}
}
