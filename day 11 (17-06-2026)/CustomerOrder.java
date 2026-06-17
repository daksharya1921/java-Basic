/* i/p attributes 
	customerId
	customerName
	customerType
	purchaseAmount
	
	o/p attributes
	
	discountPercentage
	discountAmount
	finalAmount
	
	customerType -Disount
	Regular      - 5%
	Premium      -10%
	Vip          -20%

*/


class CustomerOrder
{
	static int finalBalance(int purchaseAmount , int discountAmt){
		int finalAmt = (purchaseAmount-discountAmt);
		return finalAmt;
	}
	static int discount( String customerType, int purchaseAmount){
		/* customerType -Disount
	Regular      - 5%
	Premium      -10%
	Vip          -20% */
	
		if(customerType.equals("Vip")){
			System.out.println("Disount percentage:: 20%");
			int discountAmount = (purchaseAmount/100)*20;
			return discountAmount;
		}
		else if(customerType.equals("Premium")){
			System.out.println("Disount percentage:: 10%");
			int discountAmount = (purchaseAmount/100)*10;
			return discountAmount;
		}
		else {
			System.out.println("Disount percentage:: 5%");
			int discountAmount = (purchaseAmount/100)*5;
			return discountAmount;
		}
	}
	
	static void flow(int customerId, String customerName, String customerType, int purchaseAmount){
		int discountAmt= discount(customerType, purchaseAmount);
		System.out.println("Disount::"+discountAmt);
		
		System.out.println("Final Balance::"+finalBalance(discountAmt, purchaseAmount));
		
		
	}

	public static void main(String[] args){
	
		String customerIdStr = args[0];
		String customerName = args[1];
		String customerType = args[2];
		String purchaseAmountStr = args[3];
		
		int customerId = Integer.parseInt(customerIdStr);
		int purchaseAmount = Integer.parseInt(purchaseAmountStr);
		
		flow(customerId, customerName, customerType, purchaseAmount);
		
	}
}