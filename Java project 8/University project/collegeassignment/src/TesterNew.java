package universityproject;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *Student ID: 2224755
 * @author Naveed Sabir
 * @version 12/05/2023
 *
 */
	public class TesterNew {
	    private static College college = new College();

	    /**
	     * 
	     * @param args for main to work
	     */
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	        	// Top border
	        	System.out.format("+----+------------------------------------------+%n");
	        	// Table header
	        	System.out.format("|%-4s|%-42s|%n", "", "SELECT FROM MENU");
	        	// Table separator
	        	System.out.format("+----+------------------------------------------+%n");
	        	// Table rows
	        	System.out.format("|%-4s|%-42s|%n", "", "SET A OPTIONS");
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4d|%-42s|%n", 1, "Add a new student");
	        	System.out.format("|%-4d|%-42s|%n", 2, "Print student details by ID");
	        	System.out.format("|%-4d|%-42s|%n", 3, "Print all students");
	        	System.out.format("|%-4d|%-42s|%n", 4, "Add a new course");
	        	System.out.format("|%-4d|%-42s|%n", 5, "Print course details by ID");
	        	System.out.format("|%-4d|%-42s|%n", 6, "Print all courses");
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4s|%-42s|%n", "", "SET B OPTIONS");
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4d|%-42s|%n", 7, "Get student by ID");
	        	System.out.format("|%-4d|%-42s|%n", 8, "Search and print students by surname");
	        	System.out.format("|%-4d|%-42s|%n", 9, "Remove student by ID");
	        	System.out.format("|%-4d|%-42s|%n", 10, "Get course by ID");
	        	System.out.format("|%-4d|%-42s|%n", 11, "Remove course by ID");
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4s|%-42s|%n", "", "SET C OPTIONS");
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4d|%-42s|%n", 12, "Add enrolment");
	        	System.out.format("|%-4d|%-42s|%n", 13, "Remove enrolment");
	        	System.out.format("|%-4d|%-42s|%n", 14, "Print enrolment list");
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4s|%-42s|%n", "", "SET D OPTIONS");
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4d|%-42s|%n", 15, "Print enrollments by date range");
	        	System.out.format("|%-4d|%-42s|%n", 16, "Search and print course by search");
	        	// Table bottom border
	        	System.out.format("+----+------------------------------------------+%n");
	        	System.out.format("|%-4d|%-42s|%n", 17, "Exit");
	        	System.out.format("+----+------------------------------------------+%n");


	        	
//	            System.out.println("Please select an option:");
//	            System.out.println("1. Add a new student");
//	            System.out.println("2. Print student details by ID");
//	            System.out.println("3. Print all students");
//	            System.out.println("4. Add a new course");
//	            System.out.println("5. Print course details by ID");
//	            System.out.println("6. Print all courses");
//	            System.out.println("7. Get student by ID");
//	            System.out.println("8. Search and print students by surname");
//	            System.out.println("9. Remove student by ID");
//	            System.out.println("10. Get course by ID");
//	            System.out.println("11. Remove course by ID");
//	            System.out.println("12. Add enrolment");
//	            System.out.println("13. Remove enrolment");
//	            System.out.println("14. Print enrolment list");
//	            System.out.println("15. Print enrollments by date range");
//	            System.out.println("16. Search and print course by search");
//	            System.out.println("17. Exit");
	            choice = scanner.nextInt();

	            /**
	             * choice 1 by using scanner the user inputs the details needed
	             * for the new student to be added
	             */
	            if (choice == 1) 
	            {
	            	System.out.println("Please enter the student's first name:");
	            	String firstName = scanner.next();

	            	System.out.println("Please enter the student's last name:");
	            	String lastName = scanner.next();
                
	            	System.out.println("Please enter the student's phone number:");
	            	String phoneNumber = scanner.next();
	            	college.addStudent(firstName, lastName, phoneNumber);
	            	System.out.format("%n%s%n%n", "Student added successfully.");
	            } 
	            /**
	             * choice 2 the details of the student are printed by the ID
	             */
	            else if (choice == 2) {
	            	college.printStudentDetailsById();
	            } 
	            /**
	             * choice 3 prints all students 
	             */
	            else if (choice == 3) {
	                college.printAllStudents();
	            } 
	            /**
	             * choice 4 using scanner the user inputs all the details asked
	             * so a new course can be added
	             */
	            else if (choice == 4) {
	            	
	            	Scanner s0 = new Scanner(System.in);
	            	System.out.println("Please enter the course name:");
                    String Title = s0.nextLine();
                    
                    Scanner s1 = new Scanner(System.in);
                    
                    System.out.println("Please enter the course fee:");
                    double Fee = s1.nextDouble();
                    
                    Scanner s2 = new Scanner(System.in);
                    System.out.println("Please enter the course id:");
                    int courseId = s2.nextInt();
                    
                    System.out.format("\n%n%s%n%n", "Student added successfully.\n");
                    college.addCourse(courseId, Title, Fee);
	            } 
	            /**
	             * choice 5 the details of the course by id are printed
	             */
	            else if (choice == 5) {
	            	college.printCourseDetailsById();
	            } 
	            /**
	             * choice 6 prints all courses
	             */
	            else if (choice == 6) {
	            	college.printAllCourses();
	            } 
	            /**
	             * choice 7 searches student by the id after the user input
	             */
	            else if (choice == 7) {
	            	System.out.println("\nPlease enter the student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    Student student = college.getStudentById(id);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
	            } 
	            /**
	             * choice 8 after the user input is done it searches for the
	             * surname in the students created and prints it
	             */
	            else if (choice == 8) {
	            	Scanner s6 = new Scanner(System.in);
	            	System.out.println("\"%n%s%n%n\"Please enter the student's last name:");
                    String surname = s6.next();
                    college.searchAndPrintStudentsBySurname(surname);
	            } 
	            /**
	             * choice 9 removes a student after the user chooses the id
	             */
	            else if (choice == 9) {
	            	System.out.println("\"%n%s%n%n\"Please enter the student ID:");
                    int id0 = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    college.removeStudentById(id0);
	            } 
	            /**
	             * choice 10 after the user input for the course id
	             * it prints the course
	             */
	            else if (choice == 10) {
	            	System.out.println("\"%n%s%n%n\"Please enter the course ID:");
                    int id1 = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    Course course = college.getCourseById(id1);
                    if (course != null) {
                        System.out.println(course);
                    } else {
                        System.out.println("Course not found.");
                    }
                    college.getCourseById(id1);
	            }
	            /**
	             * choice 11 removes a course after the user chooses the id
	             */
	            else if (choice == 11) {
	            	System.out.println("\"%n%s%n%n\"Please enter the course ID:");
                    int id2 = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    boolean success = college.removeCourseById(id2);
                    if (success) {
                        System.out.println("Course removed successfully.");
                    } else {
                        System.out.println("Course not found.");
                    }
                    college.removeCourseById(id2);
	            } 
	            /**
	             * choice 12 after the user input is done
	             * it adds an enrolment to a course
	             */
	            else if (choice == 12) {
	            	System.out.println("\"%n%s%n%n\"Please enter the student ID:");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    System.out.println("\"%n%s%n%n\"Please enter the course ID:");
                    int courseId2 = scanner.nextInt();
                    college.addEnrolment(studentId, courseId2);
	            } 
	            /**
	             * choice 13 after user input is done 
	             * it removes an enrolment
	             */
	            else if (choice == 13) {
	            	Scanner input = new Scanner(System.in);
                    System.out.print("Enter student ID: ");
                    int studentID = scanner.nextInt();
                    System.out.print("Enter course ID: ");
                    int courseID = scanner.nextInt();
                    college.removeEnrolment(studentID,courseID);
	            } 
	            /**
	             * choice 14 prints all the enrolments
	             */
	            else if (choice == 14) {
	            	
	            	college.printEnrolmentList();
	            } 
	            /**
	             * choice 15 after user input is done for the date range 
	             * it prints the enrolment that took place in between that
	             * date range
	             */
	            else if (choice == 15) {
	            	System.out.println("\"%n%s%n%n\"Please enter the start date (yyyy-MM-dd):");
                    
                    int year = scanner.nextInt();
                    int month = scanner.nextInt();
                    int date = scanner.nextInt();
                    LocalDate startDate = LocalDate.of(year, month, date);

                    System.out.println("\"%n%s%n%n\"Please enter the end date (yyyy-MM-dd):");
                    LocalDate endDate = LocalDate.now();
                    college.printEnrollmentsByDateRange(startDate, endDate);
	            	//college.printEnrollmentsByDateRange(scanner);
	            }
	            /**
	             * choice 16 after the user input it searches a course by title
	             */
	            else if (choice == 16) {
	            	Scanner s9 = new Scanner(System.in);
	            	System.out.println("\"%n%s%n%n\"Please enter the course Title: ");
                    String title = s9.next();
                    college.searchCourseByTitle(title);
	            }
	            /**
	             * Error check for the correct choice to be made
	             */
	            else {
	            	System.out.println("\nWrong option chosen. Please try again.\n");
	            }
	        } while (choice != 17);

	        scanner.close();
	    }


}
