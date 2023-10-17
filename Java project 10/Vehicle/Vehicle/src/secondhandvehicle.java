package vehicle;

public class secondhandvehicle extends vehicle {
    private int numberOfOwners;

    // Constructor to initialize the attributes of SecondHandVehicle
    public secondhandvehicle(String registrationNumber, String make, int yearOfManufacture, double currentValue, int numberOfOwners) {
        super(registrationNumber, make, yearOfManufacture, currentValue);
        this.numberOfOwners = numberOfOwners;
    }

    // Getter method for numberOfOwners
    public int getNumberOfOwners() {
        return numberOfOwners;
    }

    // Method to check if the vehicle has had more than one previous owner
    public boolean hasMultipleOwners() {
        return numberOfOwners > 1;
    }

    public static void main(String[] args) {
        // Create a SecondHandVehicle object
        secondhandvehicle usedCar = new secondhandvehicle("XYZ456", "Honda", 2018, 18000.0, 2);

        // Get and print the vehicle information
        System.out.println("Registration Number: " + usedCar.getRegistrationNumber());
        System.out.println("Make: " + usedCar.getMake());
        System.out.println("Year of Manufacture: " + usedCar.getYearOfManufacture());
        System.out.println("Current Value: $" + usedCar.getCurrentValue());
        System.out.println("Number of Owners: " + usedCar.getNumberOfOwners());

        // Check if the vehicle has had more than one owner and print the result
        boolean hasMultipleOwners = usedCar.hasMultipleOwners();
        System.out.println("Has multiple owners: " + hasMultipleOwners);
    }
}

