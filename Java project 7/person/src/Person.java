package person;

public class Person
{
	
	private String name;
	private int age;

	public Person (int pAge, String pName)
	{
		age = pAge;
		name = pName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAge(int newAge)
    {

        age = newAge;
    }
	
	public void printDetails()
	{	

		System.out.println("##############################################");
		System.out.println("# Name: "+ name);
		System.out.println("# Age: "+ age);
		System.out.println("##############################################");
		
	}
}
