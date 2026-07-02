package com.string;

public class StringExample {
	
//	static int count = 0;
//	
//	{count++;}

	public static void main(String[] args) {
		
		
		String city1 = "Mumbai"; // in SCP one object

		String city2 = "Mumbai"; // no new object will create this city2 ->> will refer(address) same "Mumbai" which is
									// already present there
		System.out.println(city1 == city2); // true

		String city = new String("Mumbai"); // one object in heap its already Present in SCP so total Object Created is
											// 2
		System.out.println(city1 == city); // false

		String currentCity = new String("Bangalore"); // Two object will Created one in SCP i.e "Bengalore" and other in
														// heap cuz of new keyword

		String cityPresent = "Bangalore"; // no new object will created cuz its already present in SCP

		System.out.println(cityPresent == currentCity); // false cuz one in heap and other is pointing to SCP
		
		
		city.equals(cityPresent);
		
		//System.out.println(StringExample.count);
		
	}

}
