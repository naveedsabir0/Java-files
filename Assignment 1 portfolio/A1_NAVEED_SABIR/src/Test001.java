/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 */

public class Test001 {
	
	//STAGE 1 testing
	
	/**
	 * Prints the original copy
	 * Prints the memory address of the original appointment
	 * Performs shallow copy
	 * Modifies the copied appointment
	 * Prints the address of the copied appointment
	 * 
	 */
    public static void main(String[] args) {
        // Create the original appointment
        Date date = new Date(6, 10, 2023);
        Time time = new Time(14, 30);
        MeetingRoom room = new MeetingRoom("C2-01");
        Appointment originalAppointment = new Appointment("Alice Jones", "Demonstration of Assignment", date, time, room);

        
        //Print the original copy
        System.out.println("Original Appointment:");
        System.out.println(originalAppointment);
        
        // Print the memory address of the original appointment
        System.out.println("\nMemory Address of Original Appointment: " + System.identityHashCode(originalAppointment));
        System.out.println("\nMemory Address of Original Appointment NAME: " + System.identityHashCode(originalAppointment.getName()));
        System.out.println("\nMemory Address of Original Appointment PURPOSE: " + System.identityHashCode(originalAppointment.getPurpose()));
        System.out.println("\nMemory Address of Original Appointment DATE: " + System.identityHashCode(originalAppointment.getDate()));
        System.out.println("\nMemory Address of Original Appointment TIME: " + System.identityHashCode(originalAppointment.getTime()));
        System.out.println("\nMemory Address of Original Appointment ROOM: " + System.identityHashCode(originalAppointment.getRoom()));
        
        System.out.println("\n-----------------------------------------------------");
        
        
        // Perform shallow copy of the original appointment
        Appointment copiedAppointment = new Appointment(originalAppointment);

        /**
         * Extra feature: Modify the copy if needed.
         * NOT needed at the moment so in purposely in comments
         */
//        copiedAppointment.setName("Alice Jones");
//        copiedAppointment.getDate().setDay(6);

        // Print the shallow copied appointment
        System.out.println("\nCopied Appointment:");
        System.out.println(copiedAppointment);
        
        // Print the memory address of the copied appointment
        System.out.println("\nMemory Address of Copied Appointment: " + System.identityHashCode(copiedAppointment));
        System.out.println("\nMemory Address of Copied Appointment NAME: " + System.identityHashCode(copiedAppointment.getName()));
        System.out.println("\nMemory Address of Copied Appointment PURPOSE: " + System.identityHashCode(copiedAppointment.getPurpose()));
        System.out.println("\nMemory Address of Copied Appointment DATE: " + System.identityHashCode(copiedAppointment.getDate()));
        System.out.println("\nMemory Address of Copied Appointment TIME: " + System.identityHashCode(copiedAppointment.getTime()));
        System.out.println("\nMemory Address of Copied Appointment ROOM: " + System.identityHashCode(copiedAppointment.getRoom()));

        /**
         * If the additional feature was put to play, the code below would be useful to print the changes.
         *
         */
//        // Print the original appointment to show that it was affected
//        System.out.println("\nOriginal Appointment (After Modification of Copy):");
//        System.out.println(originalAppointment);
    }
}
