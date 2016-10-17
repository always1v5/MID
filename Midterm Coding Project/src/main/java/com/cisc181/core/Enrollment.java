package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	UUID SectionID;
	UUID StudentID; 
	UUID EnrollmentID;
	double Grade;
	
	 private Enrollment(){
		
		this.EnrollmentID = getEnrollmentID(); 
		
	}
	
	
	private UUID getEnrollmentID() {
		
		return this.EnrollmentID ;
	}


	public UUID getSectionID() {
		return this.SectionID;
	}


	public void setSectionID(UUID sectionID) {
		this.SectionID = sectionID;
	}


	public UUID getStudentID() {
		return this.StudentID;
	}


	public void setStudentID(UUID studentID) {
		this.StudentID = studentID;
	}


	public double getGrade() {
		return this.Grade;
	}


	public void setEnrollmentID(UUID enrollmentID) {
		this.EnrollmentID = enrollmentID;
	}


	Enrollment(UUID SectionID, UUID StudentID ){
		this();
		
		this.StudentID = StudentID;
		
		this.SectionID = SectionID;
		
	}
	
	void setGrade(double Grade){
		 this.Grade = Grade;
		
	}
	
}
