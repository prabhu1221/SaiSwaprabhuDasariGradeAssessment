package com.greatlearning.datastorage;

public class Employee {
	private String firstName;
	private String lastName;
	private String departmentName;
	private int depch; // depch is a variable that takes input from the user as the option
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(int depch) {
		switch(depch) {
		case 1: 
			departmentName = "Technical";
			break;
		case 2: 
			departmentName = "Admin";
			break;
		case 3:
			departmentName = "Human Resources";
			break;
		case 4:
			departmentName = "Legal";
			break;
		default:
			System.out.println("Please enter the correct department");
			System.exit(1);
		}
	}
  
}
