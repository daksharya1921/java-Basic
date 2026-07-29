package com.serializationexamaple;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Animal animal = new Animal("Black", "Bear", 4);
		
		
		//this is Serilaztion
		ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream("animal.ser"));
		oos.writeObject(animal);
		
		System.out.println("Serialization Done....");
		
		oos.close();
	}

}
