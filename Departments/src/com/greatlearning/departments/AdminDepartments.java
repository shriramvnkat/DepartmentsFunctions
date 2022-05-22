package com.greatlearning.departments;

public class AdminDepartments extends SuperDepartments {
	//Method to return the department name
	@Override
	public String departmentName() {
		return "Admin Department";
	}	
	@Override
	//Method to return About Todays Work
	public String getTodaysWork() {
		return "Complete your documents submission";
	}
	@Override
	//Method to return WorkDeadline info
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	//Method to return holiday info
	public String isTodayHoliday() {
		return "Today is not holiday";
	}
	@Override
	//Method to return holiday info
	public String isTodayAHoliday() {
		return "Today is not holiday";
	}
}
