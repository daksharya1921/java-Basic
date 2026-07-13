package com.polymorphism;

class Product{
	
	void printSomething() {
		System.out.println("Product.printSomething()");
	}
}

class ElectronicProducts extends Product{
	@Override
	void printSomething() {
		System.out.println("ElectronicProducts.printSomething()");
	}
}

public class Driver {
	
	
	
	public static void main(String[] args) {
		
	
	Object obj = ObjectFactory.getObject("Product");
	
	Product p1 = (Product) obj;
	p1.printSomething();
	}

}
