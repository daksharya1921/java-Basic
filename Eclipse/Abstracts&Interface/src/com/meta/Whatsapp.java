package com.meta;

public class Whatsapp implements Meta {

	@Override
	public void crateAccount() {
		System.out.println("Whatsapp.crateAccount()");
		
	}

	@Override
	public void likes() {
		System.out.println("Whatsapp.likes()");
		
	}

	@Override
	public void uploadVideo() {
		System.out.println("Whatsapp.uploadVideo()");
		
	}

	@Override
	public void deleteAccount() {
		System.out.println("Whatsapp.deleteAccount()");
		
	}
	
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("Whatsapp.message()");
	}

	
	public void doCall() {
		System.out.println("VIdeo Call Normal Voice calll & Group Calls");
	}

	
}
