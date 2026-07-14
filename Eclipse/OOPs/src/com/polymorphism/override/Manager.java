package com.polymorphism.override;

public class Manager extends Employee {

	@Override
	public void displayDetails() {
		System.out.println("Hello THis is Details of Manager");
	}
	
	@Override
	public int calcuateSalary(int salary) {
		
		return 10000;
	}
}
