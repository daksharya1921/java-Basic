package com.city;

class City
{
	
	private static void printCity(String cityName[]){
		
		for(int index = 0; index<cityName.length; index++){
		
			String nameOfCity = cityName[index];
			System.out.println("City Name::"+cityName[index]);
		}
		
	}
	
	public static void main(String args[]){
		
		City.printCity(args);
		
	}
}