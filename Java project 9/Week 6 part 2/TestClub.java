/**
 * Provide a demonstration of the Club and Member
 * classes.
 * 
 * @author A.Razak 
 * @version version 1 - 26/02/2023
 */
public class TestClub
{
	
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class TestClub
     */
    public TestClub()
    {
      
   }

    public static void main(String args[]){
    
    /**
     * Add some members to the club, and then
     * show how many there are.
     * Further example calls could be added if more functionality
     * is added to the Club class.
     */
       	Club myClub = new Club();
    	
    	  System.out.println("The club has " +
                  myClub.numberOfMembers() +
                  " members.");
    	//add members to the club
        myClub.join(new Member("John", 2, 2017));
        myClub.join(new Member("Abdi", 4, 2017));
        myClub.join(new Member("Michael", 7, 2018));
        myClub.join(new Member("Sami", 5, 2023));
        myClub.join(new Member("Naveed", 6, 2023));
        myClub.join(new Member("GioSamiullah", 7, 2023));
        myClub.join(new Member("sdfsdf",4,2023));
        myClub.join(new Member("sdfsdf",4,2023));
        System.out.println("The club has " +
                           myClub.numberOfMembers() +
                           " members.");
       myClub.listofmembersforeach();
       myClub.joinedInMonth(7);
       myClub.removedMembers(7,2018);
       myClub.removedMembers(7, 2023);
       
    }
    
    
}
