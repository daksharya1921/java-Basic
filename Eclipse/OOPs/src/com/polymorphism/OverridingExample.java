package com.polymorphism;

class Employee{
	void Salary() {
		System.out.println("Employee.Salary()");
	}
}

class Manager extends Employee{
	
	@Override  // its happens on  Runtime 
				// its added on 1.5
	void Salary() {
		System.out.println("Manager.Salary()");
	}
}

public class OverridingExample {

}
