package com.ajio.products.clothing.mens;

import com.ajio.products.clothing.ClothingProducts;

public class MensClothing extends ClothingProducts {
	
	public  String typeOfCloths = "Formal";
	public short size = 32;
	
	public void deliveryTime() {
		System.out.println("MensClothing.deliveryTime()");
	}

}
