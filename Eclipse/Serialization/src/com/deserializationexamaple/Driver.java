package com.deserializationexamaple;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.serializationexamaple.Animal;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		// this is deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("animal.ser"));
		Object a = ois.readObject();
		
		Animal bear = (Animal) a;
		
		System.out.println("deserialization");
		System.out.println();
		System.out.println(bear.getName());
		System.out.println(bear.getColor());
		System.out.println(bear.getNoOfLegs());
		
		Animal animalName = (Animal) bear.clone();
		System.out.println();
		System.out.println("Clone");
		System.out.println();
		System.out.println(animalName.getName());
		System.out.println(animalName.getColor());
		System.out.println(animalName.getNoOfLegs());
		
		
		
	}
}
