/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * The constructor - set the author and title fields when this object
     * is constructed.
     */
    
    public Book(String bookAuthor, String bookTitle,int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
    }
    
    public void printBook()
    {
    	System.out.println("##################");
    
    	System.out.println("Author name:"+author);
    	System.out.println("Book name:"+title);
    	System.out.println("##################");
    	System.out.println();
    }
    
    public void setBookPages(int newPages)
    {
    	pages=newPages;
    }
    
    public void setRefNumber(String newRefNumber)
    {
    	refNumber = newRefNumber;
    	if (refNumber.length() <= 3)
    	{
    		System.out.println("Error");
    	}
    	else
    	{
        	refNumber = newRefNumber;
    	}
    }
    
    public void setBorrowed()
    {

        borrowed += 1;
    }
    
    public String getRefNumber()
    {
    	return refNumber;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public void printDetails()
    {
    	System.out.println("##################");
        System.out.println("# Book author is :  " + author);
        System.out.println("The title is : " + title);
        System.out.println("The total number of pages in the group are : "+ pages);
        if (refNumber.length() <= 3)
        {
        	System.out.println("No reference number: ????");
        	/*System.out.println("The length is: "+  + refNumber.length());*/
        }
        else
        {
        	System.out.println("The reference number of the book is : "+ refNumber);
        	/*System.out.println("The length is: "+  + refNumber.length());*/
        }
        System.out.println("The book has been borrowed: " + borrowed);
        System.out.println("##################");
        System.out.println();
    }
}
