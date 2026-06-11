class ValidForFreeDelivery
{
	public static void main(String[] args)
	{
		String orderPriceStr = args[0];
		
		int orderPrice = Integer.parseInt(orderPriceStr);
		
		System.out.println("If the Order is "+orderPrice+" Free Delivery "+(orderPrice >= 450));
	}
}