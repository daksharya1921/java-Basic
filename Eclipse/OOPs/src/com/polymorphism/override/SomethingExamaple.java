package com.polymorphism.override;


class Delivery{
	
	public Post newDelivery() {
		
		return new Post();
	}
	
}

class DHL extends Delivery{
	
	@Override
	public SpeedPost  newDelivery() {
		
		System.out.println("fghjkl");
		return new SpeedPost();
	} 
}


public class SomethingExamaple {

	
	
}
