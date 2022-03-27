package com.greatlearning.department;

public class hrDepartment extends superDepartment {
	public String departmentName() {
		  String departName = "HR Department";
		  return departName;
	  }
	  public String getTodaysWork() {
		  String workDetails;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
              workDetails = "Fill today’s worksheet and mark your attendance";
		  }
		  else {
			  workDetails = "No work as this is a weekend";
		  }
		  return workDetails;
	  }
	  public String getWorkDeadline() {
		  String workDeadline;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
             workDeadline = "Complete by EOD ";
		  }
		  else {
			  workDeadline = "Complete by the EOD of the next working day";
		  }
		  return workDeadline;
	  }
	  public String doActivity() {
		  String activityDetails;
		  if (super.isTodayAHoliday()!= "Today is a holiday") {
			  activityDetails = "Team Lunch";
		  }
		  else {
			  activityDetails = "Team Lunch is in next Working day";
		  }
		  return activityDetails;
	  }
}
