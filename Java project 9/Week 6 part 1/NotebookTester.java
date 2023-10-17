
/**
 * A tester class to test the Notebook class's methods.
 * @author Abdul Razak
 * version 19/02/2023
 */


public class NotebookTester
{
	public static void main(String args[]){
		
		
		
	Notebook myNotebook = new Notebook(); //Creating object of type Notebook.

	//Exercise 1: I have provided the solution for this exercise.
	//Invoking (calling) various methods.
	
	myNotebook.storeMessage("Get the car serviced");
	myNotebook.storeMessage("Shopping in Liverpool");
	myNotebook.storeMessage("Meet at Liverpool station");
	myNotebook.storeMessage("Must meet with Abdul");
	myNotebook.storeMessage("Get the carpet cleaned");
	myNotebook.storeMessage("Sami sucks");
	myNotebook.storeMessage("");
	myNotebook.numberOfMessages();
	myNotebook.printNumberOfMessages();
	myNotebook.showMessage(2);
	myNotebook.showMessage(4);
	myNotebook.showMessage(3);
	myNotebook.showMessage(0);
	myNotebook.showMessage(1);
	myNotebook.showMessage(5);
	
	// Please refer to Collection Worksheet to complete the exercises below.
	
	//Exercise 2
	myNotebook.removeMessage(5);
	myNotebook.showMessage(5);
	myNotebook.showMessage(8);
	//Exercise 3
	myNotebook.storeMessage("");
	myNotebook.storeMessage("FOR");
	myNotebook.storeMessage("Go to the park");
	myNotebook.storeMessage("Get a bike");
	myNotebook.storeMessage("Run for 20 mins");
	myNotebook.storeMessage("Workout for 30 mins");
	myNotebook.listMessagesForEach();
	
	//Exercise 4
	myNotebook.storeMessage("");
	myNotebook.storeMessage("WHILE");
	myNotebook.storeMessage("Go to the park");
	myNotebook.storeMessage("Get a bike");
	myNotebook.storeMessage("Run for 20 mins");
	myNotebook.storeMessage("Workout for 30 mins");
	myNotebook.listMessagesWhile();
	//Exercise 5
	myNotebook.storeMessage("");
	myNotebook.storeMessage("Get the car serviced");
	myNotebook.storeMessage("Shopping in Liverpool");
	myNotebook.storeMessage("Meet at Liverpool station");
	myNotebook.storeMessage("Must meet with Abdul");
	myNotebook.storeMessage("Get the carpet cleaned");
	myNotebook.storeMessage("");
	myNotebook.storeMessage("WORDS SEARCHED");
	myNotebook.listMessagesWhile();
	myNotebook.hasMessage("Liverpool");
	myNotebook.hasMessage("meet");
	myNotebook.hasMessage("car");
	myNotebook.hasMessage("pool");
	myNotebook.storeMessage("");
	//exercise 6
	myNotebook.storeMessage("");
	myNotebook.storeMessage("Get the car serviced");
	myNotebook.storeMessage("Shopping in Liverpool");
	myNotebook.storeMessage("Meet at the Liverpool station");
	myNotebook.storeMessage("Must meet with Abdul");
	myNotebook.storeMessage("Get the carpet cleaned");
	myNotebook.showMessages("Manchester");
	myNotebook.showMessages("meet");
	myNotebook.showMessages("car");
	myNotebook.showMessages("pool");
	myNotebook.showMessages("Shopping");
	myNotebook.showMessages("Sami");
	
	//Week 6
	//Activity 1
	myNotebook.storeMessage("");
	myNotebook.storeMessage("This is the message for the new week 6 activities");
	myNotebook.storeMessage("Printing message 1");
	myNotebook.storeMessage("Printing message 2");
	myNotebook.storeMessage("Printing message 1 again");
	myNotebook.storeMessage("Printing message 2 again");
	myNotebook.listMessagesIterator();
	myNotebook.removeMessages("2"); //All messages with "1" removed.
	myNotebook.listMessagesIterator();
	
	}
	
}