package edu;

public class Course {
	// Instance variables
	private String title;
	private int durationInHour;
	private final int maxStudents;
	
	 // Constructor 1: Accepts title, duration, and maxStudents
	public Course(String title, int durationInHour, int maxStudents){
		this.title = title;
		this.durationInHour = durationInHour;
		this.maxStudents = maxStudents;
	}
	
	  // Constructor 2: Accepts only title
	public Course(String title){
		this.title = title;
		this.durationInHour = 20;	// Default value
		this.maxStudents = 100;		// Default value
		// this (title, 0, 100);	// can write
	}
	
	 // Getter for title
	public String getTitle() {
		return title;
	}

	 // Setter for title
	public void setTitle(String title) {
		this.title = title;
	}

	 // Getter for getDurationInHour
	public int getDurationInHour() {
		return durationInHour;
	}

	// Setter for getDurationInHour
	public void setDurationInHour(int durationInHour) {
		this.durationInHour = durationInHour;
	}

	// Getter for maxStudents (no setter because it's final)
	public int getMaxStudents() {
		return maxStudents;
	}
	
	
	// Method
	public void showCourseDetails() {
		System.out.println("----- Course Details -----");
        System.out.println("Title: " + title);
        System.out.println("Duration: " + durationInHour + " hours");
        System.out.println("Max Students: " + maxStudents);
	}
}