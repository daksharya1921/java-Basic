package com.polymorphism.override;

public class Developer extends Employee {
	
	@Override
	public void displayDetails() {
		System.out.println("Hello THis is Details of Developer");
	}
	
	@Override
	protected int calcuateSalary(int salaryDev) {

		return 50000;
	}
	
	
}
