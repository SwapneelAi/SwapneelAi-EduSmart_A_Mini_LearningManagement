package edu;

public class Admin extends User{

	// Parameterized constructor
	Admin(String name, String email, int userId) {
		super(name, email, userId);
	}
	
	// Method 
	public void removeUser(User user) {
		System.out.println("Admin removed user: " + user.getName());
	}

	// Implementation of abstract method
	@Override
	public void viewProfile() {
		System.out.println("----- Admin Profile -----");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("User ID: " + getUserId());
	}

}
