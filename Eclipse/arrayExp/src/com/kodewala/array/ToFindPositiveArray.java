package com.kodewala.array;

public class ToFindPositiveArray {

	
	private static void isPositive() {
		boolean count =false;
		
		int arr[] = {482397,-1231,234,132,123,34};
		
		for(int i = 0; i<arr.length; i++) {
			
			if(arr[i]<0) {
//				System.out.println("Array is negative");
				count = true;
				break;
			}
			
			
			 
		}
		
		if(count != false) System.out.println("Array is negative");
		else System.out.println("Positve");
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPositive();
	}

}
