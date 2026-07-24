package com.typeofinterface;




/**
 * Type of Interface 
 * 1.Normal Interface
 * 2. Marker Interface/ TAg Interface /Empty Interface
 * 3.Functional Interface
 */






/**
 * @author Daksh.Arya
 */

class Employee  // implements Cloneable
{
	
	String name, location;
	
	public Employee(String name, String location){
		
		this.name = name;
		this.location = location;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

/**
 * @author Daiwik.Arya
 */
public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Daksh Arya", "IND");
		
		Employee e2 = (Employee) e1.clone();
		
		System.out.println(e2.name+" "+e2.location);
	}
}
