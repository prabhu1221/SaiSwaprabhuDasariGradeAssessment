package com.greatlearning.department;

public class adminDepartment extends superDepartment {
	public String departmentName() {
		  String departName = "Admin Department";
		  return departName;
	  }
	  public String getTodaysWork() {
		  String workDetails;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
             workDetails = "Complete your documents Submission";
		  }
		  else {
			  workDetails = "Enjoy the weekend";
		  }
		  return workDetails;
	  }
	  public String getWorkDeadline() {
		  String workDeadline;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
			   workDeadline = "Complete by EOD ";
		  }
		  else {
			  workDeadline = "Complete by EOD of the next working day";
		  }
		  return workDeadline;
	  }
}
