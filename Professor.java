package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private String name;
	private List<Course> assignedCourses; //List to hold courses assigned to the professor
	
	public Professor(String name) {
		this.name = name; //set professor name
		this.assignedCourses=new ArrayList();//initialize the list of assigned courses as an Empty list
	}
	
	//Getter method to retrieve the professor name
	public String getName() {
		return name;
	}

	//method to assign a course to the professor
	public void assignCourse(Course course) {
		
		//check if the course is not already in the list of assigned courses
		if(!assignedCourses.contains(course)) { //contains check the course whether it is in assignedCourse or not
			assignedCourses.add(course); //add the course to the list if not already present.
		}
	}
	
//Getter method to retrieve the list of course assigned to the professor
	public List<Course> getassignedCourses(){
		return assignedCourses; //return the list of assigned courses.
	}
	
	//override toString method to provide string representation to the professor
	public String toString() {
		return name; //return the professor name as the String representation.
	}
}

















