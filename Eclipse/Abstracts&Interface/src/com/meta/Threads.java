package com.meta;

public class Threads implements Meta {

	@Override
	public void crateAccount() {
		System.out.println("Threads.crateAccount()");
		
	}

	@Override
	public void likes() {
		System.out.println("Threads.likes()");
		
	}

	@Override
	public void uploadVideo() {
		System.out.println("Threads.uploadVideo()");
		
	}

	@Override
	public void message() {
		
		System.out.println("THread.message()");
	}

	
	@Override
	public void deleteAccount() {
		System.out.println("Threads.deleteAccount()");
		
	}

}
