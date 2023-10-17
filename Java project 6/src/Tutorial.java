
/**
 * 
 * A simple class called Tutorial to design and inplement programs on Selection (if statement)and iteration (looping)
 * @author Abdul Razak
 * @version 1
 * 
 */
public class Tutorial
{
    private String myTutorial;
    

    /**
     * Constructor for objects of class Tutorial
     */
    public Tutorial()
    {
        // initialise instance variables
        myTutorial = "";
    }
    
   
    /**
     * Example 1
     * The following program (method) prints all even number between 0 and 40 inclisive using a while loop
     */
    public void displayEven ()  // methode header
    
    {    // start of method body
        System.out.println("Even numbers:");
        int number;  //declaring a variable called number of type int
        number =0;   // initiallising number to 0
        while (number <=40){   // the while loop header
            System.out.println(number);   // print statement
            number = number+2;   // increment number by 2
        }
        System.out.println("");
    }   //end of method
    
    
    /**
     * Exercise 1 
     */
    
    public void displayOdd ()
    {
    	System.out.println("Display odd numbers:");
    	int number;  //declaring a variable called number of type int
        number =1;   // initiallising number to 0
        while (number <=40){   // the while loop header
            System.out.println(number);   // print statement
            number = number+2;   // increment number by 2
        }
        System.out.println("");
        
    }
    
    
    /**
     * Exercise 2 
     */
    
    public void multipleOfFive()
    {
    	System.out.println("Display multiple of five");
    	for (int n = 20; n <= 85; n++) //Making sure its between 20 and 85
    	{
            if (n % 5 == 0) {
                System.out.println(n);
            }
        }
        System.out.println("");

        
    }

    
    /**
     * Exercise 3 
     */
    
    public void sum ( int a, int b)
    {
    	System.out.println("Display the sum:");
    	int number = 0; //declare value to int
    	number = a+b;//Add the 2 numbers and store them into a different value
    	System.out.println(number);   // print statement
        System.out.println("");

        
    }
    
        
    
    /**
     * Exercise 4 
     */
     public void reverse (int number)
     {
    	 System.out.println("Display the numbers backwards:");
    	 	int reversed = 0; // set the variable to int
    	    while (number > 0) //check if the number variable is greater than 0
    	    {
    	        int digit = number % 10; //mod it with 10 so you get the last number
    	        reversed = (reversed * 10) + digit; //calculation
    	        number /= 10; //divide and set to 10
    	    }
    	    System.out.println(reversed);
            System.out.println("");

     }
    /**
     * Exercise 5 
     */
    
    public void evenOrOdd (int number)
    {
    	System.out.println("");
    	System.out.println("Check if the numbers are even or odd: ");
    	if (number % 2 == 0) //Add condition
    	{
            System.out.println(number + " is even.");//output even
        } else {
            System.out.println(number + " is odd.");//output odd
        }

        
    }
            
    
    /**
     * Exercise 6 
     */
    
    public void isLeap (int year)

    {
    	System.out.println("Check if the year is leap year: ");
    	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)//adding the correct conditions to check if the years are leap or not with mod
    	{
            System.out.println(year + " is a leap year.");//print leap year
        } else {
            System.out.println(year + " is not a leap year.");//print not leap year
        }
        System.out.println("");

        
    }
    
    
    
    /**
     * Exercise 7: challenge exercise
     */
    
    public void extractAndPrint (int number)
    {
    	System.out.println("Writing number into words:");
    	String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};//insert all number from 0-9
        String[] digitStrings = Integer.toString(number).split("");//chaging int to string
        for (String digitString : digitStrings) //for condition to loop through
        {
            int digit = Integer.parseInt(digitString);//taking the string and saving it into a variable
            System.out.print(digits[digit] + " ");//printing the variable
        }
        System.out.println("");

    }
    
    
    public static void main(String args[]){
    	Tutorial myTutorial = new Tutorial();
    	myTutorial.displayEven();
    	myTutorial.reverse(12345);
    	myTutorial.isLeap(2000);
    	myTutorial.isLeap(1800);
    	myTutorial.isLeap(1955);
    	myTutorial.extractAndPrint(632);
    	myTutorial.evenOrOdd(8);
    	myTutorial.displayOdd();
    	myTutorial.sum(6,4);
    	myTutorial.multipleOfFive();
    	myTutorial.displayEven();
    	
    }

    
}
   

