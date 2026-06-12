class Delivery
{
	public static void main(String[] args)
	{
		String productName = "Iphone";
		String result = Delivery.outForDelivery(productName);
		
		System.out.println("Product name::"+productName+"\nResult::"+result);
	}
	
	static String outForDelivery(String productItem){
		String message = "Out for delivery";
		//String box = "OPen";
		boolean openBox = Delivery.openBoxDelivery();
		System.out.println("Is open Box Delivery::"+openBox);
		return "Yes Out for delivery";
	}
	
	static boolean openBoxDelivery()
	{
		boolean isOpenBox = false;
		return isOpenBox;
	}
}