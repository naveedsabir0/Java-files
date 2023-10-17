package vehicle;

public class vehicle {
    private String registrationNumber;
    private String make;
    private int yearOfManufacture;
    private double currentValue;

    // Constructor to initialize registrationNumber, make, yearOfManufacture, and currentValue
    public vehicle(String registrationNumber, String make, int yearOfManufacture, double currentValue) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.yearOfManufacture = yearOfManufacture;
        this.currentValue = currentValue;
    }

    // Getter methods for all data items
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    // Method to calculate the age of the vehicle
    public int calculateAge(int currentYear) {
        return currentYear - yearOfManufacture;
    }

    // Method to update the current value of the vehicle
    public void updateCurrentValue(double newValue) {
        this.currentValue = newValue;
    }

    public static void main(String[] args) {
        // Create a Vehicle object
        vehicle myCar = new vehicle("ABC123", "Toyota", 2020, 25000.0);

        // Get and print the vehicle information
        System.out.println("Registration Number: " + myCar.getRegistrationNumber());
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Year of Manufacture: " + myCar.getYearOfManufacture());
        System.out.println("Current Value: £" + myCar.getCurrentValue());

        // Calculate and print the age of the vehicle
        int currentYear = 2023;
        int age = myCar.calculateAge(currentYear);
        System.out.println("Age of the Vehicle: " + age + " years");

        // Update the current value of the vehicle
        myCar.updateCurrentValue(22000.0);
        System.out.println("Updated Current Value: £" + myCar.getCurrentValue());
    }
}

