package com.polymorphism.override;

public class HR extends Employee {
	
	@Override
	void displayDetails() {
		System.out.println("Hello THis is Details of HR");
	}
	
	@Override
	protected int calcuateSalary(int salaryHR) {

		return 20000;
	}

}
