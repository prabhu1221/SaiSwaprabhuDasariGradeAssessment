package com.greatlearning.department;

import java.text.DateFormatSymbols;
import java.util.Calendar;

public class superDepartment {
	  public String departmentName() {
		  String departName = "Super Department";
		  return departName;
	  }
	  public String getTodaysWork() {
		  String workDetails = "No work as of now";
		  return workDetails;
	  }
	  public String getWorkDeadline() {
		  String workDeadline = "Nil";
		  return workDeadline;
	  }
	  public String isTodayAHoliday() {
		  String dayNames[] = new DateFormatSymbols().getWeekdays();
		  Calendar date = Calendar.getInstance();
		  String status;
		  String day = dayNames[Calendar.DAY_OF_WEEK];
		  if (day == "Saturday" || day == "Sunday") {
			  status = "Today is a holiday";
		  }
		  else {
			status = "Today is not a holiday";  
		  }
		return status;  
	  }

}
