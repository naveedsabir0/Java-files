package universityproject;

import java.time.LocalDate;

/**
 * Student ID: 2224755
 * @author Naveed Sabir
 * @version 12/05/2023
 */
public class Enrolment {
    private int studentId;
    private int courseId;
    private LocalDate enrolmentDate;

    /**
     * Constructor
     * @param studentId of the enrolment
     * @param courseId of the enrolment
     * @param enrolmentDate of the enrolment
     */
    public Enrolment(int studentId, int courseId, LocalDate enrolmentDate) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrolmentDate = enrolmentDate;
    }

    /**
     * getter method in student class
     * @return gets student id for the enrolment
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * getter method in enrolment class
     * @return gets course id for the enrolment
     */
    public int getCourseId() {
        return courseId;
    }
    

    /**
     * getter method in enrolment class
     * @return gets enrolmentDate for the enrolment
     */
    public LocalDate getEnrolmentDate() {
        return enrolmentDate;
    }

    /**
     * setter method in enrolment class
     * @param  studentId sets studentId for the enrolment
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * setter method in enrolment class
     * @param courseId sets courseId for course
     */
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    /**
     * setter method in enrolment class
     * @param  enrolmentDate sets enrolmentDate for enrolment
     */
    public void setEnrolmentDate(LocalDate enrolmentDate) {
        this.enrolmentDate = enrolmentDate;
    }

    /**
     * prints all details for an enrolment
     */
    public void printEnrolmentDetails() {
        System.out.println("Student ID: " + studentId + " | Course ID: " + courseId + " | Enrolment Date: " + enrolmentDate);
    }
}

