/**
 * 
 * @author Naveed Sabir
 *
 */
public class CopyTest002 {
	public static void main(String[] args)
	{
		// Create an initial Appointment object
		Date Date2 = new Date(3,6,2000);
		Time Time2 = new Time(5,20);
		Appointment Appointment2 = new Appointment ("Naveed Sabir", Date2, Time2);
		
		 // Create a deep copy of the original appointment
        Appointment deepCopyAppointment = Appointment2.clone();
        
     // Modify the attributes of the original appointment
        Date2.setDay(15);
        Time2.setHour(15);
        Appointment2.setName("Sami Mahad Smith");
        
     // Display the original and deep copy to confirm deep copying
        System.out.println("Original Appointment:");
        System.out.println(Appointment2.toString());

        System.out.println("\nDeep Copy of Appointment:");
        System.out.println(deepCopyAppointment.toString());
		
	}

}
