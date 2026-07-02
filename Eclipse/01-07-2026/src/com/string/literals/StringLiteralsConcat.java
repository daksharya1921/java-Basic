package com.string.literals;

public class StringLiteralsConcat {

	public static void main(String[] args) {
		
		
		String address = "BTM "; //-> its will Create one object in SCP
		address.concat(" Layout"); // -> Its will Create two objects in SCP  two object are = " Layout" , "BTM Layout"
		//if we do reference to this will assign as "BTM Layout"
		
		System.out.println(address); // -> it will print BTM
		

	}

}
