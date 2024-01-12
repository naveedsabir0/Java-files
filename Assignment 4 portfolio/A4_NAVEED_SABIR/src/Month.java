/**
 * The {@code Month} enum represents the months of the year with corresponding numerical values.
 * Each month is defined as a constant with its associated integer value.
 */
public enum Month {

    /**
     * January with a numerical value of 1.
     */
    JANUARY(1),

    /**
     * February with a numerical value of 2.
     */
    FEBRUARY(2),

    /**
     * March with a numerical value of 3.
     */
    MARCH(3),

    /**
     * April with a numerical value of 4.
     */
    APRIL(4),

    /**
     * May with a numerical value of 5.
     */
    MAY(5),

    /**
     * June with a numerical value of 6.
     */
    JUNE(6),

    /**
     * July with a numerical value of 7.
     */
    JULY(7),

    /**
     * August with a numerical value of 8.
     */
    AUGUST(8),

    /**
     * September with a numerical value of 9.
     */
    SEPTEMBER(9),

    /**
     * October with a numerical value of 10.
     */
    OCTOBER(10),

    /**
     * November with a numerical value of 11.
     */
    NOVEMBER(11),

    /**
     * December with a numerical value of 12.
     */
    DECEMBER(12);

    /**
     * The numerical value associated with the month.
     */
    private final int monthValue;

    /**
     * Constructs a {@code Month} enum constant with the specified numerical value.
     *
     * @param monthValue The numerical value associated with the month.
     */
    Month(int monthValue) {
        this.monthValue = monthValue;
    }

    /**
     * Gets the numerical value associated with the month.
     *
     * @return The numerical value of the month.
     */
    public int getMonthValue() {
        return monthValue;
    }
}
