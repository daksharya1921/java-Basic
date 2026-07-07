package com.string.bufferbuilder;

public class DynamicQuery {
	
	public static String MSG1 = "Select * from employee";
	public static String MSG2 = " where emp_Id = ";
	public static String MSG3 = " where Salary > ";
	
	
	public String constructQuary(String empId, double salary) {
		
		StringBuilder finalQuary = new StringBuilder(MSG1);
		if(empId != null) {
			finalQuary.append(MSG2).append(empId);
		}
		if(salary > 0) {
			finalQuary.append(MSG3).append(salary);
		}
		
		finalQuary.append(";");
		return finalQuary.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	String employeeId;
//	double salary;
//
//	
//	
//	
//	
//	public DynamicQuery() {
//		
//		defaultConstructor();
//
//	}
//
//	public DynamicQuery(String _employeeId) {
//
//		this.employeeId = _employeeId;
//		PritimiseConstructor1(employeeId);
//
//	}
//
//	public DynamicQuery(double _salary) {
//
//		this.salary = _salary;
//		PritimiseConstructor(salary);
//	}
//	
//	 
//	void defaultConstructor() {
//		StringBuffer sb = new StringBuffer();
//		sb.append( MSG1).append(";");
//		
//		System.out.println(sb);
//	}
//   
//	void PritimiseConstructor(double salary) {
//		StringBuffer sb = new StringBuffer();
//		sb.append( MSG1).append(MSG3).append(salary).append(";");
//		
//		System.out.println(sb);
//	}
//   
//	void PritimiseConstructor1(String emp_Id) {
//		StringBuffer sb = new StringBuffer();
//		sb.append( MSG1).append(MSG2).append(emp_Id).append(";");
//		
//		System.out.println(sb);
//	}
   
   
	
	
}
