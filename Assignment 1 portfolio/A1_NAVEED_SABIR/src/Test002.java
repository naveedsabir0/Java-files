/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 * 
 */

public class Test002 {
	
	//STAGE 2 TESTING
	
	
    public static void main(String[] args) {
        // Create the original appointment
        Date date = new Date(6, 3, 2023);
        Time time = new Time(12, 30);
        MeetingRoom room = new MeetingRoom("C1-01");
        Appointment originalAppointment = new Appointment("Tim Windridge", "Meeting with carrier's advisor", date, time, room);

        /**
         * Print the original and cloned appointments to verify deep copying
         */
        System.out.println("\nOriginal Appointment (Original appointment):");
        System.out.println(originalAppointment); 
        
        /**
         * Print the memory address of the original appointment
         * and all the attributes of the appointment showing where each one
         * of them is stored
         */
        System.out.println("\nMemory Address of Original Appointment: " + System.identityHashCode(originalAppointment));
        System.out.println("\nMemory Address of Original Appointment toString: " + System.identityHashCode(originalAppointment.toString()));
        System.out.println("\nMemory Address of Original Appointment NAME: " + System.identityHashCode(originalAppointment.getName()));
        System.out.println("\nMemory Address of Original Appointment PURPOSE: " + System.identityHashCode(originalAppointment.getPurpose()));
        System.out.println("\nMemory Address of Original Appointment DATE: " + System.identityHashCode(originalAppointment.getDate()));
        System.out.println("\nMemory Address of Original Appointment TIME: " + System.identityHashCode(originalAppointment.getTime()));
        System.out.println("\nMemory Address of Original Appointment ROOM: " + System.identityHashCode(originalAppointment.getRoom()));
        System.out.println("\n-----------------------------------------------------");
        
        /**
         * Clone the original appointment
         */
        Appointment clonedAppointment = originalAppointment.clone();
        
        /**
         * Extra feature: Modify the copy if needed.
         * NOT needed at the moment so purposely in comments
         */
//        clonedAppointment.setName("Tim Windridge");
//        clonedAppointment.getDate().setDay(6);


        System.out.println("\nCloned Appointment (After deep copying):");
        System.out.println(clonedAppointment);
        
        
        /**
         * If the additional feature was put to play, the code below would be useful to print the changes.
         *
         */
//      // Print the original appointment to show that it was affected
//      System.out.println("\nOriginal Appointment (After Modification of Copy):");
//      System.out.println(originalAppointment);
        
        /**
         * Print the memory address of the cloned appointment
         */
        System.out.println("Memory Address of Cloned Appointment: " + System.identityHashCode(clonedAppointment));
        System.out.println("\nMemory Address of Cloned Appointment toString: " + System.identityHashCode(clonedAppointment.toString()));
        System.out.println("\nMemory Address of Cloned Appointment NAME: " + System.identityHashCode(clonedAppointment.getName()));
        System.out.println("\nMemory Address of Cloned Appointment PURPOSE: " + System.identityHashCode(clonedAppointment.getPurpose()));
        System.out.println("\nMemory Address of Cloned Appointment DATE: " + System.identityHashCode(clonedAppointment.getDate()));
        System.out.println("\nMemory Address of Cloned Appointment TIME: " + System.identityHashCode(clonedAppointment.getTime()));
        System.out.println("\nMemory Address of Cloned Appointment ROOM: " + System.identityHashCode(clonedAppointment.getRoom()));
    }
}

