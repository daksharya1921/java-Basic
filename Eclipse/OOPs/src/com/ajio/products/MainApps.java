package com.ajio.products;

import com.ajio.products.clothing.mens.MensClothing;
import com.ajio.products.clothing.womens.*;

public class MainApps {

	public static void main(String[] args) {
		
		WomenClothing wm = new WomenClothing();
		System.out.println(wm.productName);
		
		
		MensClothing mc = new MensClothing();
		System.out.println(mc.productName);
	}

}
