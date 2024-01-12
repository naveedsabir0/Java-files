import java.io.Serializable;

/**
 * The {@code Keeper} class represents a serializable object that models a keeper.
 * It includes information about the forename, surname, and address of the keeper.
 * Implements the {@code Serializable} interface to support object serialization.
 */
public class Keeper implements Serializable {

    /**
     * The forename of the keeper.
     */
    private String forename;

    /**
     * The surname of the keeper.
     */
    private String surname;

    /**
     * The address of the keeper.
     */
    private Address address;

    /**
     * Constructs a new {@code Keeper} object with the specified forename, surname, and address.
     *
     * @param forename The forename of the keeper.
     * @param surname  The surname of the keeper.
     * @param address  The address of the keeper.
     */
    public Keeper(String forename, String surname, Address address) {
        this.forename = forename;
        this.surname = surname;
        this.address = address;
    }

    /**
     * Gets the forename of the keeper.
     *
     * @return The forename of the keeper.
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the forename of the keeper.
     *
     * @param forename The new forename of the keeper.
     */
    public void setForename(String forename) {
        this.forename = forename;
    }

    /**
     * Gets the surname of the keeper.
     *
     * @return The surname of the keeper.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname of the keeper.
     *
     * @param surname The new surname of the keeper.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the address of the keeper.
     *
     * @return The address of the keeper.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address of the keeper.
     *
     * @param address The new address of the keeper.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the {@code Keeper} object.
     *
     * @return A string representation of the {@code Keeper} object.
     */
    @Override
    public String toString() {
        return "Keeper{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                '}';
    }
}
