package edu;

public class Student extends User implements ProgressTrackable {

	// Instance variables
	private String enrolledCourse1;
	private String enrolledCourse2;

	// parameterized constructor
	Student(String name, String email, int userId, String enrolledCourse1, String enrolledCourse2) {
		super(name, email, userId);
		this.enrolledCourse1 = enrolledCourse1;
		this.enrolledCourse2 = enrolledCourse2;
	}

	// Getter & Setter
	public String getEnrolledCourse1() {
		return enrolledCourse1;
	}

	public void setEnrolledCourse1(String enrolledCourse1) {
		this.enrolledCourse1 = enrolledCourse1;
	}

	public String getEnrolledCourse2() {
		return enrolledCourse2;
	}

	public void setEnrolledCourse2(String enrolledCourse2) {
		this.enrolledCourse2 = enrolledCourse2;
	}

	// Method
	public String enrollCourse(String courseName) {
		if (enrolledCourse1 == null || enrolledCourse1.isEmpty()) {
			this.enrolledCourse1 = courseName;
			return getName() + " entroll in " + courseName;
		} else if (enrolledCourse2 == null || enrolledCourse2.isEmpty()) {
			this.enrolledCourse2 = courseName;
			return getName() + " entroll in " + courseName;
		} else {
			return getName() + " is already enrolled in 2 courses.";
		}
	}

	// Implementation of abstract method
	public void viewProfile() {
		System.out.println("----- Student Profile -----");
		System.out.println("Name: " + getName());
		System.out.println("Email: " + getEmail());
		System.out.println("User ID: " + getUserId());
		System.out.println("Enrolled Course 1: " + (enrolledCourse1 == null ? "None" : enrolledCourse1));
		System.out.println("Enrolled Course 2: " + (enrolledCourse2 == null ? "None" : enrolledCourse2));
	}

	// Implementation of pure abstraction method - interface
	@Override
	public void trackProgress() {
		System.out.println(getName() + " is tracking progress...");

	}
}
