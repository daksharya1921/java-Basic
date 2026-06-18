/* Develop 
	1.below the 200k bpl
	2.b/w 200k to 1000k lower middle class
	3.b/w the 1000k to 10000k Middle class
	4.b/w 10000k to 100000k upper
	5. above 1000000k hni
	
*/


class IncomeRange
{
	static void printClass(long yearlyIncome){
		
		if(yearlyIncome >= 100000000)
		{
			System.out.println("High Networth Indiviual");
		}
		else if(yearlyIncome < 100000000 && yearlyIncome >= 10000000){
			System.out.println("High Networth Indiviual");
		}
		else if(yearlyIncome < 100000000 && yearlyIncome >= 10000000){
			System.out.println("Upper Class");
		}
		else if(yearlyIncome < 10000000 && yearlyIncome >= 1000000){
			System.out.println("Middle class");
		}
		else if(yearlyIncome < 1000000 && yearlyIncome >= 100000){
			System.out.println("lower Middle class");
		}
		else {
			System.out.println("Below Proverty Line");
		}
		
	}
	
	public static void main(String[] args){
		
		long yearlyIncome = Long.parseLong(args[0]);
		
		IncomeRange.printClass(yearlyIncome);
	}
}