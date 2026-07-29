package com.bank.account;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Account acc = new Account(1000, "Daksh Arya", "SBO03034","Beng");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
		oos.writeObject(acc);
		
		System.out.println("Serilation DOne");
		
		oos.close();
	}

}
