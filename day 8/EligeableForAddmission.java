class EligeableForAddmission
{
	public static void main(String[] args)
	{
		if(args.length != 2)
		{
			System.out.println("prvide valid input");
			return;
			
		}
		
		
		String marks = args[0];
		String state = args[1];
		
		int marksInt = Integer.parseInt(marks);
		
		if(marksInt >= 75 || state.equals("Karnataka"))
		{
			System.out.println("Yes allowd");
		}
		else 
		{
			System.out.println("Not Allowed "+marksInt +"  "+state);
		}
	}
}