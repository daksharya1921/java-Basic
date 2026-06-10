class EmpolyeeDetails
{
	public static void main(String args[])
	{	
		System.out.println("Main() method start");
		System.out.println("----------------------------------------------------------------");
		
		String firstName = args[0];
		String lastName = args[1];
		String email = args[2];
		String state = args[3];
		String country = args[4];
		
		System.out.print("Full Name::"+firstName);
		System.out.println(" "+lastName);
		System.out.println("Email::"+email);
		System.out.println("State Name::"+state);
		System.out.println("Country Name::"+country);
		
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Main() will End here");
		
	}
}