class ValidForDl
{
	public static void main(String[] args)
	{	
		/*
		if(args.length != 1)
		{
			System.out.println("plase provide a valid input");
			return;
		}
		*/
		String ageStr = args[0];
		
		int age = Integer.parseInt(ageStr);
		
		int minAge = 18;
		int maxAge = 60;
		
		if(age >= minAge && age <= maxAge)
		{
			System.out.println("You Are ELigable for DL");
		}
		else
		{
			System.out.println("You are not in required limit "+ age+"  ur's age");
		}
	
	}
}