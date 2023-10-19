/**
 * 
 * @author Naveed Sabir
 *
 */
public class CopyTest001 {
    public static void main(String[] args) {
        // Create an initial Appointment object
        Date Date1 = new Date(3, 6, 2000);
        Time Time1 = new Time(4, 00);
        Appointment Appointment1 = new Appointment("Mahad Sami", Date1, Time1);

        // Create a shallow copy of the original appointment
        Appointment shallowCopyAppointment = new Appointment(Appointment1);

        // Modify the attributes of the original appointment
        Date1.setDay(6);
        Time1.setHour(3);
        Appointment1.setName("Naveed Sabir");

        // Display the original and shallow copy to observe the effect of shallow copying
        System.out.println("Original Appointment:");
        System.out.println(Appointment1.toString());

        System.out.println("\nShallow Copy of Appointment:");
        System.out.println(shallowCopyAppointment.toString());
    }
}
