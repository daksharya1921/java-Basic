IdentifierCheck  // $IdentifierCheck :-> it will work
{
	// int = 25;
	/* IdentifierCheck.java:3: error: <identifier> expected
        int = 25;
           ^
1 error
error: compilation failed */
	
	public static void main(String args[])
	{
		
		String day = args[0];
		
		System.out.println("Today is "+day);
	
	}
	
}