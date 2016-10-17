package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	
	
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	private UUID CourseID;
	
	
	public UUID getCourseID() {
		return this.CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	public String getCourseName() {
		return this.CourseName;
	}
	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}
	public int getGradePoints() {
		return this.GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.GradePoints = gradePoints;
	}
	public eMajor getMajor() {
		return this.Major;
	}
	public void setMajor(eMajor major) {
		this.Major = major;
	}
	
}
