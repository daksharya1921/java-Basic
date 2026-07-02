package com.string.literals;

public class StringLiteralsExample {

	public static void main(String[] args) {
		
		
		String name = "Daksh"; //-> one object in SCP 
		
		String fullName = "Daksh Arya"; // -> its will create new object in scp 
		
		String name1 = "DAksh Arya"; // -> its will Create new pbject in Scp
		
		String firstName = "Daksh"; // -> no new object will created in SCP cuz its already present in SCP firstName will Refer the same address
		
		System.out.println("name == firstName: "+(name == firstName)); //true
		
		System.out.println("name1 == fullName: "+(name1 == fullName)); //false
		
		

	}

}
