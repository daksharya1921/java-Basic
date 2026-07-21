package com.kodewala.secondclass;

public class OrthoHosp implements IHospitalMang {

	@Override
	public void bookAppoiment() {
		System.out.println("OrthoHosp.bookAppoiment()");
	}

	@Override
	public void detailsPatient() {
		System.out.println("OrthoHosp.detailsPatient()");
	}

	@Override
	public void medicalReceipt() {
		System.out.println("OrthoHosp.medicalReceipt()");
		
	}

	@Override
	public void nextVistingDate() {
		System.out.println("OrthoHosp.nextVistingDate()");
		
	}

	public void xRay() {
		System.out.println("OrthoHosp.xRay()");
	}
}
