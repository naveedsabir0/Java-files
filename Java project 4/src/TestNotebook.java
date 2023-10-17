
/**
 * This TestNotebook class is designed using black box testing to test all the methods in the Notebook class.
 * 
 * @author Abdul Razak 
 * @version 26/03/2023
 */
public class TestNotebook
{

    /**
     * Constructor for objects of class TestNotebook
     */
    public TestNotebook()
    {
    }

    /**
     * Tests to see if we have a message containing some text
     */
    public void test_001()
    {
        Notebook book = new Notebook();
        String s;
        populateWithData_A(book);
        printMessagesInNotebook(book);
        println("## Search notes for some text ##");
        s = "Manchester";
        if(book.hasMessage(s)){
            println("Found " + s);
        }
        else {
            println("Can't find " + s);
        }

        s = "man";
        if(book.hasMessage(s)){
            println("Found " + s);
        }
        else {
            println("Can't find " + s);
        }

        s = "meet";
        if(book.hasMessage(s)){
            println("Found " + s);
        }
        else {
            println("Can't find " + s);
        }

        s = "car";
        if(book.hasMessage(s)){
            println("Found " + s);
        }
        else {
            println("Can't find " + s);
        }

        s = "chester";
        if(book.hasMessage(s)){
            println("Found " + s);
        }
        else {
            println("Can't find " + s);
        }
    }

    /**
     * Testing methods to show all messages containing particular
     * text.
     */
    public void test_002()
    {
        Notebook book = new Notebook();
        String s;
        populateWithData_A(book);
        printMessagesInNotebook(book);
        s = "Manchester";
        println("#### Finding all notes containing '" + s +"'");
        book.showMessages(s);
        println("--------------------------------");

        s = "man";
        println("#### All notes containing '" + s +"'");
        book.showMessages(s);
        println("--------------------------------");

        s = "meet";
        println("#### All notes containing '" + s +"'");
        book.showMessages(s);
        println("--------------------------------");

        s = "car";
        println("#### All notes containing '" + s +"'");
        book.showMessages(s);
        println("--------------------------------");

        s = "chester";
        println("#### All notes containing '" + s +"'");
        book.showMessages(s);
        println("--------------------------------");
    }

    /**
     * testing removing messages containing particular text
     */
    public void test_003()
    {
        Notebook book = new Notebook();
        String s;
        populateWithData_A(book);
        printMessagesInNotebook(book);

        s = "Manchester";
        println("#### All notes containing '" + s +"'");
        book.showMessages(s);
        println("--------------------------------");

        println("... removing all notes containing '" + s +"'");
        book.removeMessages(s);
        printMessagesInNotebook(book);
    }

    /**
     * Populate the notebook with come data
     */
    private void populateWithData_A(Notebook nb)
    {
        nb.storeNote(new String("Get the car serviced"));
        nb.storeNote(new String("Shopping in Manchester"));
        nb.storeNote(new String("Meet at Manchester station"));
        nb.storeNote(new String("Must meet with Abdul"));
        nb.storeNote(new String("Get the carpet cleaned"));
    }

    /**
     * Convenience method to list all messages in a notebook
     */
    private void printMessagesInNotebook(Notebook nb)
    {
        println("##### Notes in notebook ############");
        nb.listmessagesForEach();
        println("####################################");
    }

    /**
     * Convenience method to save some typing when
     * using System.out.print()
     */
    private void print(String s)
    {
        System.out.println(s);
    }

    /**
     * Convenience method to save some typing when
     * using System.out.println()
     */
    private void println(String s)
    {
        System.out.println(s);
    }
    
    public static void main(String args[]){
    	TestNotebook myNotebook = new TestNotebook(); // Creating an object of type TestNotebook to run the test methods.
    	
    	/* Running the test methods
    	 * you can run each test method in turn by removing the comment*/
    	
    	// running test_001 method
    	
    	myNotebook.test_001(); // run the method test_001.
    	
    	// running test_002 method
    	
    	myNotebook.test_002(); // run the method test_002.
    	
    	// running test_003 method
    	
    	myNotebook.test_003(); //run the method test_003.
    }
}
