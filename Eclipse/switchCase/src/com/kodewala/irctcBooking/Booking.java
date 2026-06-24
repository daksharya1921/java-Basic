package com.kodewala.irctcBooking;

//import java.security.PrivateKey;

public class Booking {

	
	
	
	public  static void  conditionBooking(int noOfTickets , char coachTypes) {
		
		switch (coachTypes) {
		case 'S':
			System.out.println("After discount: "+Booking.afterDiscount( noOfTickets, 300));
			break;
		
		case 'A':
			System.out.println("After discount: "+Booking.afterDiscount( noOfTickets, 500));		
				break;
		case 'F':
			System.out.println("After discount: "+Booking.afterDiscount( noOfTickets, 800));
			break;

		default: System.out.println("Provide Valid Result");
			break;
		}
	}
	private static int afterDiscount(int noOfTickets, int price) {
		
		int ticketPrice = (noOfTickets*price);
		int ticketNumber = noOfTickets;
		if(ticketNumber>5) {
			int discount = (ticketPrice/100*10) ;
			System.out.println("Discount: "+discount);
			ticketPrice -= discount;
			//ticketPrice = 
			//ticketPrice = 
		}
		else if(ticketNumber>10) {
			int discount = (ticketPrice/100*20) ;
			System.out.println("Discount: "+discount);
			ticketPrice -= discount;
			//ticketPrice = 
		}
		for(int i = 1; i<=noOfTickets; i++) {
			System.out.println("Ticket "+i+" Booked.");
		}
		return ticketPrice;
	}
	
	}
	
	
	
	

