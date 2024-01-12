import java.io.Serializable;

/**
 * The {@code Address} class represents a serializable object that models an address.
 * It includes information about the street, town, and postcode of the address.
 * Implements the {@code Serializable} interface to support object serialization.
 */
public class Address implements Serializable {

    /**
     * The street of the address.
     */
    private String street;

    /**
     * The town of the address.
     */
    private String town;

    /**
     * The postcode of the address.
     */
    private String postcode;

    /**
     * Constructs a new {@code Address} object with the specified street, town, and postcode.
     *
     * @param street   The street of the address.
     * @param town     The town of the address.
     * @param postcode The postcode of the address.
     */
    public Address(String street, String town, String postcode) {
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }

    /**
     * Gets the street of the address.
     *
     * @return The street of the address.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street of the address.
     *
     * @param street The new street of the address.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the town of the address.
     *
     * @return The town of the address.
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the town of the address.
     *
     * @param town The new town of the address.
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * Gets the postcode of the address.
     *
     * @return The postcode of the address.
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the postcode of the address.
     *
     * @param postcode The new postcode of the address.
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * Returns a string representation of the {@code Address} object.
     *
     * @return A string representation of the {@code Address} object.
     */
    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
