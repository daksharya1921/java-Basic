package com.inheritance.hidingandprivate;


class Delivery{
	
	private void estimatedTime(String details, int date){
		System.out.println("Delivery.estimatedTime()");
	}
	
	
	static void greetingMessage(String name) {
		System.out.println("Delivery.greetingMessage()");
	}
	
}

class ExpreeDelivery extends Delivery {
//	@Override
//	private void estimatedTime(String details, int date){ // private is within the class so this parents private method is not done
//		System.out.println("ExpreeDelivery.estimatedTime()");
//	}

//	@Override
//	static void greetingMessage(String name) { // static is there in class but parent method hide them himself if wanna
//												// to access parents static method needs to call by
//												// parentsclass_name.nethodName
//		System.out.println("ExpreeDelivery.greetingMessage()");
//	}

}


public class MethodHidingAndPrivateMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
