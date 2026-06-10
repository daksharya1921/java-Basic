class AddTwoNum
{
	public static void main(String args[])
	
	{
		System.out.println(" Start Main() method here");
		System.out.println(" ---------------------------------------------------------------");
		
		String firstNumberStr = args[0];
		String secondNumberStr = args[1];
		
		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber = Integer.parseInt(secondNumberStr);
		
		System.out.println(" First Number::"+firstNumber);
		System.out.println(" Second Number::"+secondNumber);
		
		int sum = firstNumber + secondNumber;
		
		System.out.println("  --> Sum of two Numbers::"+sum);
		
		System.out.println(" ---------------------------------------------------------------");
		
		
		System.out.println(" End Main() method here");
		
	}
}