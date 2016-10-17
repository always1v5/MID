package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	
	public UUID getCourseID() {
		return this.CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	public UUID getSemesterID() {
		return this.SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return this.SectionID;
	}
	public void setSectionID(UUID sectionID) {
		this.SectionID = sectionID;
	}
	public int getRoomID() {
		return this.RoomID;
	}
	public void setRoomID(int roomID) {
		this.RoomID = roomID;
	}

	
	
	

}
