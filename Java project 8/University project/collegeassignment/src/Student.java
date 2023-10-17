package universityproject;

/**
 * Student ID: 2224755
 * @author Naveed Sabir
 * @version 12/05/2023
 */
public class Student {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int id;
    private static int nextId = 1;

    /**
     * Constructor of student
     * @param firstName of the student
     * @param lastName of the student
     * @param phoneNumber of the student
     * @param id of the student
     */
    public Student(String firstName, String lastName, String phoneNumber, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.id = nextId++;
    }

    /**
     * getter method
     * @return the first name of the student
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter method
     * @return last name of the student
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getter method
     * @return phonenumber of the student
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * getter method
     * @return student id of the student
     */
    public int getStudentId() {
        return id;
    }

    /**
     * Mutator method
     * @param firstName of the student
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Mutator method
     * @param lastName of the student
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Mutator method
     * @param phoneNumber of the student
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Setter method
     * @param id of the student
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Prints student details in this method
     */
    public void printStudentDetails() {
        System.out.println(firstName + " " + lastName + " | ID: " + id + " | Phone: " + phoneNumber);
    }
}



