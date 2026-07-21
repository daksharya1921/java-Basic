package com.kodewala.secondclass;

public class EyeHos implements IHospitalMang {

	@Override
	public void bookAppoiment() {
		System.out.println("EyeHos.bookAppoiment()");
		
	}

	@Override
	public void detailsPatient() {
		System.out.println("EyeHos.detailsPatient()");
		
	}

	@Override
	public void medicalReceipt() {
		System.out.println("EyeHos.medicalReceipt()");
		
	}

	@Override
	public void nextVistingDate() {
		System.out.println("EyeHos.nextVistingDate()");
		
	}
	
	public void eyeTest() {
		System.out.println("EyeHos.eyeTest()");
	}

}
