package universityproject;

/**
 * Student ID: 2224755
 * @author Naveed Sabir
 * @version 12/05/2023
 */


public class Course {
    private int id;
    private String title;
    private double enrolmentFee;

    /**
     * Constructor of course
     * @param id for course id
     * @param title for course title
     * @param enrolmentFee for enrolment fee of the course
     */
    public Course(int id, String title, double enrolmentFee) {
        this.id = id;
        this.title = title;
        this.enrolmentFee = enrolmentFee;
    }

    /**
     * 
     * @return id for course id and complete getter method
     */
    public int getCourseId() {
        return id;
    }

    /**
     * @return getter method for title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @return enrolmentFee, completing the getter method
     */
    public double getEnrolmentFee() {
        return enrolmentFee;
    }

    /**
     * 
     * @param id setter method for course id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @param title setter method for title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @param enrolmentFee setter method for enrolment Fee
     */
    public void setEnrolmentFee(double enrolmentFee) {
        this.enrolmentFee = enrolmentFee;
    }

    /**
     * prints all course details of a course
     */
    public void printDetails() {
        System.out.println("ID: " + id + " | Title: " + title + " | Enrolment Fee: $" + enrolmentFee);
    }
}

