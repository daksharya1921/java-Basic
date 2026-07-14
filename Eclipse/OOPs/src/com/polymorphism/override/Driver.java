package com.polymorphism.override;

public class Driver {

	
	public static void main(String[] args) {
		
		System.out.println("-----------------Manager-----------------------------");
		Manager m = new Manager();
		m.greeting(); // final class not be overriden in child class
		
		System.out.println("Salary Manager: "+m.calcuateSalary(1239));
		m.displayDetails();
		
		
		System.out.println("-----------------HR-----------------------------");
		
		HR hr = new HR();
		hr.greeting(); // final class not be overriden in child class
		
		System.out.println("Salary HR: "+hr.calcuateSalary(1456739));
		hr.displayDetails();
		
		System.out.println("---------------Developer-------------------------------");
		Developer d = new Developer();
		d.greeting(); // final class not be overriden in child class
		
		System.out.println("Salary Developer: "+d.calcuateSalary(5754));
		d.displayDetails();
	}
	
}
