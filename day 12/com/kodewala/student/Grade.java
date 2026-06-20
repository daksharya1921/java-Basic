package com.kodewala.student;

import com.kodewala.student.ReportCard;


class Grade{
	
	
	public static void main(String[] args){
		
		int total = Integer.parseInt(args[0]);
		
		System.out.println("Grade::"+ReportCard.grading(total));
	}
}