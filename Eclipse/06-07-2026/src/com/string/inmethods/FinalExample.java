package com.string.inmethods;


final class Something {

	// we use this for Security purpose like 
	// don't want someone to extends this code 
	
	
	
}

class Test {

	final void doSomething() { // -> final method cannot we overridden

	}
}

public class FinalExample extends Test // extends Something -> won't extends cuz in Something class we use final
										// keyWords and final stop class to becoming parent or inherit
{

	final static int VALUE = 57; // -> final makes variable constant and we use CAPTIAL_LETTER for constant  mainly class specific cuz of memory management 
								// cannot change one assign

	public static void main(String[] args) {
		

//		@Override
//		void doSomething() {  // -> 
//			
//		}

		// VALUE =23; ->> its wont modify cuz its final variable which is constant that
		// cannot change

	}

}
