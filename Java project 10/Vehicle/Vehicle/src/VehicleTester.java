package vehicle;

public class VehicleTester {
    public static void main(String[] args) {
        // Create a SecondHandVehicle object
        secondhandvehicle usedCar = new secondhandvehicle("XYZ456", "Honda", 2018, 18000.0, 2);

        // Get and print the vehicle information
        System.out.println("Registration Number: " + usedCar.getRegistrationNumber());
        System.out.println("Make: " + usedCar.getMake());
        System.out.println("Year of Manufacture: " + usedCar.getYearOfManufacture());
        System.out.println("Current Value: £" + usedCar.getCurrentValue());
        System.out.println("Number of Owners: " + usedCar.getNumberOfOwners());

        // Check if the vehicle has had more than one owner and print the result
        boolean hasMultipleOwners = usedCar.hasMultipleOwners();
        System.out.println("Has multiple owners: " + hasMultipleOwners);

        // Update the current value of the vehicle
        usedCar.updateCurrentValue(16000.0);
        System.out.println("Updated Current Value: £" + usedCar.getCurrentValue());

        // Calculate and print the age of the vehicle
        int currentYear = 2023;
        int age = usedCar.calculateAge(currentYear);
        System.out.println("Age of the Vehicle: " + age + " years");
    }
}

