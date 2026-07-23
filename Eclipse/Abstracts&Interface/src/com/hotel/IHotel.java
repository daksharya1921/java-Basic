package com.hotel;

public interface IHotel {

	void booking();

	void pay();

	boolean isAvaiable();

	public default void pickup() {
		luxuryCar();
		System.out.println("IHotel.pickup()");
	}

	static double serviceCharge(double amount, double percentage) {
		double charge = (amount * percentage) / 100;
		return charge;
	}

	private void luxuryCar() {
		System.out.println("IHotel.luxuryCar()");
	}

}
