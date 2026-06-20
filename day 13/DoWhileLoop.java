class DoWhileLoop
{

	private static void printingDoWhile(int number){
		
		//int number = 1000;
		do 
		{
			System.out.println("Number::"+number);
			number++;
		}
		while(number<100);
	}


	public static void main(String args[]){
		
		int number = Integer.parseInt(args[0]);
	
		DoWhileLoop.printingDoWhile(number);
	}
}