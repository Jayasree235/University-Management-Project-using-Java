package com.codegnan.university.management;

public class Course {
	private String title;//variable purpose is title of Course.
	
	//constructor
	public Course(String title) {
		this.title=title;
	}
	//getter method to retrieve the course title - return
	public  String getTitle() {
		return title; //return course title
	}
	
	//override to string method to provide a string representation of the course
	@Override
	public String toString() {
		return title;//return course title as per the string representation.
	}
	
}
