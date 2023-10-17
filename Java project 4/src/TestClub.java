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
   
    public void test_001()
    {
    	Club club = new Club();
    	// Creating the club
    	System.out.println("Creating the club");
    	// Adding members
    	System.out.println("Adding members");
    	Member member1 = new Member("Joanna", 2, 2023);
    	club.join(member1);
    	Member member2 = new Member("Noah", 6, 2023);
    	club.join(member2);
    	Member member3 = new Member("Daryl", 9, 2023);
    	club.join(member3);
        
    	// Showing the list of members
    	System.out.println("List of members:");
        club.listofmembersforeach();
    	
    	// Getting the number of members
    	int numberOfMembers = club.numberOfMembers();
    	System.out.println("Number of members: " + numberOfMembers);
    }
    
    public void test_002() 
    {
        Club club = new Club();

        // Creating the club
        System.out.println("Creating the club");

        // Adding members
        System.out.println("Adding members");
        Member member1 = new Member("George", 5, 2023);
        club.join(member1);

        Member member2 = new Member("Trixy", 4, 2023);
        club.join(member2);

        Member member3 = new Member("Adam", 10, 2023);
        club.join(member3);

        // Removing members and adding them to the removed list
        System.out.println("Removing members and adding them to the removed list");
        club.members(6, 2023);

        // Showing the list of members
        System.out.println("List of members:");
        club.listofmembersforeach();

        // Getting the number of members
        int numberOfMembers = club.numberOfMembers();
        System.out.println("Number of members: " + numberOfMembers);
    }
    
    public static void test_003() {
        Club club = new Club();

        // Creating the club
        System.out.println("Creating the club");

        // Adding members
        System.out.println("Adding members");
        Member member1 = new Member("John", 1, 2023);
        club.join(member1);

        Member member2 = new Member("Jack", 4, 2023);
        club.join(member2);

        Member member3 = new Member("Nick", 8, 2023);
        club.join(member3);

        // Deleting members based on their names
        System.out.println("Deleting members based on their names");
        boolean deletionResult1 = club.deleteMemberByName("John");
        boolean deletionResult2 = club.deleteMemberByName("Jack");

        System.out.println("Deletion Result 1: " + deletionResult1);
        System.out.println("Deletion Result 2: " + deletionResult2);

        // Showing the list of members
        System.out.println("List of members:");
        club.listofmembersforeach();

        // Getting the number of members
        int numberOfMembers = club.numberOfMembers();
        System.out.println("Number of members: " + numberOfMembers);
    }

//    public static void main(String args[]){
//    
//    /**
//     * Add some members to the club, and then
//     * show how many there are.
//     * Further example calls could be added if more functionality
//     * is added to the Club class.
//     */
//       	Club myClub = new Club();
//    	
//    	  System.out.println("The club has " +
//                  myClub.numberOfMembers() +
//                  " members.");
//    	//add members to the club
//        myClub.join(new Member("John", 2, 2017));
//        myClub.join(new Member("Abdi", 4, 2017));
//        myClub.join(new Member("Michael", 7, 2018));
//        myClub.join(new Member("Sami", 5, 2023));
//        myClub.join(new Member("Naveed", 6, 2023));
//        myClub.join(new Member("GioSamiullah", 7, 2023));
//        myClub.join(new Member("sdfsdf",4,2023));
//        myClub.join(new Member("sdfsdf",4,2023));
//        System.out.println("The club has " +
//                           myClub.numberOfMembers() +
//                           " members.");
//       myClub.listofmembersforeach();
//       myClub.joinedInMonth(7);
//       myClub.members(4,0);
//    }
    
    public static void main(String args[]){
    	TestClub myclub = new TestClub();
    	/* Running the test methods
    	 * you can run each test method in turn by removing the comment*/
    	
    	// running test_001 method
    	
    	myclub.test_001(); // run the method test_001.
    	
    	// running test_002 method
    	
    	myclub.test_002(); // run the method test_002.
    	
    	// running test_003 method
    	
    	myclub.test_003(); //run the method test_003.
    }
    
    
}
