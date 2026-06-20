/* Problem Statement
Create a program that classifies students based on their marks.

Marks below 200 → "Fail"

Marks between 200–500 → "Average"

Marks between 500–800 → "Good"

Marks between 800–1000 → "Excellent"

Requirements:

Put the class in a package (e.g., com.kodewala.student).



Accept marks from command-line arguments.

Use access modifiers (public, private) properly.

*/


package com.kodewala.student;


class ReportCard
{
	static String grading(int totalmarks){
		if(totalmarks >= 0 &&totalmarks < 200){
			return "Fail";
		}
		else if(totalmarks >= 200 && totalmarks <500){
			return "Average";
		}
		else if(totalmarks >= 500 && totalmarks <800){
			return "Good";
		}
		else if(totalmarks >= 800 && totalmarks <1000){
			return "Excellent";
		}
		else {
				return "Please Provide valid Marks!!";
			}
	
	}
	
	
	
	

	public static void main(String[] args){
	
		int totalmarks = Integer.parseInt(args[0]);
		
		String grade = grading(totalmarks);
		
		System.out.println("Total Marks: "+totalmarks+"\nGrade: "+grade);
	}
}