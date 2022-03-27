package com.greatlearning.department;

public class techDepartment extends superDepartment{
	public String departmentName() {
		  String departName = "Tech Department";
		  return departName;
	  }
	  public String getTodaysWork() {
		  String workDetails;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
		  workDetails = "Complete coding of module 1";
		  }
		  else {
			  workDetails = "Enjoy the weekend";
		  }
		  return workDetails;
	  }
	  public String getWorkDeadline() {
		  String workDeadline;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
			  workDeadline  = "Complete by EOD ";
		  }
		  else {
			  workDeadline = "Enjoy the weekend";
		  }
		  return workDeadline;
	  }
	  public String getTechStackInformation() {
		  String info;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
			  info  = "Core Java ";
		  }
		  else {
			  return null;
		  }
		  return info;
	  }
}
