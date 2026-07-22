 package com.meta;

public class FaceBook implements Meta{

	@Override
	public void crateAccount() {
		System.out.println("FaceBook.crateAccount()");
		
	}

	@Override
	public void likes() {
		System.out.println("FaceBook.likes()");
		
	}

	@Override
	public void uploadVideo() {
		System.out.println("FaceBook.uploadVideo()");
		
	}

	@Override
	public void deleteAccount() {
		System.out.println("FaceBook.deleteAccount()");
		
	}
	
	@Override
	public void message() {
		
		System.out.println("FaceBook.message()");
	}

	
	public void doCall() {
		System.out.println("Voice call Only");
	}

}
