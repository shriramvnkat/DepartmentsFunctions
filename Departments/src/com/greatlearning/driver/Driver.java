package com.greatlearning.driver;

import com.greatlearning.departments.AdminDepartments;
import com.greatlearning.departments.HumanResourcesDepartment;
import com.greatlearning.departments.TechDepartments;

public class Driver {
	public static void main(String args[]) {
		//Invoke AdminDepart Functionality
		AdminDepartments adminDepart = new AdminDepartments();
		System.out.println("-------------- Admin Departments -----------------");
		System.out.println("Welcome To "+ adminDepart.departmentName());
		System.out.println("Todays Work " + adminDepart.getTodaysWork());
		System.out.println("Deadline is "+adminDepart.getWorkDeadline());
		System.out.println("Holiday is "+adminDepart.isTodayAHoliday());
		//Invoke Technology Department Functionality
		TechDepartments techDepart =  new TechDepartments();
		System.out.println("-------------- Technology Departments -----------------");
		System.out.println("Welcome To "+ techDepart.departmentName());
		System.out.println("Todays Work " + techDepart.getTodaysWork());
		System.out.println("Deadline is "+techDepart.getWorkDeadline());
		System.out.println("Holiday is "+techDepart.isTodayAHoliday());
		System.out.println("Technology Stack "+techDepart.getTechStackInformation());
		//Invoke HR Department Functionality
		HumanResourcesDepartment hrDepart = new HumanResourcesDepartment();
		System.out.println("-------------- Human Resources Departments -----------------");
		System.out.println("Welcome To "+ hrDepart.departmentName());
		System.out.println("Todays Work " + hrDepart.getTodaysWork());
		System.out.println("Deadline is "+hrDepart.getWorkDeadline());
		System.out.println("Holiday is "+hrDepart.isTodayAHoliday());
	}
}
