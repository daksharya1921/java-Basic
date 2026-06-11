class Bill
{	
	 
	public static void main(String[] args)
	{	
		String name = args[0];
		String typeCustomer = args[1];
		String itemName = args[2];
		String priceStr = args[3];
		
		double price = Double.parseDouble(priceStr);
		System.out.println("----------------------------------------------------------------------");
		if(price >= 5000 && typeCustomer.equals("Premium"))
		{	
			double discount = 10;
			double totalCost = price-((price/100)*discount);
			System.out.println("Hello  "+name+ "\nyour cart value :: "+price +"\nTotal cost :: "+totalCost);
		}
		else if(price >= 1000 || typeCustomer.equals("Premium"))
		{
			System.out.println("Hello  "+name+"\nyour cart value :: "+price +"\nTotal cost ::"+price);
		}
		else
		{
			double delivery = 30;
			double totalCost = (delivery + price);
			System.out.println("Hello  "+name+ "\nyour cart value :: "+price +"\nTotal cost ::"+totalCost);
		}
		
		System.out.println("----------------------------------------------------------------------");
	}
}