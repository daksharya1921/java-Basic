package com.meta;

public interface Meta {

	void crateAccount();

	void likes();

	void uploadVideo();
	
	void message();

	void deleteAccount();
	
	public default void doCall() {
		doCall1();
		System.out.println("Call()");
	}

	public static void reels() {
	//	doCall1();
		System.out.println("30 sec videos");
	}
	
	private void doCall1() {
		System.out.println("Call()");
	}

}
