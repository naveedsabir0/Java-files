/**
 * 
 * @author Naveed Sabir
 *
 */
public class Appointment implements Cloneable, Comparable<Appointment> {

	private String name;
	private Date date;
	private Time time;
	
/**
 * Constructor with default values
 */
	public Appointment() {
        this.name = "Naveed";
        this.date = new Date(6, 3, 2000); 
        this.time = new Time(4, 20); 
    }
	
	/**
	 * 
	 * @param name
	 * @param date
	 * @param time
	 */
	public Appointment(String name, Date date, Time time)
	{
		this.name = name;
		this.date = date;
		this.time = time;
	}
	
	/**
	 * 
	 * @param appointment2
	 */
	Appointment(Appointment appointment2)
	{
		this.name = appointment2.name;
		this.date = appointment2.date;
		this.time = appointment2.time;
	}
	
	
	/**
	 * 
	 * @param name
	 */
	 public void setName(String name) {
	        this.name = name;
	    }

	 /**
	  * 
	  * @param date
	  */
	    public void setDate(Date date) {
	        this.date = date;
	    }

	    /**
	     * 
	     * @param time
	     */
	    public void setTime(Time time) {
	        this.time = time;
	    }
	    
	    /**
	     * 
	     * @return name
	     */
	    public String getName() {
	        return name;
	    }

	    /**
	     * 
	     * @return date
	     */
	    public Date getDate() {
	        return date;
	    }

	    /**
	     * 
	     * @return time
	     */
	    public Time getTime() {
	        return time;
	    }
	    
	    
	    /**
	     * To get string value
	     */
	    @Override
	    public String toString() {
	        return String.format("Name: %s\nDate: %s\nTime: %s", name, date, time);
	    }
	    
	    /**
	     * Clone() after using "implements Cloneable" for deep copying
	     */
	    @Override
	    public Appointment clone() {
	    	try {
	            return (Appointment) super.clone();
	        } catch (CloneNotSupportedException e) {
	            throw new AssertionError("Clone not possible for Appointment");
	        }
	    }
	    
	    /**
	     * Compare hour to later sort it
	     */
	    @Override
	    public int compareTo(Appointment other) {
	        int dateComparison = this.date.compareTo(other.date);
	        if (dateComparison == 0) {
	            return this.time.compareTo(other.time);
	        }
	        return dateComparison;
	    }
}
