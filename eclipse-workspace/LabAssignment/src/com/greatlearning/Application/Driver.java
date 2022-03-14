package com.greatlearning.Application;

import java.util.Scanner;

import com.greatlearning.Service.CredentialService;
import com.greatlearning.datastorage.Employee;

public class Driver {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your First Name: ");
      String firstName = sc.nextLine();
      System.out.println("Please enter your Last Name: ");
      String lastName = sc.nextLine();
      System.out.println("Please enter the option for the department. \n 1: Technical \n 2: Admin \n 3: Human Resources \n 4: Legal");
      int depch = sc.nextInt();
      Employee emp = new Employee();
      emp.setDepartmentName(depch);
      CredentialService credential = new CredentialService();
      String emailId = credential.generateEmail(firstName, lastName, emp.getDepartmentName());
      char [] password = credential.generatePassword();
	credential.display(emailId, password, lastName);
	sc.close();
	}
  
}
