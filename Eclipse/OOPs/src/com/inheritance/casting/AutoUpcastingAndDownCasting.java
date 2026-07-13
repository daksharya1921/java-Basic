package com.inheritance.casting;

class Parent{
	
}

class Son extends Parent{
	
}



public class AutoUpcastingAndDownCasting {

	
	Parent p = new Son(); // its autoUpcasting -> Parent can refer son child object
	Parent p1 = (Parent) new Son(); // its Up casting -> Parent can refer son child object
	
	// Son s1 = new Parent(); // its down casting its doesn't apply automatic we need to do using (Son) -> Son can refer Parent object
	Son s1 = (Son) new Parent(); // its downCasting -> using (Son) -> Son can refer Parent object
}
