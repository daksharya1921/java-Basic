package com.cloning;



class Address1 implements Cloneable
{
	
	String line1;
	public Address1(String _line1) {
		this.line1 = _line1;
	}
	
	public Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
	}
}

class Employee1 implements Cloneable{
	String name;
	Address address;
	public Employee1(String _name, Address _address ) {
		this.name =_name;
		this.address = _address;
	}
	
	@Override
	public Employee clone() throws CloneNotSupportedException {
		// 
		Employee emp = (Employee) super.clone();
		
		//cloning the address (deep cloning)
		emp.address =  this.address.clone();
		
		return emp;
	}
}

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("Btm 2nd Stage");
		Employee e1 = new Employee("Daksh Arya", address);
		
		System.out.println(e1.name);
		System.out.println(e1.address.line1);
		
		System.out.println();
		System.out.println("after deep cloning");
		System.out.println();
		
		//Employee e2;
		Employee e2 = (Employee) e1.clone();
		e2.address.line1= "Test Address";
		System.out.println(e2.name);
		System.out.println(e2.address.line1);
		
	}
	
}


