package com.kodewala.constructor;

public class SIB_IIB {
	
	static int count = 0;
	
	static {
		System.out.println("Hello this is static");
		//System.out.println(count);
	}
	
	{
		
		count++;
		//System.out.println("Counting number Of Object is created:"+count);
	}

	void print(int count) {
		System.out.println("Counting number Of Object is created:"+count);
	}
	
	public static void main(String[] args) {
		
		//System.out.println("Counting number Of Object is created:"+count);
		
		SIB_IIB si1 = new SIB_IIB();
		SIB_IIB si2 = new SIB_IIB();
		System.out.println(SIB_IIB.count);
	}
}
