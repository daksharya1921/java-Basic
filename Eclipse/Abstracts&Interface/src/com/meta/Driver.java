package com.meta;

public class Driver {

	public static void main(String[] args) {
		Meta meta;

		meta = new Whatsapp();
		meta.crateAccount();

		meta.likes();

		meta.uploadVideo();

		meta.message();

		meta.deleteAccount();
		System.out.println();
		meta = new FaceBook();
		System.out.println("");
		meta.crateAccount();

		meta.likes();

		meta.uploadVideo();

		meta.message();

		meta.deleteAccount();

	}

}
