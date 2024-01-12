/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 */


public class Time implements Cloneable, Comparable<Time> {
    private int hour;
    private int minute;

    /**
     * Constructor
     * @param hour
     * @param minute
     */
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * Default constructor initialises to midnight
     */
    public Time() {
        this.hour = 0;
        this.minute = 0;
    }

    /**
     * Copy constructor for shallow copying
     * @param other
     */
    public Time(Time other) {
        this.hour = other.hour;
        this.minute = other.minute;
    }
    
    /**
     * Setter method
     * @param hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * Setter method
     * @param minute
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * Getter hour
     * @return hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * Getter method
     * @return minute
     */
    public int getMinute() {
        return minute;
    }
    
    
    /**
     * @return Time
     */
    @Override
    public Time clone() {
        try {
            return (Time) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen.
        }
    }
    
    /**
     * Construct a Long value representing the time (HHMM)
     *
     * @return Long.compare(thisValue, otherValue)
     */
    @Override
    public int compareTo(Time other) {
        // Construct a Long value representing the time (HHMM)
        long thisValue = hour * 100L + minute;
        long otherValue = other.hour * 100L + other.minute;
        return Long.compare(thisValue, otherValue);
    }
    
    /**
     * @return String.format("%02d:%02d", hour, minute)
     * Returns the value saved in memory
     */
    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}