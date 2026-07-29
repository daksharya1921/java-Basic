package com.bank1.account.des;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.bank.account.Account;

public class Driver1 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));
		Object obj  =  ois.readObject();
		Account account = (Account) obj;
		
		System.out.println(account.getName());
		System.out.println(account.getBalance());
	}

}
