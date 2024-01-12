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
import java.util.Comparator;

public class Test004 {
    public static void main(String[] args) {
        // Create an ArrayList of Appointment objects
        ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

        // Create and add Appointment objects to the ArrayList
        appointmentList.add(new Appointment("John Doe", "Meeting 1", new Date(2023, 10, 15), new Time(14, 30), new MeetingRoom("B2-03")));
        appointmentList.add(new Appointment("Jane Smith", "Meeting 2", new Date(2023, 10, 19), new Time(10, 15), new MeetingRoom("A1-01")));
        appointmentList.add(new Appointment("Bob Johnson", "Meeting 3", new Date(2023, 10, 16), new Time(16, 45), new MeetingRoom("C1-10")));
        appointmentList.add(new Appointment("Rick Ross", "Meeting 4", new Date(2023, 10,17), new Time(17, 45), new MeetingRoom("D3-05")));
        appointmentList.add(new Appointment("Owen Walls", "Meeting 5", new Date(2023, 10, 26), new Time(13, 45), new MeetingRoom("E3-08")));
        appointmentList.add(new Appointment("Nick Jones", "Meeting 6", new Date(2023, 10, 21), new Time(11, 45), new MeetingRoom("E4-08")));
        appointmentList.add(new Appointment("Jack Male", "Meeting 7", new Date(2023, 10, 28), new Time(15, 45), new MeetingRoom("E4-09")));
        appointmentList.add(new Appointment("Tracey Will", "Meeting 8", new Date(2023, 10, 27), new Time(19, 45), new MeetingRoom("B2-04")));
        appointmentList.add(new Appointment("Trump Castle", "Meeting 9", new Date(2023, 10, 30), new Time(20, 45), new MeetingRoom("E4-08")));
        appointmentList.add(new Appointment("Daniel Cormier", "Meeting 10", new Date(2023, 10, 29), new Time(21, 45), new MeetingRoom("E4-03")));

        
        // Create an array of Appointment objects with the same data and order as the ArrayList
        Appointment[] appointmentArray = appointmentList.toArray(new Appointment[appointmentList.size()]);

        /**
         * @return floorComparison
         * @return comparison between appointment1 and appointment 2
         * 
         * 
         * the roomComparator is used to sort a collection of Appointment objects
         * first by their floor number (numerically),
         * and if the floor numbers are the same,
         * then by their room names (alphabetically).
         * This custom sorting order is applied when using methods like
         * Collections.sort or Arrays.sort to sort
         * a list or array of Appointment 
         * objects based on the provided Comparator.
         */
        // Create a custom Comparator to sort based on room floor and then by room name
        Comparator<Appointment> roomComparator = new Comparator<Appointment>() {
            @Override
            public int compare(Appointment appointment1, Appointment appointment2) {
                // Extract floor information from the room names
                String floor1 = appointment1.getRoom().getRoom().split("-")[0];
                String floor2 = appointment2.getRoom().getRoom().split("-")[0];

                // Compare floors numerically
                int floorComparison = Integer.compare(Integer.parseInt(floor1.substring(1)), Integer.parseInt(floor2.substring(1)));

                if (floorComparison != 0) {
                    // If floors are different, return the comparison result
                    return floorComparison;
                } else {
                    // If floors are the same, compare room names alphabetically
                    return appointment1.getRoom().getRoom().compareTo(appointment2.getRoom().getRoom());
                }
            }
        };

        // Sort the ArrayList based on room floor and name
        Collections.sort(appointmentList, roomComparator);

        // Sort the array based on room floor and name
        Arrays.sort(appointmentArray, roomComparator);
        
        // Define the objects to search for
        Appointment searchAppointment = new Appointment("Jane Smith", "Meeting 2", new Date(2023, 10, 19), new Time(10, 15), new MeetingRoom("B2-03"));
        Appointment searchAppointmentClone = new Appointment("Jane Smith", "Meeting 2", new Date(2023, 10, 19), new Time(10, 15), new MeetingRoom("B2-03"));
        
        
        // Search for searchAppointment in the ArrayList using binary search
        int foundIndexInArrayList = Collections.binarySearch(appointmentList, searchAppointment, roomComparator);

        // Search for searchAppointmentClone in the ArrayList using binary search
        int foundCloneIndexInArrayList = Collections.binarySearch(appointmentList, searchAppointmentClone, roomComparator);

        // Search for searchAppointment in the array using binary search
        int foundIndexInArray = Arrays.binarySearch(appointmentArray, searchAppointment, roomComparator);

        // Search for searchAppointmentClone in the array using binary search
        int foundCloneIndexInArray = Arrays.binarySearch(appointmentArray, searchAppointmentClone, roomComparator);

        // Print the sorted list from the ArrayList
        System.out.println("Sorted Appointments in ArrayList:");
        for (Appointment appointment : appointmentList) {
            System.out.println(appointment);
            System.out.println("\n");
        }

        // Print the sorted array
        System.out.println("\nSorted Appointments in Array:");
        for (Appointment appointment : appointmentArray) {
            System.out.println(appointment);
            System.out.println("\n");
        }
    
/**
 *In the following IF statement the code looks for the index in both,
 *arraylist and array and once the given appointment is found it prints out
 *the index number the appointment is saved in. 
 */
    // Check if the objects were found
    if (foundIndexInArrayList >= 0) {
        System.out.println("searchAppointment found in the ArrayList at index " + foundIndexInArrayList);
    } else {
        System.out.println("searchAppointment not found in the ArrayList.");
    }

    if (foundCloneIndexInArrayList >= 0) {
        System.out.println("searchAppointmentClone found in the ArrayList at index " + foundCloneIndexInArrayList);
    } else {
        System.out.println("searchAppointmentClone not found in the ArrayList.");
    }

    if (foundIndexInArray >= 0) {
        System.out.println("searchAppointment found in the array at index " + foundIndexInArray);
    } else {
        System.out.println("searchAppointment not found in the array.");
    }

    if (foundCloneIndexInArray >= 0) {
        System.out.println("searchAppointmentClone found in the array at index " + foundCloneIndexInArray);
    } else {
        System.out.println("searchAppointmentClone not found in the array.");
    }
}

}
