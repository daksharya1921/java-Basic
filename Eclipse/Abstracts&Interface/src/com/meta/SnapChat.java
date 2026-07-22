package com.meta;

public class SnapChat implements Meta{

	@Override
	public void crateAccount() {
		System.out.println("SnapChat.crateAccount()");
	}

	@Override
	public void likes() {
		System.out.println("SnapChat.likes()");
		
	}

	@Override
	public void uploadVideo() {
		System.out.println("SnapChat.uploadVideo()");
		
	}

	@Override
	public void deleteAccount() {
		System.out.println("SnapChat.deleteAccount()");
		
	}
	
	@Override
	public void message() {
		
		System.out.println("SnapChat.message()");
	}

	
    public 	void doCall() {
		System.out.println("video And voica call");
	}

}
