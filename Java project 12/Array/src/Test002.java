import java.util.Arrays;
import java.util.Random;

public class Test002 {
	private static final int NO_DOGS_IN_POUND =   200000; private static final int NO_REPORTED_LOST = 2000; private static final int RANGE = NO_DOGS_IN_POUND * 2; private static final Random rnd = new Random(); 
	 private Dog dogPound[] = new Dog [NO_DOGS_IN_POUND]; private Dog reportedLost[] = new Dog [NO_REPORTED_LOST]; 
	 public Test002(){  long id; 
	 for(int i = 0; i < NO_DOGS_IN_POUND; i++){   	id = Math.abs(rnd.nextInt()) % RANGE; 
		  	dogPound[i] = new Dog(id, ""); 
	 } 
	 for(int i = 0; i < NO_REPORTED_LOST; i++){   	id = Math.abs(rnd.nextInt()) % RANGE; 
		  	reportedLost[i] = new Dog(id, ""); 
	 } 
	}  
	public void pause(long delay){ 
	 try{ 
		  	Thread.sleep(delay); 
	 } 
	 catch (Exception e){ 
		  	e.printStackTrace(); 
	 } 
	} 
	 
	// Perform single sequential search 
	public boolean search(Dog value){ 
	 int i = 0; 
	 while(i < NO_DOGS_IN_POUND && dogPound[i].compareTo(value) != 0){ 
		  	i++; 
	 } 
	 return (i < NO_DOGS_IN_POUND); 
	}  
	public void performSequentialSearch(){ 
	 long time; 
	 int nbrFound = 0; 
	  
	 System.out.print("#### SEQUENTIAL SEARCH (Data Set Size "); 
	 System.out.println(NO_DOGS_IN_POUND + " ) ###"); 
	  
	 time = System.currentTimeMillis();  for(int i = 0; i < NO_REPORTED_LOST ; i++){ 
		  	if(search(reportedLost[i])) 
		  	 	nbrFound++; 
	 } 
	 time = System.currentTimeMillis() - time; 
	  
	 System.out.print(" Number matched : " + nbrFound); 
	 System.out.println(" out of " + NO_REPORTED_LOST + " searchs"); 
	 System.out.println(" Time taken     : " + time + " milliseconds\n"); 
	} 
	 
	public void performBinarySearch(){ 
	 long time; 
	 int nbrFound = 0; 
	  
	 System.out.print("#### BINARY SEARCH (Data Set Size "); 
	 System.out.println(NO_DOGS_IN_POUND + " ) ###"); 
	  
	 time = System.currentTimeMillis();  for(int i = 0; i < NO_REPORTED_LOST ; i++){ 
		  	if(Arrays.binarySearch(dogPound, reportedLost[i]) >= 0) 
		  	 	nbrFound++; 
	 } 
	 time = System.currentTimeMillis() - time; 
	  
	 System.out.print(" Number matched : " + nbrFound); 
	 System.out.println(" out of " + NO_REPORTED_LOST + " searchs"); 
	 System.out.println(" Time taken     : " + time + " milliseconds\n"); 
	}  
	public void execute(){ 
	 long time; 
	  
	 performSequentialSearch(); 
	 pause(100); 
	  
	 // Sort the data set array  int nbrFound = 0; 
	 System.out.print("SORTING " + NO_DOGS_IN_POUND + " elements took ");  time = System.currentTimeMillis();  //Arrays.sort(dogPound); 
	 time = System.currentTimeMillis() - time;  System.out.println("" + time + " milliseconds\n");  pause(100); 
	  
	 pause(100); 
	 performBinarySearch(); 
	}  public static void main(String[] args) {  Test002 that = new Test002();  that.execute(); 
	}


}
