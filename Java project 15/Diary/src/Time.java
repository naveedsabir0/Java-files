/**
 * 
 * @author Naveed Sabir
 *
 */


public class Time implements Cloneable, Comparable<Time> {
	
	private int hour;
	private int minute;

	/**
	 * Constructor with default values
	 */
	Time()
	{
		this.hour = 4;
		this.minute = 20;
	}
	
	/**
	 * Parameterised constructor
	 * @param hour
	 * @param minute
	 */
	Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	/**
	 * constructor for shallow copying
	 * @param time2
	 */
	Time(Time time2)
	{
		this.hour = time2.hour;
		this.minute = time2.minute;
	}
	
	/**
	 * setter & getter methods
	 * @param hour
	 */
	 public void setHour(int hour) {
	     this.hour = hour;
	 }

	 /**
	  * 
	  * @param minute
	  * Minutes from time
	  */
	 public void setMinute(int minute) {
	   this.minute = minute;
	 }
	 
	 /**
	  * 
	  * @return hour
	  * hour from time
	  */
	 public int getHour() {
	        return hour;
	    }

	 /**
	  * 
	  * @return minute
	  */
	    public int getMinute() {
	        return minute;
	    }
	    
	    /**
	     * Show value of string
	     */
	    @Override
	    public String toString() {
	        return String.format("%02d:%02d", hour, minute);
	    }
	    
	    /**
	     * Clone() after using "implements Cloneable" for deep copying
	     */
	    @Override
	    public Time clone() {
	        try {
	            return (Time) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new AssertionError("Clone not possible for Time");
	        }
	    }
	    
	    /**
	     * Compare hour to later sort it
	     */
	    @Override
	    public int compareTo(Time other) {
	        if (this.hour == other.hour) {
	            return Integer.compare(this.minute, other.minute);
	        }
	        return Integer.compare(this.hour, other.hour);
	    }
	    
}
