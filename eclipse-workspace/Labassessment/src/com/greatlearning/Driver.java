package com.greatlearning;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the number of denominations:");
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       System.out.println("Enter the denominations");
       int denominations[]= new int[n];
       for(int i=0;i<n;i++) {
    	   denominations[i]= sc.nextInt();
       }
       System.out.println("Enter the amount: ");
       int sum= sc.nextInt();
       int lower=0;
       int upper= denominations.length-1;
       
       // sort array using merge sort
       mergeSort.mergeSort(denominations,lower,upper);
       int count[]= new int[denominations.length];
       for(int i=0;i<denominations.length;i++) {
    	   if(sum>=denominations[i]) {
    		   int x= sum/denominations[i];
    		   sum=sum-(denominations[i]*x);
    		   count[i]=x;
    	   }
       }
       if(sum>0) {
    	   System.out.println("Not possible for payment");
       }
       else {
    	   System.out.println("Your payment is done with min number of notes as below");
    	   for(int i=0;i<count.length;i++) {
    		   System.out.println(denominations[i] +":" +count[i]);
    	   }
       }
	}
}
