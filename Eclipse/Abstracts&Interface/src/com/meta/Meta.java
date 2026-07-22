package com.meta;

public interface Meta {

	void crateAccount();

	void likes();

	void uploadVideo();
	
	void message();

	void deleteAccount();
	
	public default void doCall() {
		System.out.println("Call()");
	}

	public default void reels() {
		System.out.println("30 sec videos");
	}
}
