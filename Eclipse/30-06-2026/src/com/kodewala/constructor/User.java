package com.kodewala.constructor;

public class User {

	private String userName;
	private String userId;

	private String mobile;
	private String email;


	public User(String _userId) {
		this("guest_User", _userId, "546789", "fahn@dsfin.com");
		System.out.println("User.User()-1");
	}
	
	public User(String userName, String userId, String mobile, String email) {

		this.userName = userName;
		this.userId = userId;
		this.mobile = mobile;
		this.email = email;

		System.out.println("User.User()-2");
	}
}
