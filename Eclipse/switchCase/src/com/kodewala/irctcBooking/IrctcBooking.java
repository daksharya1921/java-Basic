/* 
 Question 1: Train Ticket Booking

Problem Statement

Create a class Booking.

Accept:

Number of tickets
Coach Type (S, A, F)

Rules:

Ticket Cost

Using switch:

Coach	Price
S (Sleeper)	300
A (AC)	800
F (First AC)	1500
Discount

Using if-else:

More than 5 tickets → 10% discount
More than 10 tickets → 20% discount
Otherwise → No discount
Loop

Use a for loop to display:

Ticket 1 Booked
Ticket 2 Booked
...
Output
Total Amount : 5400
 */



package com.kodewala.irctcBooking;


public class IrctcBooking {
	
	public static void main(String[] args) {
		
		Booking.conditionBooking(5, 'S');
	}
}
