package com.kodewala.secondclass;

public class ProcessorHospital {
	
	public void processHostpital(IHospitalMang hp) {
		hp.bookAppoiment();
		hp.detailsPatient();
		hp.medicalReceipt();
		hp.nextVistingDate();
	}

}
