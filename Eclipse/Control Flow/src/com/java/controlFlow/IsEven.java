package com.java.controlFlow;

import	java.util.Scanner;

public class IsEven {
	
	
//	private boolean isEven(int number)
//	{
//		
//		public static void main(String[] args) {
//
//	        int result = processOrder(5, 200);
//
//	        System.out.println("Final Result = " + result);
//	    }

	    static int processOrder(int quantity, int price) {

	        int total = calculateTotal(quantity, price);

	        if(total > 500) {
	            total = applyDiscount(total);
	        }

	        total = addTax(total);

	        return total;
	    }

	    static int calculateTotal(int qty, int price) {

	        int amount = 0;

	        for(int i = 1; i <= qty; i++) {

	            amount = amount + price;

	            if(i % 2 == 0) {
	                amount = amount + 10;
	            }
	        }

	        return amount;
	    }

	    static int applyDiscount(int amount) {

	        int discount = amount / 10;

	        return amount - discount;
	    }

	    static int addTax(int amount) {

	        int tax = amount * 5 / 100;

	        return amount + tax;
	    }

}
