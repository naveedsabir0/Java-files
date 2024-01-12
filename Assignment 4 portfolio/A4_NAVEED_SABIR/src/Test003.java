import java.util.Map;

/**
 * The {@code Test003} class serves as a test class to demonstrate the functionality of the DVLA (Driver and Vehicle Licensing Agency) system.
 * It creates instances of Address, Keeper, Car, and RegNo, adds them to a DVLA object, and displays registration numbers along with corresponding keepers.
 */
public class Test003 {

    /**
     * The main method for testing the DVLA functionality and displaying registration numbers along with keepers.
     *
     * @param args The command-line arguments (not used in this context).
     */
    public static void main(String[] args) {
        // Creating DVLA instance and adding cars as in Test001
        DVLA dvla = new DVLA();

        Address address1 = new Address("123 Main St", "Cityville", "ABC123");
        Address address2 = new Address("456 Oak St", "Townsville", "XYZ789");
        Address address3 = new Address("789 Pine St", "Villageville", "123ABC");
        Address address4 = new Address("111 Elm St", "Villageton", "DEF456");
        Address address5 = new Address("222 Pine St", "Cityton", "GHI789");
        Address address6 = new Address("34 Josiah Wedgwood", "Stoke-On-Trent", "NAV789");

        Keeper keeper1 = new Keeper("John", "Doe", address1);
        Keeper keeper2 = new Keeper("Jane", "Smith", address2);
        Keeper keeper3 = new Keeper("Bob", "Johnson", address3);
        Keeper keeper4 = new Keeper("Alice", "Jones", address4);
        Keeper keeper5 = new Keeper("Charlie", "Brown", address5);
        Keeper keeper6 = new Keeper("Naveed", "Sabir", address6);

     // Creating cars with tax expiration months
        Car car1 = new Car("Toyota", "Camry", "Blue");
        car1.setTaxExpiresEndMonth(Month.JANUARY);

        Car car2 = new Car("Honda", "Civic", "Red");
        car2.setTaxExpiresEndMonth(Month.FEBRUARY);

        Car car3 = new Car("Ford", "Focus", "Silver");
        car3.setTaxExpiresEndMonth(Month.MARCH);

        Car car4 = new Car("Chevrolet", "Malibu", "Black");
        car4.setTaxExpiresEndMonth(Month.APRIL);

        Car car5 = new Car("Nissan", "Altima", "White");
        car5.setTaxExpiresEndMonth(Month.MAY);
        
        Car car6 = new Car("Buggati", "Veiron", "Black Leopard");
        car6.setTaxExpiresEndMonth(Month.FEBRUARY);

        // Set tax expiration months for testing
        car1.setTaxExpiresEndMonth(Month.JANUARY);
        car2.setTaxExpiresEndMonth(Month.FEBRUARY);
        car3.setTaxExpiresEndMonth(Month.MARCH);
        car4.setTaxExpiresEndMonth(Month.APRIL);
        car5.setTaxExpiresEndMonth(Month.MAY);
        car6.setTaxExpiresEndMonth(Month.FEBRUARY);

        RegNo regNo1 = new RegNo("ABC123");
        RegNo regNo2 = new RegNo("XYZ789");
        RegNo regNo3 = new RegNo("123ABC");
        RegNo regNo4 = new RegNo("DEF456");
        RegNo regNo5 = new RegNo("GHI789");
        RegNo regNo6 = new RegNo("NAV789");

        dvla.addCarRegistration(regNo1, car1);
        dvla.addKeeperInfo(regNo1, keeper1);

        dvla.addCarRegistration(regNo2, car2);
        dvla.addKeeperInfo(regNo2, keeper2);

        dvla.addCarRegistration(regNo3, car3);
        dvla.addKeeperInfo(regNo3, keeper3);

        dvla.addCarRegistration(regNo4, car4);
        dvla.addKeeperInfo(regNo4, keeper4);

        dvla.addCarRegistration(regNo5, car5);
        dvla.addKeeperInfo(regNo5, keeper5);
        
        dvla.addCarRegistration(regNo6, car6);
        dvla.addKeeperInfo(regNo6, keeper6);

        // List all registration numbers and keepers
        System.out.println("Registration Numbers and Keepers in DVLA Database:");
        Map<RegNo, Keeper> registrationToKeeperMap = dvla.getRegistrationToKeeperMap();
        for (Map.Entry<RegNo, Keeper> entry : registrationToKeeperMap.entrySet()) {
            RegNo regNo = entry.getKey();
            Keeper keeper = entry.getValue();
            System.out.println("Registration Number: " + regNo.getRegNo());
            System.out.println("Keeper Details: " + keeper.toString());
            System.out.println();
        }
    }
}
