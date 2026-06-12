class SumOfTwo
{	// never assume 
	public static void main(String[] args) // calling of SumOfTwo.main() 
	{	/*
		if(args.length != 2){
			
			System.out.println("Please provide valid input");
			return;
		}
		*/
		
		String firstNumberStr= args[0];
		String secondNumberStr= args[1];
		
		int firstNumber = Integer.parseInt(firstNumberStr);
		int secondNumber= Integer.parseInt(secondNumberStr);
		
		int resultSum = addTwoNumber( firstNumber , secondNumber); // its will to print same thing but jvm automatically print SumOfTwo.addTwoNumber
		// We use SumOfTwo.addTwoNumber only for readility 
		
		int totalSum = SumOfTwo.addTwoNumber( firstNumber , secondNumber); // calling of SumOfTwo.addTwoNumber
		System.out.println("Sum ::"+totalSum);
		
	}
	
	static int addTwoNumber(int fNumber, int sNumber)
	{
		int sum = fNumber+sNumber;
		return sum;
	}

}