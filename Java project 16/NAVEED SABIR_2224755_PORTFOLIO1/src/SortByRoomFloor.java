/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortByRoomFloor implements Comparator<Appointment> {
    public static void main(String[] args) {
        // Create an ArrayList of Appointment objects
        ArrayList<Appointment> appointmentList = new ArrayList<>();

        // Add Appointment objects to the ArrayList
        appointmentList.add(new Appointment("John Doe", "Meeting 1", new Date(2023, 10, 15), new Time(14, 30), new MeetingRoom("B2-03")));
        appointmentList.add(new Appointment("Jane Smith", "Meeting 2", new Date(2023, 10, 16), new Time(10, 15), new MeetingRoom("A1-01")));
        appointmentList.add(new Appointment("Bob Johnson", "Meeting 3", new Date(2023, 10, 17), new Time(16, 45), new MeetingRoom("C1-10")));
        appointmentList.add(new Appointment("Rick Ross", "Meeting 4", new Date(2023, 10, 19), new Time(17, 45), new MeetingRoom("D3-05")));
        appointmentList.add(new Appointment("Owen Walls", "Meeting 5", new Date(2023, 10, 21), new Time(13, 45), new MeetingRoom("E3-08")));
        appointmentList.add(new Appointment("Nick Jones", "Meeting 6", new Date(2023, 10, 26), new Time(14, 45), new MeetingRoom("E4-08")));
        appointmentList.add(new Appointment("Jack Male", "Meeting 7", new Date(2023, 10, 27), new Time(14, 45), new MeetingRoom("E4-09")));
        appointmentList.add(new Appointment("Tracey Will", "Meeting 8", new Date(2023, 10, 28), new Time(14, 45), new MeetingRoom("B2-04")));
        appointmentList.add(new Appointment("Trump Castle", "Meeting 9", new Date(2023, 10, 29), new Time(14, 45), new MeetingRoom("E4-08")));
        appointmentList.add(new Appointment("Daniel Cormier", "Meeting 10", new Date(2023, 10, 30), new Time(14, 45), new MeetingRoom("E4-03")));
        
        // Create an instance of the Comparator
        SortByRoomFloor comparator = new SortByRoomFloor();

        // Sort the ArrayList based on room floor
        Collections.sort(appointmentList, comparator);

        // Print the sorted list
        for (Appointment appointment : appointmentList) {
            System.out.println(appointment);
            System.out.println("\n");
        }
    }
    /**
     * substring(beginIndex, endIndex) 
     * method extracts a substring from the original 
     * string starting at beginIndex and ending at endIndex
     * 
     * The code uses the substring method to extract a specific portion of the room names, starting at index 1 and ending at index 2.
     * The substring(1, 2) method takes a portion of the room name between these indices. In Java, indexing starts at 0, so
     * substring(1, 2) extracts the character at index 1, which is the second character in the room name.
     */
    @Override
    public int compare(Appointment appointment1, Appointment appointment2) {
        // Implement your comparison logic based on room floor
        // For example, assuming room format is "Xn-XX" where X is a letter and n is a number:
        String room1Floor = appointment1.getRoom().getRoom().substring(1, 2);
        String room2Floor = appointment2.getRoom().getRoom().substring(1, 2);
        return room1Floor.compareTo(room2Floor);
    }
}
