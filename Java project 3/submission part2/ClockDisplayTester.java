/**
 * A simple tester class to test the ClockDisplay class methods
 * @author A. Razak
 * version 12/02/2023
 */
public class ClockDisplayTester {
	
	// the main method where execution of the program starts.
	
	public static void main(String args[]){
		
		
		
	/* Exercise 1 Using the default constructor to create a clock display object.
	 * Notice what is displayed when using the default constructor. */
		
		// Creating a ClockDisplay object "clock1" using the default constructor.
		
		ClockDisplay clock1 = new ClockDisplay();// Creating a clock default constructor.
		clock1.printTime();   //printing the time.
		clock1.timeTick();  //incrementing the minutes by 1 minutes.
		clock1.printTime();   //printing the time.
		clock1.timeTick();  //incrementing the minutes by 1 minutes.
		clock1.printTime();   //printing the time.
		
		
		
	/* Exercise 1 Using the default constructor to create a clock display object.
	 * Notice what is displayed when using the default constructor. */	
	
		// Creating a ClockDisplay object "clock2" using the parameter constructor.
		
		ClockDisplay clock2 = new ClockDisplay(12,59,59);
		clock2.printTime();   //printing the time.
		clock2.timeTick();  //incrementing the minutes by 1 minutes.
		clock2.printTime();   //printing the time.
		clock2.timeTick();  //incrementing the minutes by 1 minutes.
		clock2.printTime();   //printing the time.
		clock2.timeTick();  //incrementing the minutes by 1 minutes.
		clock2.printTime();   //printing the time.
	
		ClockDisplay clock3 = new ClockDisplay(15,15,59);
		clock3.printTime();
		clock3.setTime(-5, 35, 50);
		clock3.printTime();
		clock3.setTime(11, 78, 50);
		clock3.printTime();
		clock3.setTime(11, 30, 50);
		clock3.printTime();
	}
	

}
