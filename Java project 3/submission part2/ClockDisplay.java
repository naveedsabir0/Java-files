/**
 * The ClockDisplay class implements a digital clock display for a
 * European-style 24 hour clock. The clock shows hours and minutes. The 
 * range of the clock is 00:00 (midnight) to 23:59 (one minute before 
 * midnight).
 * 
 * The clock display receives "ticks" (via the timeTick method) every minute
 * and reacts by incrementing the display. This is done in the usual clock
 * fashion: the hour increments when the minutes roll over to zero.
 * 
 * @author A. Razak
 * @version 12/02/2023
 */
public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    // simulates the actual display
    private NumberDisplay seconds;
    private int hours2, minutes2, seconds2;
    private  NumberDisplay hourvar;
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        hourvar = new NumberDisplay(24);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int newHour, int newMinute, int newSecond)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        hourvar = new NumberDisplay(24);
        setTime(newHour, newMinute, newSecond);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
    	seconds.increment();
    	if (seconds.getValue() == 0)
    		{
    			minutes.increment();
    			if (minutes.getValue() == 0)// it just rolled over!
    			{  
    				hours.increment();
    				hourvar.increment2();
    			}
    		}
    	
        
        
        updateDisplay();
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int newHour, int newMinute, int newSecond)
    {
        hours.setValue(newHour);
        minutes.setValue(newMinute);
        seconds.setValue(newSecond);
        hours2 = newHour;
        minutes2 = newMinute;
        seconds2 = newSecond;
        hourvar.setValue(newHour);
        
        
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    
    public String getTime()
    {
    	 System.out.println(displayString);
        return displayString;
        
    }
    
    public void printTime()
    {
    	
    	if(hours2 > 23 || hours2 < 0)
    	{
    		System.out.println("ERROR");
    	}
    	else if(minutes2 > 59 || minutes2 < 0)
    	{
    		System.out.println("ERROR");
    	}
    	else if(seconds2 < 0 || seconds2 > 59)
    	{
    		System.out.println("ERROR");
    	}
    	else if(hours2 < 24 || hours2 >= 0)
    	{
    		if(hours.getValue() >= 0 && hours.getValue() < 13)
    		{
    			System.out.println(displayString + " AM");
    		}
    		else if(hours.getValue() >= 13 && hours.getValue() <= 23)
    		{
				System.out.println(displayString + " PM");
    		}
    		else
    		{
				System.out.println(displayString + " AM");
    		}
    	}
    	else if(minutes2 <= 59 || minutes2 >= 0)
    	{
    		System.out.println(displayString);
    	}
    	else if(seconds2 <= 59 || seconds2 >= 0)
    	{
    		System.out.println(displayString);
    	}
    	else
    	{
    		System.out.println("ERROR");
    	}
    }
    	
    
    /**
     * Update the internal string that represents the display.
     */
    public void updateDisplay()
    
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue() + ":" +
        				seconds.getDisplayValue() + "   -   " + hourvar.getDisplayValue2() + ":" + minutes.getDisplayValue()+ ":" + seconds.getDisplayValue();
    }
    
}
