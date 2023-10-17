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
    

    public ArrayList<Member> members (int month, int year)
    {
    	ArrayList<Member> removedList = new ArrayList<Member>();
    	Iterator<Member> it = membersList.iterator();
    	int count2=0;
   	 	if(month >= 1 && month <= 12)
   	 	{
   	 		int i=0;
   	 		while(membersList.size() >= 0 && i < membersList.size())
   			{
   	 			for(Member element : membersList)
   	 			{
   			 		if(month == element.getMonth())
   			 			{
   			 				//NewArrayList.add(element);
   			 				count2=count2+1;
   			 				Member element2 = it.next();
   			 				while(it.hasNext())
   			 				{
    		 
   			 					if(count2 == element2.getMonth())
   			 					{
   			 						it.remove(); 
   			 						removedList.add(element2);
   			 					}
   			 				}
   			 				i=i+1;
   			 				
   			 			}
   			 		else
   			 			{
   			 				i=i+1;
   			 			}
   			 				
   			}
   			}
   	 	if (count2 == 1)
		{
			System.out.println("Given month:" + month + ", " + count2 + " member joined." );
		}
		else
		{
			System.out.println("Given month:" + month + ", " + count2 + " members joined." );
		}
   	 		
   	 	}
   		 else
   		 {
   			 System.out.println("ERROR!MONTH NOT VALID.");
   		 }
   	 	for(Member element3 : removedList)
   	 	{
     		System.out.println("Removed: " + element3.printDetails());
   	 	}
   	 	

   		 return null;
    }
    
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

	public boolean deleteMemberByName(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
