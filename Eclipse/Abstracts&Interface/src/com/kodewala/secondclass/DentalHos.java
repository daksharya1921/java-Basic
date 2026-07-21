package com.kodewala.secondclass;

public class DentalHos implements IHospitalMang {

	@Override
	public void bookAppoiment() {
		System.out.println("DentalHos.bookAppoiment()");
		
	}

	@Override
	public void detailsPatient() {
		System.out.println("DentalHos.detailsPatient()");
		
	}

	@Override
	public void medicalReceipt() {
		System.out.println("DentalHos.medicalReceipt()");
		
	}

	@Override
	public void nextVistingDate() {
		System.out.println("DentalHos.nextVistingDate()");
		
	}
	
	public void structureTooth() {
		System.out.println("DentalHos.structureTooth()");
	}

}
