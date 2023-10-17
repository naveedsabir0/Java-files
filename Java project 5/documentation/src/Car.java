/**
 * Write a description of class Car here
 * 
 * 
 * @author (your name)
 * @version ( a version number or date)
 * 
 */


public class Car
{
    // instance variables - replace the example below with your own
    private String make;
    private String model;
    private String regNo;
    /** Price the dealer bought the car for */
    private float boughtFor;
    /** Price the dealer sold the car for */
    private float soldFor;

    /**
     * 
     * @param make the make of the car, for instance Ford
     * @param model the model
     * @param regNo the registration number
     * @param boughtFor the price
     */
    public Car(String make, String model, String regNo, float boughtFor)
    {
        // initialise instance variables
        this.make = make;
        this.model = model;
        this.regNo = regNo;
        this.boughtFor = boughtFor;
        // Set soldFor = 0 to indicate we have not yet sold it.
        soldFor = 0.0f;
    }

    /**
     * @return get the make of car
     */
    public String getMake() 
    {
        return make;
    }

    /**
     * 
     * @return model getter method
     */
    public String getModel() 
    {
        return model;
    }

    /**
     * 
     * @return regNo getter method
     */
    public String getRegNo() 
    {
        return regNo;
    }

    /**
     * 
     * @return bought for getter method
     */
    public float getBoughtFor() 
    {
        return boughtFor;
    }

    /**
     * 
     * @return getter method sold for
     */
    public float getSoldFor() 
    {
        return soldFor;
    }

    /**
     * 
     * @param soldFor setter method
     */
    public void setSoldFor(float soldFor) 
    {
        this.soldFor = soldFor;
    }

    /**
     * 
     * @return soldFor - boughFor to calculate the profit after the sale
     */
    public float profit()
    {
        if(soldFor > 0){
            return soldFor - boughtFor;
        }
        else {
            return 0;
        }
    }
    
    /**
     * Create a string that can be used for printing.
     */
 public void printDetails()
	 {
	  System.out.println("Car make: " + make + ",  Car model: " + model + ",  Car registration number: " + regNo);
     }
    
}
