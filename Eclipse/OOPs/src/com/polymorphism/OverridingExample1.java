package com.polymorphism;


class Products{
	
//	final void dispalyDetails() {
//		System.out.println("THis is Generic Producut ");
//	}
	
	void dispalyDetails() {
  		System.out.println("THis is Generic Producut ");
  }
	
}

class ElectronicProduct1s extends Products{
	
	@Override
	void dispalyDetails() {
		
		System.out.println("THis is Electronic Product Details");
	}
}


public class OverridingExample1 {
	
	
	

	public static void main(String[] args) {
		
		ElectronicProduct1s p = new ElectronicProduct1s();
		p.dispalyDetails();
		
		//downcasting-> is acheieve by upcasting else its will give runTime Error: ClassCastException
		
		//Products p1 = 
		

	}

}
