package com.kodewala;

class Employee
{

	public static void rahul(){
		
		// private double employeeSalary = 10000.20d;
		double employeeSalary = 10000.20d;
		/* Employee.java:6: error: illegal start of expression
                private double employeeSalary = 10000.20d; */
		
		 int employeeId = 1000;
		
		String employeeName = "Daksh Arya";
		// public String employeeName = "Daksh Arya";
		
		/* mployee.java:15: error: illegal start of expression
                public String employeeName = "Daksh Arya"; */
		
		
	}
	
	 static void displayEmployeeId(int employeeId){
		
		System.out.println("Employee Id"+employeeId);
	}
	
	public static void displayEmployeeName(String employeeName){
		System.out.println("Employee Name:"+employeeName);
	}
	private static void displayEmployeeSalary(double employeeSalary){
		System.out.println("Employee salary:"+employeeSalary);
	}
}