package edu;

public class Instructor extends User {

	private String createdCourse1;
	private String createdCourse2;

	Instructor(String name, String email, int userId, String createdCourse1, String createdCourse2) {
		super(name, email, userId);
		this.createdCourse1 = createdCourse1;
		this.createdCourse2 = createdCourse2;
	}

	// Getter & Setter
	public String getCreatedCourse1() {
		return createdCourse1;
	}

	public void setCreatedCourse1(String createdCourse1) {
		this.createdCourse1 = createdCourse1;
	}

	public String getCreatedCourse2() {
		return createdCourse2;
	}

	public void setCreatedCourse2(String createdCourse2) {
		this.createdCourse2 = createdCourse2;
	}

	// Method
	public String createCourse(String courseName) {
		if (createdCourse1 == null || createdCourse1.isEmpty()) {
			this.createdCourse1 = courseName;
			return getName() + " created course " + courseName;
		} else if (createdCourse2 == null || createdCourse2.isEmpty()) {
			this.createdCourse2 = courseName;
			return getName() + " created course " + courseName;
		} else {
			return getName() + " has already created 2 courses.";
		}
	}

	// Implementation of abstract method
	@Override
	public void viewProfile() {
		System.out.println("----- Instructor Profile -----");
		System.out.println("Name: " + getName());
		System.out.println("Email: " + getEmail());
		System.out.println("User ID: " + getUserId());
		System.out.println("Created Course 1: " + (createdCourse1 == null ? "None" : createdCourse1));
		System.out.println("Created Course 2: " + (createdCourse2 == null ? "None" : createdCourse2));
	}

}
