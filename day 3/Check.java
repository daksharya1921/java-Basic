class CheckMainMethod
{
	  public static void  main (String args[])
	  
	{	String name = args[0];
		System.out.println("this are trying of public static void main :::"+name);

		System.out.println("1---->");
		System.out.println("Hello Trying to interchange static public void main(String args[]) ");
		System.out.println("2---->");
		System.out.println("Hello Trying to interchange static public void main(String[] args) ");
		System.out.println("3---->");
		System.out.println("Hello Trying to interchange public static void main(String[] a) ");
		System.out.println("4---->");
		System.out.println("Hello Trying to interchange void main public static (String[] a)  its error wont happens  RUN TIME ERROR ");
		System.out.println("5---->");
		System.out.println("Hello Trying to interchangepublic static void main (String args[])");
		System.out.println("6---->");
		System.out.println("Hello Trying to interchangepublic static int main (String args[])  its will give error in compile time itself RETURN TYPE MISSING");
		System.out.println("7---->");
		System.out.println("Hello Trying to interchange public static void  Main (String args[])  IT WILL COMPILE BUT THE IN RUN TIME ITS WILL THROW ERROR");
		System.out.println("8---->");
		System.out.println("Hello Trying to interchange static private static void  main (String args[])");
		
		System.out.println("ERROR->>Hello Trying to interchangepublic static int main (String args[])  its will give error in compile time itself RETURN TYPE MISSING");
		System.out.println("ERROR->Hello Trying to interchange public static void  Main (String args[])  IT WILL COMPILE BUT THE IN RUN TIME ITS WILL THROW ERROR");
		
		
		
	}
	
	public  void  main ()
	{
		System.out.println("DAksh");
	}
}