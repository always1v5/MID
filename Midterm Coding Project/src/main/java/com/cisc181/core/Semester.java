package com.cisc181.core;

import java.sql.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	public UUID getSemesterID() {
		return this.SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}
	public Date getStartDate() {
		return this.StartDate;
	}
	public void setStartDate(Date startDate) {
		this.StartDate = startDate;
	}
	public Date getEndDate() {
		return this.EndDate;
	}
	public void setEndDate(Date endDate) {
		this.EndDate = endDate;
	}
	
	

}
