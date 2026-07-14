package com.polymorphism.override;

class Example1{
	
	 public Parent helloWorld(String name) {
		
		 System.out.println("Parent");
		 return new Parent();
	}
}

class Example2 extends Example1{
	
	@Override
	public Child helloWorld(String a) {
		
		System.out.println(" Child");
		 return new Child();
	}
	
}

class Example3 extends Example2 {
	
	@Override
	public GrandChild helloWorld(String b) {
		
		System.out.println("Grand Child");
		 return new GrandChild();
	}
	
}


public class CoverientExample {
	
	public static void main(String[] args) {
		
	}
	

}
