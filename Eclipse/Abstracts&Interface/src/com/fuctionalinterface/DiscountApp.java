package com.fuctionalinterface;

public interface DiscountApp {

	public static void main(String[] args) {
		
	
	 
	 IDiscount discount = (amountVAlue, dis) ->
	{
		int discountAmount = amountVAlue * dis/100;
		return discountAmount;
	};
	
	int reuslt = discount.applyDiscount(1000000,2);
	
	System.out.println("Result Discount : "+reuslt);
	}
}
