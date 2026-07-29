package com.bank1.account.des;

public class Employee implements Cloneable{

	private String employeeName,employeeId;
	
	public Employee(String _employeeName,String _employeeId) {
		this.employeeName = _employeeName;
		this.employeeId = _employeeId;
	}
	
	public String getEmployeeId() {
		
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	@Override
	public  Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
