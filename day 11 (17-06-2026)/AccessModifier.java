class Modifier
{

	public static void main(String[] args){
	
		System.out.println("Its access modifer start class ");
		helloWorld();
		System.out.println("Its access modifer end class ");
	
	}
	
	/*?protected - can access outside*/ /*private--?complier error*/ /*public-- able to complie and excute*/
	/* Default to able to complie and run*/
	static void helloWorld(){
	
			System.out.println("Its hello TO all ");
	}
}

class Access
{
	
	public static void accessAccessModifierClass(){
		
		Modifier.helloWorld();
	}
}