import java.io.Serializable;
import java.util.Objects;

/**
 * The {@code RegNo} class represents a vehicle registration number. It implements the {@code Comparable} and {@code Serializable} interfaces.
 * The comparison is based on the lexicographic order of registration numbers.
 */
public class RegNo implements Comparable<RegNo>, Serializable {

    /**
     * The registration number of the vehicle.
     */
    private final String regNo;

    /**
     * Constructs a new {@code RegNo} object with the specified registration number.
     *
     * @param regNo The registration number of the vehicle.
     */
    public RegNo(String regNo) {
        this.regNo = regNo;
    }

    /**
     * Gets the registration number of the vehicle.
     *
     * @return The registration number.
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * Compares this registration number with another registration number for order.
     * The comparison is based on the lexicographic order of registration numbers.
     *
     * @param o The registration number to be compared.
     * @return A negative integer, zero, or a positive integer as this registration number is less than, equal to, or greater than the specified registration number.
     */
    @Override
    public int compareTo(RegNo o) {
        return this.regNo.compareTo(o.regNo);
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param o The reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegNo regNo1 = (RegNo) o;
        return regNo.equals(regNo1.regNo);
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return A hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(regNo);
    }

    /**
     * Returns a string representation of the registration number.
     *
     * @return A string representation of the object, in the form "RegNo{regNo='ABC123'}".
     */
    @Override
    public String toString() {
        return "RegNo{" +
                "regNo='" + regNo + '\'' +
                '}';
    }
}
