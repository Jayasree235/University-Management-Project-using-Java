package com.codegnan.university.management;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;  //name of student
	private List<Course> enrolledCourses; //list to hold courses the student enrolled in

	public Student(String name) {
		this.name= name;
		this.enrolledCourses = new ArrayList();
	}
	
	//getter method to retrieve the student's name
	public String getName() {
		return name;
	}
	
	//method to enroll the student in course
	public void enrolledInCourse(Course course) {
		//check if course is not already in list of enrolled courses
		if(!enrolledCourses.contains(course)) {
			enrolledCourses.add(course); //add the course to the list
		}
	}
	
	//getter method to retrieve the list of courses that student enrolledIn
	public List<Course> getEnrolledCourses(){
		return enrolledCourses;
	}
	
	//override toString method
	public String toString() {
		return name;
	}
	
}
 


