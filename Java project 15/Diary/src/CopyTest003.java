/**
 * @author Naveed Sabir
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CopyTest003 {
    public static void main(String[] args) {
        // Create a list of Appointment objects
        List<Appointment> appointments = new ArrayList<>();
        appointments.add(new Appointment("Sami", new Date(6, 2, 2024), new Time(15, 30)));
        appointments.add(new Appointment("Mahad", new Date(12, 1, 2024), new Time(14, 30)));
        appointments.add(new Appointment("Naveed", new Date(9, 4, 2024), new Time(13, 30)));

        // Sort the list of appointments (natural ordering)
        Collections.sort(appointments);

        // Display the sorted list of appointments
        for (Appointment appointment : appointments) {
            System.out.println(appointment.toString());
        }
    }
}
