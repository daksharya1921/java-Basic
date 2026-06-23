package com.kodewala;

public class IrctcBooking {

	
	
	//private static void 
	
	private static String bookingTickect(String typeOfUser, int noOfTicket ) {
		
		
		String output = null;
		switch ( typeOfUser ) {
		case "Retail" : 
			if(noOfTicket>6 && typeOfUser.equals("Retails") ) {
			output= "Not Allowed";
			}
			else {
				output= "Your MAximum Ticket booking is  6";
			}
			break;
		case "Agent":
			
			output= "Your MAximum Ticket booking is Limitless"+noOfTicket;
			
			break;

		default: 
			output="Not Allowed";
			break;
		}
		
		return output;
	}
	
	
	public static void main(String[] args) {

		System.out.println("IrctcBooking.main().Start()");
		
		//String result = IrctcBooking.bookingTickect(args[0]);
		String typeOfUser = args[0];
		
		int ticket = Integer.parseInt(args[1]);
		
		String result = IrctcBooking.bookingTickect(typeOfUser,ticket);
		
		System.out.println(result);
		
		System.out.println("IrctcBooking.main().Star()");

	}

}
