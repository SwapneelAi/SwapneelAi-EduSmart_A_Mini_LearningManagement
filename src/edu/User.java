package edu;

abstract class User {
	// Instance variables
	private String name;
	private String email;
	private int userId;
	
	
	// parameterized constructor
	User(String name, String email, int userId){
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	
	// Getter for name
	public String getName() {
		return name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for email
	public String getEmail() {
		return email;
	}
	
	// Setter for email
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Getter for userId
	public int getUserId() {
		return userId;
	}
	
	// Setter for userId
	public void setUserId(int userId) {
		this.userId =userId;
	}
	
	// abstract method -> only declaration of method in abstract class
	public abstract void viewProfile();
	
	// concrete method
	final void displayWelcome() {
		System.out.println("\nWelcome to EduSmart LMS, " + name + "!");
	}
}
