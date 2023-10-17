import java.util.Iterator;
/**
 * Write a description of class ArrayPractice here.
 * 
 * @author Naveed Sabir 
 * @version 1.0
 */
public class ArrayPractice
{
    // instance variables - in this class we have no fields so this
    // part is empty
    
    /**
     * Constructor for objects of class ArrayPractice
     */
    public ArrayPractice()
    {
    }

    
    /**
     * Exercise 1
     */
    public void PrintArray()
    {
        // An array of numbers
       int[] numbers = {4, 1, 22, 9, 14, 3, 9};
       System.out.println("\n");
       System.out.println("numbers = {4, 1, 22, 9, 14, 3, 9}");//prints an array directly since we know it wont be changing.
       for(int i: numbers)
       {
    	   //System.out.println(i); //prints each value seperately while looping through the array.
       }
       System.out.println("\n");
    }
    
    
    /**
     * Exercise 2
     */
    public void smallestNumber()
    {
    // an array of numbers
    int[] numbers = {4, 1, 22, 9, 14, 3, 9};
    int min = numbers[0];
    System.out.println("\n");
    System.out.println("numbers = {4, 1, 22, 9, 14, 3, 9}");
    for(int i=1; i < numbers.length; i++) // looping through the array by using the conditions
    {
    	if (numbers[i] < min)//if the number in the array is greater than the value in the variable min
    	{
    		min = numbers[i];//then min stores the value of the array

    	}
 	   //System.out.println(i);
    }
    System.out.println("The minumum value in the array is: " + min);//prints the last stored value in the variable min which is the smallest.
    System.out.println("");
    
    }
    
    /**
     * Exercise 3
     */
    public void largestNumber()
    {
    // an array of numbers
    int[] numbers = {4, 1, 22, 9, 14, 3, 9};
    int max=numbers[0];
    System.out.println("\n");
    System.out.println("numbers = {4, 1, 22, 9, 14, 3, 9}");
    for(int i=0;i<numbers.length;i++)    
    {
    	if(numbers[i] > max)//if the number in the array is greater than the value in the variable max
    	{
    		max = numbers[i];//then max becomes the number in the array
    	}
    	//System.out.println(i);
    }
    System.out.println("The maximum value in the array is: " + max);//print out the value of max
    System.out.println("\n");
    
    }
    
    
    /**
     * Exercise 4
     */
    public void PrintFibonacci()
    {
        int[] fib = new int[20];
        fib[0] = 0;
        fib[1] = 1;
        System.out.println("Fibonacci:");
        // Add a for loop to fill the array with the sequence starting with element 2
        System.out.println("Fib[0]=0");
    	System.out.println("Fib[1]=1");
        for (int element = 2; element < fib.length; element++)
        {// Hint fib[2] = fib[1] + fib[0] and fib[3] = fib[2] + fib[1] and so on
        	fib[element] = fib[element-1] + fib[element-2];
        	System.out.println("Fib" + "[" + element + "]" + "=" + fib[element]);
        }
        
        // Once you have filled the array now display the numbers in the array
        // i.e. the Fibonacci sequence. If you can format the output so it looks
        // like this (hint use string concatenation.
        // fib[0] = 0
        // fib[1] = 1
        
    }
    
    
    /**
     * Exercise 5a
     * In this activity you are to calculate and display the average mark from 
     * a set of marks allocated by a tutor.
     * 
     * In this method you are to use a for-each loop.
     */
    public void markAnalysisForEach()
    {
    	float avg = 0;
    	int count=0;
    	float sum = 0;
        float[] marks = {48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f};
        System.out.println("\n");
    	System.out.println("Marks with ForEach.");
    	System.out.println("marks = {48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f}");
        for(float i : marks)//for i in each marks arrray value
        {
        	//System.out.println(i);
        	sum=sum+i;//calculate sum and store it
        	count = count + 1;//count how many times the procedure is done
        }
        avg = sum/count;//do the calculation to print out the average
        System.out.printf("The average mark is: " + avg);
        
    }
        
    
    /**
     * Exercise 5b
     * In this activity you are to calculate and display the average mark from 
     * a set of marks allocated by a tutor.
     * 
     * In this method you are to use a while loop.
     */
    public void markAnalysisWhile()
    {
        int i=0;
        float avg=0;
        float sum=0;
        int count=0;
    	float[] marks = {48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f};
    	System.out.println("\n");
    	System.out.println("Marks with While.");
    	System.out.println("marks = {48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f}");
        while(i<marks.length)//while i loops through the length or array marks
        {
        	//System.out.println(marks[i]);
        	sum=sum+marks[i];//calculate the sum
        	count = count + 1;//calculate the count
        	i++;
        }
        avg = sum/count;//calculate the average by dividing sum with count
        System.out.printf("The average mark is: " + avg);
        
    }
        
    
    /**
     * Exercise 5c
     * In this activity you are to calculate and display the average mark from 
     * a set of marks allocated by a tutor.
     * 
     * In this method you are to use a for loop.
     */
    public void markAnalysisFor()
    {
    	int i;
    	float avg=0;
    	float sum=0;
    	int count=0;
    	System.out.println("\n");
    	System.out.println("Marks with For.");
        float[] marks = {48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f};
        System.out.println("marks = {48.2f, 87.2f, 67.1f, 47.0f, 32.8f, 53.2f, 55.1f, 61.3f, 41.1f}");
        for(i=0;i<marks.length;i++)
        {
        	//System.out.println(marks[i]);
        	sum=sum+marks[i];
        	count = count + 1;
        }
        avg=sum/count;
        System.out.printf("The average mark is: " + avg);
    }
        
}
