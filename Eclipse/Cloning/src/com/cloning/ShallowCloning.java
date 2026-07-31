package com.cloning;

class Address implements Cloneable{
	
	String line1;
	public Address(String _line1) {
		this.line1 = _line1;
	}
	
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}

class Employee implements Cloneable{
	String name;
	Address address;
	public Employee(String _name, Address _address ) {
		this.name =_name;
		this.address = _address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		
		emp.address = this.address.clone();
		
		return super.clone();
	}
}

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("Btm 2nd Stage");
		Employee e1 = new Employee("Daksh Arya", address);
		
		System.out.println(e1.name);
		System.out.println(e1.address.line1);
		
		System.out.println();
		System.out.println("after cloning");
		System.out.println();
		
		//Employee e2;
		Employee e2 = (Employee) e1.clone();
		
		 e2.address.line1 = "Test"; // changing the address of line 1 to test its will change both  like original and that cloned also
		 
		 
		System.out.println(e2.name);
		System.out.println(e2.address.line1);
		
	}
	
}
