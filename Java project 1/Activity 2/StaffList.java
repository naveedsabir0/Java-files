
/**
 * A simple class to track the staff working for a small company. It
 * uses an array to store the name and age of each member of staff.
 * 
 * @author Naveed Sabir 
 * @version 1.0
 */
public class StaffList
{
    // instance variables
    private Person[] people;
    private int numPeople;
    
    /**
     * This constructor will create an array to store upto 5 staff
     */
    public StaffList()
    {
        // create an array of Person objects
        people = new Person[5];
        numPeople = 0;
    }
    
     /**
     * This constructor can be used to create arrays not less than 5 elements
     * to store upto  staff details
     */
   public StaffList(int maxNbrStaff)
    {
       if(maxNbrStaff < 5){
           maxNbrStaff = 5;
        }
        // create an array of Person objects
        people = new Person[maxNbrStaff];
        numPeople = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  p   the Person to add
     */
    public void addPerson(Person p)
    {
    	people[numPeople] = p;
    	numPeople++;
    }
    
    public int getNbrPeople(){
    	System.out.println("\nThe number of people in the list are: "+ numPeople);
        return numPeople;
    }
    
    /**
     * Display the people in the array
     */
    public void showAllStaff()
    {
        for(Person p : people)        
        {
            System.out.println(p);
        }
    }
    public void showStaffInAgeRange(int min, int max)
    {
    	System.out.println("\n");
    	for(Person Gio : people)
    	{
    		if(Gio.getAge()>= min && Gio.getAge()<=max)
    		{
    			System.out.println(Gio);
    		}	
    	} 
    }
    public void lowestAge()
    {
    	int min = Integer.MAX_VALUE;
    	String name = "";
    	for(Person Gio : people)
    	{
    		if(Gio.getAge() < min)
    		{
    			min = Gio.getAge();
    			name = Gio.getName();
    		}
    	}
    	System.out.println("\nThe youngest staff member is " + name + " " + min + " years old");
    }
    
    public void  highestAge()
    {
    	int max = Integer.MIN_VALUE;
    	String name = "";
    	for(Person Gio : people)
    	{
    		if(Gio.getAge() > max)
    		{
    			max = Gio.getAge();
    			name = Gio.getName();
    		}
    	}
    	System.out.println("The youngest staff member is " + name + " " + max + " years old");
    }
    
    public void showMin()
    {
    	int min = 0;
    	String n=null;
    	for(Person Gio : people)
    	{
    		if(min==0)
    		{
    			min = Gio.getAge();
    			n = Gio.getName();
    		}
    		else if(Gio.getAge()< min)
    		{
    			min = Gio.getAge();
    			n = Gio.getName();
    		}
    		
    	}
    	System.out.println("The "+ n + " member age: " + min);
    		
    }

    public void showMax()
    {
    	int max = 0;
    	String n2=null;
    	for(Person Gio : people)
    	{
    		if(max==0)
    		{
    			max = Gio.getAge();
    			n2 = Gio.getName();
    		}
    		else if(Gio.getAge()>max)
    		{
    			max = Gio.getAge();
    			n2 = Gio.getName();
    		}
    	}
    	System.out.println("The "+ n2 + " member age: " + max);	
    }
}
