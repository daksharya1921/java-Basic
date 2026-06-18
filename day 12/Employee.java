class Employee
{

	public static void main(String[] args){
	
		
		String employeeType = args[0];
		
		int bonusAmount =  Employee.eligableBonus(employeeType);
		
		System.out.println("Employee Bonus is::"+bonusAmount);
		
	}
	
	static int eligableBonus(String employeeType){
		
		int bonus = 0;
		if(employeeType.equals("Full Time")){
			
			bonus = 5000;
			
			
		}
		else {
			bonus = 1000;
		}
		
		return bonus;
	}
}