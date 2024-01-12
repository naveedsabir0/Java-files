/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 */

public class Date implements Cloneable, Comparable<Date> {
    private int day;
    private int month;
    private int year;

    /**
     * 
     * @param day
     * @param month
     * @param year
     * parameterised constructor
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    /**
     * Default constructor initialises to January 1, 2000
     */
    public Date() {
        this.day = 6;
        this.month = 3;
        this.year = 2023;
    }

    /**
     * 
     * @param other
     * Copy constructor for shallow copying
     */
    public Date(Date other) {
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
    }
    
    
    /**
     * setter methods
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Setter Method
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Setter method
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter method
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * Getter method
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Getter method
     * @return year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * @return Date
     */
    @Override
    public Date clone() {
        try {
            return (Date) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen.
        }
    }
    
    /**
     * @return String.format("%02d/%02d/%04d", month, day, year)
     * The value stored on that specific memory space
     */
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
    
    /**
     * Construct a Long value representing the date (YYYYMMDD)
     * @return Long.compare(thisValue, otherValue)
     */
    @Override
    public int compareTo(Date other) {
        long thisValue = year * 10000L + month * 100L + day;
        long otherValue = other.year * 10000L + other.month * 100L + other.day;
        return Long.compare(thisValue, otherValue);
    }
}