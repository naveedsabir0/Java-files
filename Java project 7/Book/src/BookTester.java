
/**
 * Tester class
 * @author 
 *
 */
public class BookTester {
	
	/**
	 * The maim method.
	 * @param args
	 */
	 public static void main (String[] args)
	 {
		 Book b1;
		 b1= new Book ("Sami","PythonTest",100);
		 b1.printBook();
		 b1.setBookPages(200);
		 b1.setRefNumber("11212312313");
		 b1.printDetails();
		 b1.setRefNumber("14413");
		 b1.getPages();
		 b1.setBorrowed();
		 b1.setBorrowed();
		 b1.setBorrowed();
		 b1.printDetails();
		 
		 
		 
	 }
	 
	 
}