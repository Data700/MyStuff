import java.util.Scanner; 
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steve
 */
public class CarlysEventsPriceWithMethods {
    public static int guests;
		public static final double PRICE_PER_GUEST = 35.00;
		public static double totalBill;
		public static Scanner enter = new Scanner(System.in);

		public static void main(String[] args)
			{
				getGuests();
				displayMotto();
				displayEvent(guests);
			}
		public static int getGuests()
			{
				System.out.println("How many quest will be attending? ");
				guests = enter.nextInt();
				return guests;
			}
		public static String getEventNumber()
			{
				getEventNumber();
				return getEventNumber();
			}
		public static void displayEvent(int guests)
			{
				boolean isLargeEvent = (guests > 49);
				System.out.println("Number of guests attending: " + getGuests());
				System.out.println("Price Per Guest: " + PRICE_PER_GUEST);
				System.out.println("Total Bill: " + totalBill);
				System.out.println("Is this a large event: " + isLargeEvent);
			}
		public static void displayMotto()
			{
				System.out.println("*********************************************");
				System.out.println( "Carly's makes the food that makes it a party!");
				System.out.println("*********************************************");
			}
	} 

