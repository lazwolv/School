/*
@author Lazaro Martinez
I pledge my word of honor that I have abided
by the CSN Academic Integrity Policy while
completing this assignment.
@file MartinezLazaroCit130Hw3.java
@version The date as 2024-02-02
@note Time taken 1.5 hour
*/

/* IPO

Start
Import Java Utility Package
Setup Scanner
Declare variables
Get Adult tickets
Validate Adult tickets >= 0
	If Discount Threshold met
		Calculate Adult discount
		Output Adult discount
		Calculate Adult cost with discount
	Else Calculate Adult cost without discount
	Output "Ticket Booking Summary"
	Output amount of Adult tickets
	Output Adult tickets cost formatted
Else Output Error Message
Get Child tickets
Validate Child tickets >= 0
	If Discount Threshold met
		Calculate Child discount
		Output Child discount
		Calculate Child cost with discount
	Else Calculate Child cost without discount
	Output Ticket Booking Summary"
	Output amount of Child tickets
	Output Child tickets cost formatted
Else Output Error Message
Calculate Total Discount
Output Total Discount
Calculate Total Cost
Output Total Cost
End

*/

// import utility package
import java.util.Scanner;

public class MartinezLazaroCit130Hw3{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in); // setup scanner utility

		//declare all variables
		final double AdultTicketPrice=12.5;
		final double ChildTicketPrice=8.0;
		int AdultTickets;
		double AdultDiscount = 0;
		double AdultCost = 0;
		int ChildTickets;
		double ChildDiscount = 0;
		double ChildCost = 0;
		int TempInput;
		double TotalDiscount;
		double TotalCost;

		// get user input for adult tickets
		System.out.println ("How many adult tickets?");
		// use temporary variable for validation
		TempInput=input.nextInt();
		if (TempInput >= 0) {
			AdultTickets = TempInput;
			// discount threshold check
			if (AdultTickets >= 5) {
				// calculate discount
				AdultDiscount = AdultTickets * (AdultTicketPrice * .15);
				// output discount
				System.out.println("Adult Discount Applied: $" + AdultDiscount);
				// calculate adult cost with discount
				AdultCost = AdultTickets * AdultTicketPrice - AdultDiscount;
			} else {
				// calculate adult cost full price
				AdultCost = AdultTickets * AdultTicketPrice;
			}

			// output gathered and calculated information
			System.out.println("Ticket Booking Summary:");
			System.out.println("Number of adult tickets: " + AdultTickets);
			System.out.println("Total cost for adults: $" + (int)(AdultCost*100.0)/100.0);

		} else {
			// error message if user inputs a negative number
			System.out.println("Invalid number of adult tickets.");
		}

		// get child tickets
		System.out.println("How many child tickets?");
		// temporary variable for validation
		TempInput = input.nextInt();
		if (TempInput >= 0) {
			ChildTickets = TempInput;
			// check for discount threshold
			if (ChildTickets >= 3) {
				// calculate discount
				ChildDiscount = ChildTickets * (ChildTicketPrice * .1);
				// output discount
				System.out.println("Child Discount Applied: $" + ChildDiscount);
				// calculate cost with discount
				ChildCost = ChildTickets * ChildTicketPrice - ChildDiscount;
			} else {
				// calculate cost without discount
				ChildCost = ChildTickets * ChildTicketPrice;
			}

			// output gathered and calculated information
			System.out.println("Ticket Booking Summary:");
			System.out.println("Number of child tickets: " + ChildTickets);
			System.out.println("Total cost for children: $" + (int)(ChildCost*100.0)/100.0);

		} else {
			// error message if user inputs negative number
			System.out.println("Invalid number of child tickets.");
		}

		// calculate and output Total Discount and Total Cost
		TotalDiscount = AdultDiscount + ChildDiscount;
		System.out.println("You received a discount amount of $" + TotalDiscount);
		TotalCost = AdultCost + ChildCost;
		System.out.println("Total Cost: $" + TotalCost);

		input.close();
	}//main


}//class