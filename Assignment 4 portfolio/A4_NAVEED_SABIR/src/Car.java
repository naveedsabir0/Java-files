import java.io.Serializable;

/**
 * The {@code Car} class represents a serializable object that models a car.
 * It includes information about the make, model, colour, and tax expiration month of the car.
 * Implements the {@code Serializable} interface to support object serialization.
 */
public class Car implements Serializable {

    /**
     * The make of the car.
     */
    private final String make;

    /**
     * The model of the car.
     */
    private final String model;

    /**
     * The colour of the car.
     */
    private String colour;

    /**
     * The month when the tax for the car expires.
     */
    private Month taxExpiresEndMonth;

    /**
     * Constructs a new {@code Car} object with the specified make, model, and colour.
     *
     * @param make   The make of the car.
     * @param model  The model of the car.
     * @param colour The colour of the car.
     */
    public Car(String make, String model, String colour) {
        this.make = make;
        this.model = model;
        this.colour = colour;
    }

    /**
     * Gets the make of the car.
     *
     * @return The make of the car.
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets the model of the car.
     *
     * @return The model of the car.
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the colour of the car.
     *
     * @return The colour of the car.
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets the colour of the car.
     *
     * @param colour The new colour of the car.
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Gets the month when the tax for the car expires.
     *
     * @return The month when the tax for the car expires.
     */
    public Month getTaxExpiresEndMonth() {
        return taxExpiresEndMonth;
    }

    /**
     * Sets the month when the tax for the car expires.
     *
     * @param taxExpiresEndMonth The new month when the tax for the car expires.
     */
    public void setTaxExpiresEndMonth(Month taxExpiresEndMonth) {
        this.taxExpiresEndMonth = taxExpiresEndMonth;
    }

    /**
     * Returns a string representation of the {@code Car} object.
     *
     * @return A string representation of the {@code Car} object.
     */
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", taxExpiresEndMonth=" + taxExpiresEndMonth +
                '}';
    }
}
