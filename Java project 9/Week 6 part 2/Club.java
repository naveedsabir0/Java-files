
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Store details of club memberships.
 * 
 * @author (Naveed Sabir) 
 * @version (06/03/2023)
 */

public class Club
{
    // Define any necessary fields here ...
	private ArrayList<Member> membersList;
	private ArrayList<Member> removedList;
	//private ArrayList<Integer> monthsList;  
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
    	membersList = new ArrayList<Member>();
    	removedList = new ArrayList<Member>();
    	//monthsList = new ArrayList<Integer>();
    	
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Member newMember)
    {
     	membersList.add(newMember);
     	newMember.printDetails();
    }
    
    
     public void listofmembersforeach()
     {
    	 for(Member element : membersList)
    	{
     		System.out.println(element.printDetails());
     	}
     }
     
     
    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
      return membersList.size();
    }
    

    public ArrayList<Member> removedMembers (int month, int year)
    {
    	int count2=0;
    	Iterator<Member> it = membersList.iterator();
    	if(month <= 12 && month >=1)
    	{
//   			 		if(month == element.getMonth())
//   			 			{
//   			 				//int count2=0;
//   			 				//NewArrayList.add(element);
   			 				
   			 				
   			 				while(it.hasNext())
   			 				{
   			 					Member element2 = it.next();
   			 					if(month == element2.getMonth() && year == element2.getYear())
   			 					{
   			 						count2=count2+1;
   			 						it.remove();
   			 						removedList.add(element2);
   			 					}
   	 			}		
    							
   	 				
//   	 		if (count2 == 1)
//   	 		{
//   	 			System.out.println("Given month:" + month + ", " + count2 + " member joined." );
//   	 		}
//   	 		else
//   	 		{
//   	 			System.out.println("Given month:" + month + ", " + count2 + " members joined." );
//   	 		}
   			 			System.out.println("");
   			 				System.out.println("REMOVED LIST");
   	 		for(Member element3 : removedList)
   	 		{
   	 			System.out.println("Removed: " + element3.printDetails());
   	 		}
   	 	System.out.println("");
   	 		System.out.println("LIST AFTER REMOVED MEMBERS");
   	 		
   	 		listofmembersforeach();
    	}
   	 	

   		 return null;
    }
//    public void printdelete()
//    {
//    	for(Member element3 : removedList)
//	 		{
//	 			System.out.println("Removed: " + element3.printDetails());
//	 		}
//}
    
    public int joinedInMonth (int month)
    {	int count=0;
    	if (month<=12 && month>0)
    		{
    			int index=0;
    			while((membersList.size()) >= 0 && (index < membersList.size()))
    			{	
    				for(Member element : membersList)
    		    	{
    		     		if(month == element.getMonth())
    				{
    					count=count+1;
    					index=index+1;
    				}
    				else
    				{
    					index = index + 1;

    				}
    		     	}
    				
    			}
    			if (count == 1)
    			{
    				System.out.println("Given month:" + month + ", " + count + " member joined." );
    			}
    			else
    			{
    				System.out.println("Given month:" + month + ", " + count + " members joined." );
    			}
    			
    		}
    	else
    		{
    			System.out.println("ERROR!MONTH NOT VALID.");
    		}
    	return count;
			
    }
}
