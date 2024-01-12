/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Test003 {
    public static void main(String[] args) {
        // Create an ArrayList of Appointment objects
        ArrayList<Appointment> appointmentList = new ArrayList<Appointment>(); //type safe using the parameterised type declaration

        // Create and add Appointment objects to the ArrayList
        appointmentList.add(new Appointment("John Doe", "Meeting 1", new Date(2023, 10, 15), new Time(14, 30), new MeetingRoom("B2-03")));
        appointmentList.add(new Appointment("Jane Smith", "Meeting 2", new Date(2023, 10, 19), new Time(10, 15), new MeetingRoom("A1-01")));
        appointmentList.add(new Appointment("Bob Johnson", "Meeting 3", new Date(2023, 10, 19), new Time(16, 45), new MeetingRoom("C1-10")));
        appointmentList.add(new Appointment("Rick Ross", "Meeting 4", new Date(2023, 10,17), new Time(17, 45), new MeetingRoom("D3-05")));
        appointmentList.add(new Appointment("Owen Walls", "Meeting 5", new Date(2023, 10, 26), new Time(13, 45), new MeetingRoom("E3-08")));
        appointmentList.add(new Appointment("Nick Jones", "Meeting 6", new Date(2023, 10, 21), new Time(11, 45), new MeetingRoom("E4-08")));
        appointmentList.add(new Appointment("Jack Male", "Meeting 7", new Date(2023, 10, 28), new Time(15, 45), new MeetingRoom("E4-09")));
        appointmentList.add(new Appointment("Tracey Will", "Meeting 8", new Date(2023, 10, 27), new Time(19, 45), new MeetingRoom("B2-04")));
        appointmentList.add(new Appointment("Trump Castle", "Meeting 9", new Date(2023, 10, 30), new Time(20, 45), new MeetingRoom("E4-08")));
        appointmentList.add(new Appointment("Daniel Cormier", "Meeting 10", new Date(2023, 10, 29), new Time(21, 45), new MeetingRoom("E4-03")));
        
        // Demonstrate the appointments in the ArrayList
        System.out.println("Appointments in ArrayList:");
        for (Appointment Arraylistappointment : appointmentList) {
            System.out.println(Arraylistappointment);
            System.out.println("\n");
        }
        
        // Create an array of Appointment objects with the same data and order as the ArrayList
        Appointment[] appointmentArray = appointmentList.toArray(new Appointment[appointmentList.size()]);
        //type safe using the parameterised type declaration
        
        // Create an unsorted Appointment object with the same attributes as an object in the ArrayList
        Appointment searchAppointment = new Appointment("Daniel Cormier", "Meeting 10", new Date(2023, 10, 29), new Time(21, 45), new MeetingRoom("E4-03"));
        
        // Create a clone of searchAppointment with the same attributes
        Appointment searchAppointmentClone = searchAppointment.clone();
        
        // Demonstrate the appointments in the array
        System.out.println("\n");
        System.out.println("\nAppointments in Array:");
        for (Appointment Arrayappointment : appointmentArray)
        {
            System.out.println(Arrayappointment);
        
        // Demonstrate the cloned searchAppointmentClone
        System.out.println("\nCloned Search Appointment (searchAppointmentClone):");
        System.out.println(searchAppointmentClone);
        System.out.println("\n");
        }
        
        // Demonstrate the unsorted searchAppointment
        System.out.println("\nUnsorted Search Appointment:");
        System.out.println(searchAppointment);
        
        // Sort the ArrayList of appointments
        Collections.sort(appointmentList);
        
        
        // Sort the array of appointments
        Arrays.sort(appointmentArray);

        // Demonstrate the appointments in the ArrayList using a for-each loop
        System.out.println("\n");
        System.out.println("Sorted Appointments in ArrayList:");
        for (Appointment appointment : appointmentList) {
            System.out.println(appointment);
            System.out.println("\n");
        }

        // Demonstrate the appointments in the array using a for-each loop
        System.out.println("\n");
        System.out.println("\nSorted Appointments in Array:");
        for (Appointment appointment : appointmentArray) {
            System.out.println(appointment);
            System.out.println("\n");
        }

        // Search for searchAppointment in the ArrayList using binary search
        int foundIndexInArrayList = Collections.binarySearch(appointmentList, searchAppointment);

        // Search for searchAppointmentClone in the ArrayList using binary search
        int foundCloneIndexInArrayList = Collections.binarySearch(appointmentList, searchAppointmentClone);

        // Search for searchAppointment in the array using binary search
        int foundIndexInArray = Arrays.binarySearch(appointmentArray, searchAppointment);

        // Search for searchAppointmentClone in the array using binary search
        int foundCloneIndexInArray = Arrays.binarySearch(appointmentArray, searchAppointmentClone);
        
        // Demonstrate the results
        System.out.println("Found searchAppointment in ArrayList at index: " + foundIndexInArrayList);
        System.out.println("Found searchAppointmentClone in ArrayList at index: " + foundCloneIndexInArrayList);
        System.out.println("Found searchAppointment in Array at index: " + foundIndexInArray);
        System.out.println("Found searchAppointmentClone in Array at index: " + foundCloneIndexInArray);
    }
        
    
}


