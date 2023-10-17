public class testdice
{

	public static void main(String args[])
	{
		
		//excercise 1
		dice d = new dice();
		 for (int i = 0; i < 10; i++)
		 {
	            d.roll();
	            int value = d.getValue();
	            if (value < 1 || value > 6) 
	            {
	               System.out.println("Error: dice value out of range");
	            } 
	            else 
	            {
	               System.out.println("Dice value: " + value);
	            }
	     }
		 
		//excercise 2
		 d.rollDice01(25);
	     int value = d.getValue();
	     if (value < 1 || value > 6) 
	     {
	       System.out.println("Error: dice value out of range");
	     } 
	     else 
	     {
	       System.out.println("Dice value: " + value);
	     }
	     
	     //excercise 3
	     d.rollDice02(2500);
	     int value1 = d.getValue();
	     if (value1 < 1 || value1 > 6) 
	     {
	       System.out.println("Error: dice value out of range");
	     }
	     
	     //As we can see, even though we're rolling the dice only 10 times per test, the results can still vary.
	     //This is because rolling a dice involves chance,
	     //and even a small sample size like 10 can produce different outcomes each time.
	     //However, as we increase the number of rolls, the results should converge to the expected values,
	     //which are a uniform distribution of values between 1 and 6.
	}

}
