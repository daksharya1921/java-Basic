class ProductPrice
{
	public static int gst = 18;
	
	public static void main(String[] args)
	{
		/*
		int iphonePrice = 100000;
		
		double totalAmount = (iphonePrice)+((gst)*(iphonePrice/100));
		
		System.out.println("  Iphone price "+iphonePrice);
		System.out.println("-------------------------------------------------------------");
		System.out.println("Total price of Iphone including gst "+gst+"% is "+totalAmount);
		System.out.println("-------------------------------------------------------------");
		
		*/
		
		
		String productPriceStr = args[0];
		
		int productPrice = Integer.parseInt(productPriceStr);
		
		double totalAmount = (productPrice)+((ProductPrice.gst)*(productPrice/100));
		
		System.out.println("  Product Price :: "+productPrice);
		System.out.println("Total price of Iphone including gst "+gst+"% is "+totalAmount);
	}

}