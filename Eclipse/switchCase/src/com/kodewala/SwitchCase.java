package com.kodewala;

public class SwitchCase {

	private static String printingSwitchCase(int number) {

		String days = null;

		switch (number) {
		case 1:
			days = "Monday";
			break;

		case 2:
			days = "Tuesday";
			break;

		case 3:
			days = "Wednesday";
			break;

		case 4:
			days = "Thursday";
			break;

		case 5:
			days = "Friday";

			break;
			
		case 6:
			days = "Saturday";
			break;

		case 7:
			days = "Sunday";
			break;

		default:
			days = "please provide valid number";
			break;
		}

		return days;

	}

	public static void main(String[] args) {
		// System.out.println();
		System.out.println("SwitchCase.main().Start()");
		int days = Integer.parseInt(args[0]);

		String output = SwitchCase.printingSwitchCase(days);

		System.out.println("Output :" + output);

		System.out.println("SwitchCase.main().End()");

	}

}
