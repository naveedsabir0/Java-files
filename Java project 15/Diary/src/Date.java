/**
 * 
 * @author Naveed Sabir
 *
 */
public class Date implements Cloneable, Comparable<Date>{

	private int day;
	private int month;
	private int year;
	
	/**
	 * constructor to set default values
	 */
	Date()
	{
		this.day = 6;
		this.month = 3;
		this.year = 2000;
	}
	
	/**
	 * 
	 * @param day
	 * @param month
	 * @param year
	 */
	Date(int day, int month, int year)//parameterized constructor
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	/**
	 * constructor for shallow copying
	 * @param date2
	 */
	Date(Date date2)
	{
		this.day = date2.day;
		this.month = date2.month;
		this.year = date2.year;
	}
	
	
	/**
	 * Setter method
	 * @param day
	 */
	public void setDay(int day) {
        this.day = day;
    }
	
	/**
	 * 
	 * @param month
	 */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    /**
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * @return string value
     */
     @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }
    
    /**
     * Deep copying
     */
    @Override
    public Date clone() {
        try {
            return (Date) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not possible for Date");
        }
    }
    
    /**
     * Compare to later sort it
     */
    @Override
    public int compareTo(Date date) {
        if (this.year == date.year) {
            if (this.month == date.month) {
                return Integer.compare(this.day, date.day);
            }
            return Integer.compare(this.month, date.month);
        }
        return Integer.compare(this.year, date.year);
    }
    
}
