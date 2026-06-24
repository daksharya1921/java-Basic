package com.kodewala.array;

public class ArrayPrinting {

	private static void printArray() {
		
		int arr[] = new int[3];
		
		int arr1[]= {13,143,54,56,465};
		
		arr[0] = 34;
		arr[1] = 98;
		arr[2] = 90;
		
		
		System.out.print("arr["+arr.length+"] = ");
		//System.out.println("");
		System.out.print("[");
		for(int i = 0; i< arr.length ; i++ ) 
		{
			
			System.out.print(arr[i]);
			if(arr[arr.length-1] == arr[i] ) {
				break;
			}else 
			System.out.print(",");
			
		}
		System.out.println("]");
		
		System.out.println("");
		System.out.println("arr1");
		System.out.println("");
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printArray();
	}
	
	

}
