package com.kodewala.secondclass;

public class Driver {

	public static void main(String[] args) {
		
	//	IHospitalMang hp ;
		
		ProcessorHospital ph;
		
		ph = new ProcessorHospital();
		
		ph.processHostpital(new DentalHos());
		
		DentalHos dh = new DentalHos();
//		dh.bookAppoiment();
//		dh.detailsPatient();
//		dh.medicalReceipt();
//		dh.nextVistingDate();
		
		dh.structureTooth();

		System.out.println();

		System.out.println("***************************************************");
		System.out.println();
		
		
		ph.processHostpital(new OrthoHosp());

		OrthoHosp oh = new OrthoHosp();
		
//		oh.bookAppoiment();
//		oh.detailsPatient();
//		oh.medicalReceipt();
//		oh.nextVistingDate();
		oh.xRay();

		System.out.println();

		System.out.println("***************************************************");
		System.out.println();

		ph.processHostpital(new EyeHos());
		
		EyeHos ey = new EyeHos();
		
//		ey.bookAppoiment();
//		ey.detailsPatient();
//		ey.medicalReceipt();
//		ey.nextVistingDate();
		ey.eyeTest();

	}

}
