package com.bank1.account.des;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Daksh Arya", "98978675");
		Employee e2 = (Employee) e1.clone();
		System.out.println(e1.getEmployeeName()+" "+e1.getEmployeeId());
		
		System.out.println();
		System.out.println(e2.getEmployeeName()+" "+e2.getEmployeeId());
	}
}
