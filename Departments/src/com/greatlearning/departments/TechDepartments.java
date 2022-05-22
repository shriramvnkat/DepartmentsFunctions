package com.greatlearning.departments;

public class TechDepartments extends SuperDepartments {
	//Method to return the department name
		@Override
		public String departmentName() {
			return "Tech Department";
		}	
		//Method to return About Todays Work
		@Override
		public String getTodaysWork() {
			return "Complete coding of module1";
		}
		//Method to return WorkDeadline info
		@Override
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		//Method to return TECH stack info
		public String getTechStackInformation() {
			return "Core Java";
		}
		@Override
		//Method to return holiday info
		public String isTodayAHoliday() {
			return "Today is not holiday";
		}
}
