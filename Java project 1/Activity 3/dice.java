
import java.util.Random;
public class dice {

	private int value;
	private Random rnd;
	
	public dice() {
        rnd = new Random();
        roll();
    }
	 public int getValue() {
	        return value;
	    }

	 public int roll()
	 {
		 value = rnd.nextInt(6) + 1;
		 return value;
	 }
	 
	 /**
	  * Roll the dice a given number of times and display the
	  * result each time
	  *
	  * @param time number of rolls
	  */
	 //excercise 2
	  public void rollDice01(int times)
	  {
	  System.out.println("=====================================");
	  System.out.println("Roll dice " + times + " and display results");
	  for(int i = 0; i < times; i++){
	  // Start new line after 5
	  if((i % 5) == 0) {
	  System.out.println();
	  }
	  dice d = new dice();
	  d.roll();
	  System.out.print(d.getValue() + "\t");
	  }
	  System.out.println("\nEnd of test");
	  System.out.println("=====================================");
	  }
	  
	  //excercise 3
	  public void rollDice02(int times) {
		    int lowest = 1000;
		    int highest = -1000;
		    for (int i = 0; i < times; i++) 
		    {
		        int result = roll();
		        if (result < lowest) {
		            lowest = result;
		        }
		        if (result > highest) {
		            highest = result;
		        }
		    }
		    System.out.println("After " + times + " rolls the results are:");
		    System.out.println("Lowest value rolled = " + lowest);
		    System.out.println("Highest value rolled = " + highest);
		    System.out.println("End of test");
		}
}
