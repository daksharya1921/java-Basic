class EcommerceOrder
{
	
	
	static boolean placeOrder(String itemName, String itemQty)
	{
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("Item name::"+itemName);
		System.out.println("Item qty::"+itemQty);
		
		System.out.println("------------------------------------------------------------------------------");
		
		int invoiceId = 34243;
		boolean invOrder = EcommerceOrder.invoiceOrder(invoiceId); // calling invoiceOrder method
		
		String emailId = "daksh@hello.com";
		boolean emailUpdate = EcommerceOrder.emailUpdateOrder(emailId); // calling emailUpdateOrder method
		
		double paymentAmount = 56.00d;
		boolean paymentOrder = EcommerceOrder.payment(paymentAmount); // // calling payment method
		
		System.out.println("------------------------------------------------------------------------------");
		
		return true;
		
	}
	
	static boolean invoiceOrder( int invoiceId)
	{
		System.out.println(" this is inside Invoice Order method");
		System.out.println("Print invoice Id::"+invoiceId);
		
		return true;
	}
	
	static	boolean emailUpdateOrder(String email)
	{
		System.out.println("this is inside EmailUpdateOrder method");
		System.out.println("Print Email::"+email);
		
		return true;
	}
	static boolean payment( double payment)
	{
		System.out.println("this is inside Payment method");
		System.out.println("Print payment::"+payment); 
		
		return true;
	}
	
	
	
	public static void main(String[] args)
	{
		if(args.length != 2){
			
			System.out.println("Please provide valid input");
			
			return;
			
		}
		
		String itemName = args[0];
		String itemQty = args[1];
		
		boolean orderDetails = EcommerceOrder.placeOrder(itemName,itemQty); // calling placeOrder method 
	}
}