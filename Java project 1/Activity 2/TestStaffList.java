/**
 * A simple tester class to test the StaffList class methods
 * @author A. Razak
 * version 17/03/2019
 */

public class TestStaffList {
	
	public static void main(String args[]){
		//Activity 2
		StaffList list = new StaffList();
		list.addPerson(new Person("Gio1",21));
		list.addPerson(new Person("Gio2",23));
		list.addPerson(new Person("Gio3",24));
		list.addPerson(new Person("Gio4",25));
		list.addPerson(new Person("Gio5",26));
		list.showAllStaff();
		list.getNbrPeople();
		list.showStaffInAgeRange(21, 26);
		list.showMin();
		list.showMax();
		list.lowestAge();
		list.highestAge();
	}

}
