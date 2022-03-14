package com.greatlearning.Service;
import java.util.Random;

public class CredentialService {
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String special = "!@#$%^&*()_-";
		
	 public String  generateEmail(String firstname, String lastname,String Department){
	    String emailId;
	    emailId = (firstname.toLowerCase()).replaceAll(" ", "") + lastname.toLowerCase() + "@" + (Department.toLowerCase()).replaceAll(" ", "") + ".abc.com";
	    return emailId;
	 }
	 
	 public char[] generatePassword() {
		 int length = 8;
        String allowedChars = capital+small+special;
		 char [] password = new char[length];
		 Random random = new Random();
	    for(int i=0;i<length;i++) {
	    	int randomIndex = random.nextInt(allowedChars.length());
	    	password[i] = allowedChars.charAt(randomIndex);
	    }
	    return password;
	 }
	  public void display(String emailId,char[] password,String lastName) {
		  System.out.println("Dear " + lastName + " your generated credentials are as follows");
		  System.out.println("Email ------> " +emailId);
		  System.out.println("Password -----> " +new String(password));
	  }
   
    }
