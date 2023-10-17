package universityproject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Student ID: 2224755
 * @author Naveed Sabir
 * @version 12/05/2023
 */
public class College {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Enrolment> enrolments;
 // A variable to keep track of the last used student ID
    private int lastStudentId;

    /**
     * Create ArrayLists for student, course and enrolment
     */
    public College() {
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
        enrolments = new ArrayList<Enrolment>();
        lastStudentId = 0;
        /**
         * lastStudentId is 0 so the iteration
         * can start from 0 and iterate when a new student is added
         * The incremented number will be used for a unique student ID
         */
    }
    
    
    /**
     *
     * @param firstName to add student
     * @param lastName to add student
     * @param phoneNumber to add student
     * Adds a new student to the college records with the provided first name, last name, and phone number, and a unique ID.
     */
    public void addStudent(String firstName, String lastName, String phoneNumber)
    //This method adds a Student to the record and parameters are the First Name, the Last Name and the phone number of the student
    {
        // Increment the last used student ID and use it to create the new student's ID
        int addStudentId = ++lastStudentId;
        // Create a new student object using the constructor with the provided information and the generated ID
        Student addStudent = new Student(firstName, lastName, phoneNumber, addStudentId);
        // Add the new student object to the students ArrayList
        students.add(addStudent);
        // Return the newly created student object
        System.out.println("The assigned ID for the student is: " + addStudentId);
        //addStudent.printStudentDetails();
        return;
    }

    
    /**
     * Prints the details of a student with a given ID number.
     */
    public void printStudentDetailsById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the student ID number:");
        int studentId = scanner.nextInt();

