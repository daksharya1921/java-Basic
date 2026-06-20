package com.table;
class Loop
{

	private static void  doPrintingTable(int number){
		
		for(int i = 1; i<=10; i++){
			
			System.out.println(number+" * "+ i+ " = " +(number*i));
		}
	}

	public static void main(String[] args){
	
		int number = Integer.parseInt(args[0]);
		Loop.doPrintingTable(number);
	}
}