package com.string.bufferbuilder;

public class Driver {

	
	public static void main(String[] args) {
		
		
		DynamicQuery dq1 = new DynamicQuery();
		
		String result = dq1.constructQuary("emp_5467", 19009.00);
		System.out.println(result);
		
	}
	
}
