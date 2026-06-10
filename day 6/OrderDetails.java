class OrderDetails
{
	public static void main(String[] args)
	{
		System.out.println("-------------------------------------------------------------");
		long orderId = 743598290l;
		System.out.println("orderId::"+orderId);
		
		String productName = "Books";
		System.out.println("Product name is "+productName);
		
		
		
		short productPrice = 300;
		System.out.println("Price of product:: " + productPrice);
		
		float gstOnOrder = 5.00f;
		System.out.println("GST on the Product::"+gstOnOrder+"%");
		
		double totalCartValue = 330.000d;
		System.out.println("Total Cart Value::"+totalCartValue);
		
		String customerName = "Daksh arya";
		System.out.println("Name of Customer::"+customerName);
		
		System.out.println("-------------------------------------------------------------");
		
		String pickupAddress = "16 , main road, XXXXXXXX XXXXXXX";
		System.out.println("Order pickup Address ::"+pickupAddress);
		
		String deliveryAddress = "18, XXXXXX XXXXXX XXXXXXX XXXX ";
		System.out.println("Order to Delivery Address::"+deliveryAddress);
		
		System.out.println("Delivery Status");
		System.out.println("-------------------------------------------------------------");
		boolean inTransit = true;
		System.out.println("In Transit status::"+inTransit);
		
		boolean outForDelivery = false;
		System.out.println("Out for Delivery Status::"+outForDelivery);
		
		boolean deliveredStatus = false;
		System.out.println("Status of Delivered:: "+deliveredStatus);
		
		char isOpenBox = 'Y';
		System.out.println("Product is Open Box Delivery::"+isOpenBox);
		System.out.println("-------------------------------------------------------------");
		
	}

}