        boolean found = false;
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                System.out.println("\nStudent Details:");
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
                System.out.println("Phone Number: " + student.getPhoneNumber());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo student found with the ID number, please try again\n " + studentId);
            printStudentDetailsById();
        }
    }
    
    /** Prints a list of all student */
    public void printAllStudents() {
        System.out.println("\nList of all students:");
            if (students.isEmpty()) {
                System.out.println("No students found.");
            } 
            else {
            	for (Student student : students)
            	{
            		System.out.println("ID: " + student.getStudentId());
                    System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
                    System.out.println("Phone Number: " + student.getPhoneNumber());
                    System.out.println();
            	}
            }
            
    }
    
    /**
     * 
     * @param courseId to add the id into the method
     * @param title to add the title into the method
     * @param enrolmentFee to add the fee into the method
     */
    public void addCourse(int courseId, String title, double enrolmentFee) {
        // Create a new course object using the constructor with the provided information
        Course newCourse = new Course(courseId, title, enrolmentFee);
        // Add the new course object to the courses ArrayList
        courses.add(newCourse);
    }
    
    /**
     * Prints the details of a course with a given ID number.
     */
    public void printCourseDetailsById() {
    	Scanner scanner = new Scanner(System.in);
        boolean found = false;
        System.out.println("\nEnter Course ID: ");
        int courseId = scanner.nextInt();
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                System.out.println("\nCourse Details:\n");
                System.out.println("ID: " + course.getCourseId());
                System.out.println("Title: " + course.getTitle());
                System.out.println("Enrolment Fee: $" + course.getEnrolmentFee());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No course found with the ID number " + courseId);
            printCourseDetailsById();
        }
    }
    
    /** Prints a list of all courses */
    public void printAllCourses() {
        System.out.println("\nList of all courses:\n");
        for (Course course : courses) {
            System.out.println("ID: " + course.getCourseId());
            System.out.println("Title: " + course.getTitle());
            System.out.println("Enrolment Fee: $" + course.getEnrolmentFee());
            System.out.println();
        }
    }

    /**
     * Returns the student object with the given ID number.
     *
     * @param studentId the ID number of the student to retrieve
     * @return the student object with the given ID number, or null if no such student exists
     */
    public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        // If no student with the given ID number is found, return null
        return null;
    }

    /**
     * @param search to search in the method if the surname is included
     * in the input of scanner in TesterNew class.
     * With the help of a loop and if statement the method checks if the searched string
     * exists inside the array and verifies if its found or not.
     */
    public void searchAndPrintStudentsBySurname(String search) {
        System.out.println("\nStudents with surname containing \"" + search + "\":");
        for (Student student : students) {
            if (student.getLastName().toUpperCase().contains(search.toUpperCase())) {
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
                System.out.println("Phone Number: " + student.getPhoneNumber());
                System.out.println();
            }
            else {
            	System.out.println("Surname does not exist, try again.");
            }
        }
        
    }

    
    /**
     * 
     * @param search the course by its Title.
     * Just like in the method above, with the help of for and if the method
     * tests if the title entered is included into the array or not and
     * based on that it provides an answer.
     */
    public void searchCourseByTitle(String search) {
        System.out.println("\nCourses with Title containing \"" + search + "\":");
        for (Course course : courses) {
            if (course.getTitle().toUpperCase().contains(search.toUpperCase())) {
                System.out.println("ID: " + course.getCourseId());
                System.out.println("Title: " + course.getTitle());
                System.out.println("EnrolmentFee: " + course.getEnrolmentFee());
                System.out.println();
            }
        }
        System.out.println("\nTitle not found, please try again.\n");
    }

    /**
     * Removes a student with the given ID number from the college records.
     *
     * @param studentId the ID number of the student to remove
     * @return true if a student was removed, false otherwise
     */
    public boolean removeStudentById(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * 
     * @param courseId to get the course id so it can be searched through the array
     * @return course if found in the array
     */
    public Course getCourseById(int courseId) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        // If no course with the given ID number is found, return null
        return null;
    }

    /**
     * Removes a course with the given course ID number from the college records.
     *
     * @param courseId the ID number of the course to remove
     * @return true if a course was removed, false otherwise
     */
    public boolean removeCourseById(int courseId) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == courseId) {
                courses.remove(i);
                return true; //return True if course is removed
            }
        }
        return false; //return False if course is not removed
    }

    /**
     * 
     * @param studentId to add a new enrolment
     * @param courseId to add a new enrolment
     */
    public void addEnrolment(int studentId, int courseId) {
        Enrolment enrolment = new Enrolment(studentId, courseId, LocalDate.now());
        enrolments.add(enrolment);
        enrolment.printEnrolmentDetails();
    }

    /**
     * 
     * @param studentId to choose the student id to remove enrolment
     * @param courseId to choose the course id to remove enrolment
     */
    public void removeEnrolment(int studentId, int courseId) {
        for (Enrolment enrolment : enrolments) {
            if (enrolment.getStudentId() == studentId && enrolment.getCourseId() == courseId) {
                enrolments.remove(enrolment);
                System.out.println("\nEnrolment removed successfully.");
                return;
            }
        }
        /**
         * If the enrolment details are not correct (studentid,courseid)
         * the program will try again by prompting the user to enter details.
         */
        System.out.println("Enrolment not found. Try again.");
        removeEnrolment(studentId,courseId);
    }
    
    /**
     * the method prints all the enrolments
     * by showing all the information of the student and the course
     * the student was enrolled in.
     */
    public void printEnrolmentList() {
        for (Enrolment enrolment : enrolments) {
            Student student = getStudentById(enrolment.getStudentId());
            Course course = getCourseById(enrolment.getCourseId());
            System.out.println("\nEnrolment details:");
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + " (ID: " + student.getStudentId() + ")");
            System.out.println("Course: " + course.getTitle() + " (ID: " + course.getCourseId() + ")");
        }
    }
    
    /**
     * 
     * @param startDate for the method to receive the first date of the range
     * @param endDate for the method to receive the second date of the range
     * The method loops through the enrolments arraylist and checks if in the range
     * given there are any enrolments and then prints it.
     */
    public void printEnrollmentsByDateRange(LocalDate startDate, LocalDate endDate) {
        System.out.println("Enrollments between " + startDate + " and " + endDate + ":");
        for (Enrolment enrollment : enrolments) {
            LocalDate enrollmentDate = enrollment.getEnrolmentDate();
            if (enrollmentDate.isAfter(startDate) && enrollmentDate.isBefore(endDate)||enrollmentDate.equals(endDate)) {
                int studentID = enrollment.getStudentId();
                int courseID = enrollment.getCourseId();
                System.out.printf("%s enrolled in '%s' on %s%n", studentID, courseID, enrollmentDate);
            }
        }
    }

    
}


