package com.amazon.user;

import com.oops.Inheritense.UserMgmt;

public class User extends UserMgmt {

	
	public static void main(String[] args) {
		User user = new User();
		
		System.out.println("Id is Inherited from parentect class using protected :"+user.id);
		System.out.println("Value is Inherited from parentect class using protected "+user.value);
		
		user.doSomething();
	}
}
