package com.greatlearning.departments;

public class HumanResourcesDepartment extends SuperDepartments {
	//Method to return the department name
	@Override
	public String departmentName() {
		return "Human Resources Department";
	}	
	@Override
	//Method to return About Todays Work
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendence";
	}
	@Override
	//Method to return WorkDeadline info
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	//Method to Return Activity info
	public String doActivity() {
		return "Team Lunch";
	}
	@Override
	//Method to return holiday info
	public String isTodayAHoliday() {
		return "Today is not holiday";
	}
}
