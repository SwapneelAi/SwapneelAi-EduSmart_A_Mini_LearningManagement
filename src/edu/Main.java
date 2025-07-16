package edu;

public class Main {

	public static void main(String[] args) {

		// Create Students
//		Student st1 = new Student("Swapneel", "swapneel@gmail.com", 101, "Maths", "Science");
//		st1.viewProfile();
//		Student st2 = new Student("Shiv", "shiv@gmail.com", 102, "English", "History");
//		st2.viewProfile();

		// Create Students
		Student st1 = new Student("Swapneel", "swapneel@gmail.com", 101, "", "");
		Student st2 = new Student("Shiv", "shiv@gmail.com", 102, "", "");

//		// Create Instructors
//		Instructor in1 = new Instructor("Mr. Ganesh", "ganesh@yahoo.com", 10, "Java", "C++");
//		in1.viewProfile();
//		Instructor in2 = new Instructor("Mr. Ravi", "ravi@yahoo.com", 11, "Python", "Go");
//		in2.viewProfile();

		// Create Instructors
		Instructor in1 = new Instructor("Mr. Ganesh", "ganesh@yahoo.com", 10, "", "");
		Instructor in2 = new Instructor("Mr. Ravi", "ravi@yahoo.com", 11, "", "");

		// Create Admin
//		Admin admin = new Admin("Admin1", "admin@edu.com", 999);
//		admin.viewProfile();
		Admin admin = new Admin("Admin1", "admin@edu.com", 999);

		// Instructors create courses
		System.out.println(in1.createCourse("Java Programming"));
		System.out.println(in1.createCourse("Data Structures"));
		System.out.println(in2.createCourse("Web Development"));
		System.out.println(in2.createCourse("Database Systems"));

		// Create Course objects
		Course c1 = new Course("Java Programming", 40, 30);
		Course c2 = new Course("Data Structures", 35, 25);
		Course c3 = new Course("Web Development");
		Course c4 = new Course("Database Systems", 30, 20);

		// Students enroll
		System.out.println(st1.enrollCourse("Java Programming"));
		System.out.println(st1.enrollCourse("Web Development"));
		System.out.println(st2.enrollCourse("Data Structures"));
		System.out.println(st2.enrollCourse("Database Systems"));

		// Display user profiles
		st1.displayWelcome();
		st1.viewProfile();
		st2.viewProfile();
		in1.viewProfile();
		in2.viewProfile();
		admin.viewProfile();

		// Students track progress
		st1.trackProgress();
		st2.trackProgress();

		// Admin removes user
		admin.removeUser(st2);

		// Show course details
		System.out.println();
		c1.showCourseDetails();
		c2.showCourseDetails();
		c3.showCourseDetails();
		c4.showCourseDetails();

	}

}
