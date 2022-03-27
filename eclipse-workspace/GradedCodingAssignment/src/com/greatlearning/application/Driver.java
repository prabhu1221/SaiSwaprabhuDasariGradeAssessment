package com.greatlearning.application;

import com.greatlearning.department.adminDepartment;
import com.greatlearning.department.hrDepartment;
import com.greatlearning.department.techDepartment;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         hrDepartment hrdept = new hrDepartment();
         System.out.println("Welcome to "+hrdept.departmentName());
         System.out.println(hrdept.getTodaysWork());
         System.out.println(hrdept.getWorkDeadline());
         System.out.println(hrdept.doActivity());
         System.out.println(hrdept.isTodayAHoliday());
         techDepartment techdept = new techDepartment();
         System.out.println("Welcome to "+techdept.departmentName());
         System.out.println(techdept.getTodaysWork());
         System.out.println(techdept.getWorkDeadline());
         System.out.println(techdept.getTechStackInformation());
         System.out.println(techdept.isTodayAHoliday());
         adminDepartment admindept = new adminDepartment();
         System.out.println("Welcome to "+admindept.departmentName());
         System.out.println(admindept.getTodaysWork());
         System.out.println(admindept.getWorkDeadline());
         System.out.println(admindept.isTodayAHoliday()); 
	}

}
