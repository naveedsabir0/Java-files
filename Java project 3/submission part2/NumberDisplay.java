/**
 * The NumberDisplay class represents a digital number display that can hold
 * values from zero to a given limit. The limit can be specified when creating
 * the display. The values range from zero (inclusive) to limit-1. If used,
 * for example, for the seconds on a digital clock, the limit would be 60, 
 * resulting in display values from 0 to 59. When incremented, the display 
 * automatically rolls over to zero when reaching the limit.
 * 
 * @author A. Razak
 * @version 12/02/2023
 */
public class NumberDisplay
{
    private int limit;
    private int value;
    private int value2;
    private int hourcount;

    /**
     * Constructor for objects of class NumberDisplay.
     * Set the limit at which the display rolls over.
     */
    public NumberDisplay(int rollOverLimit)
    {
        limit = rollOverLimit;
        value = 0;
        hourcount = 0;
    }

    /**
     * Return the current value.
     */
    public int getValue()
    {
        return value;
    }
    
    public int getValue2()
    {
    	return value2;
    }

    /**
     * Return the display value (that is, the current value as a two-digit
     * String. If the value is less than ten, it will be padded with a leading
     * zero).
     */
    public String getDisplayValue()
    {
        if(value < 10) {
        	
            return "0" + value;
            
        }
        else {
        	 
            return "" + value;
        }
    }
        public void printDisplayValue(){
        	
        	if(value < 10) {
           	
               
               
           }
           else {
           
        }
        	
        
    }
        
///////////////////////////
        public String getDisplayValue2()
        {
            if(value == 0) {
            
                return "" + 12;
                
            }
            else if (value == 12)
            {
            	return "" + value;
            }
            else if(value == 24) {
            	 
                return "" + 12;
            }
            else if (value < 10)
            {
            	return "0" + value;
            }
            else
            {
            	return "" + value % 12;
            }
        }
            public void printDisplayValue2(){
            	
            	if(value < 10) 
            	{
               	
                   
                   
            	}
            	
                else
               {
               
			}
            	
            
        }

    /**
     * Set the value of the display to the new specified value. If the new
     * value is less than zero or over the limit, do nothing.
     */
    public void setValue(int newValue)
    {
        if((newValue >= 0) && (newValue < limit))
        {
            value = newValue;
        }
    }

    /**
     * Increment the display value by one, rolling over to zero if the
     * limit is reached.
     */
    public void increment()
    {
        //value = (value + 1) % limit;
        if (value < 24 || value < 60)
        {
        	value = value + 1;
        }
        if (value == 24 || value == 60)
        {
        	value = 0;
        }
        
    }
     public void increment2()
     {
    	 //value = value % limit;
    	 if (value >= 0 && value < limit)
         {
    		value = value + 1;
         	value2 = value2 + 1;
         	hourcount = hourcount + 1;
//         	if (value2 < 12 || value2 <60)
//         	{
//         		value2= value2+1;
//         		hourcount = hourcount + 1;
//         	}
         }
    	 else if(value  >= 13)
    	 {
    		 value2 = value % 12;
    		 hourcount =1;
    		 //value2 = (value + 1) % limit; 
    	 }
//    	 else if (value == 24 || value < limit)
//         {
//         	value = 0;
//         	value2 = 0;
//         	hourcount = 0;
//         }
    	 else if(value == 0)
    	 {
    		 value2 = 12;
    		 value2 = value2 + 1;
    	 }
         
         
         
         
//    	 if (value < 24 && value >= 0)
//         {
//    		 if(value2 <=12 && value2 >=0)
//    		 {
//    			 value2 = value2 + 1;
//    			 hourcount = hourcount + 1;
//    		 }
//    		 else if(value2 >= 13 && value2 <= 24)
//    		 {
//    			 value2 = value2 + 1;
//    			 hourcount = hourcount + 1;
//    		 }
//    		 else
//    		 {
//    			 
//    		 }
//    			 
//         }
//         if (value == 24)
//         {
//        	 if(value2 >=12 && value2 <=23)
//        	 {
//        		 value2 = 0;
//        		 hourcount = 0;
//        	 }
//         	
//         }
     }
}
