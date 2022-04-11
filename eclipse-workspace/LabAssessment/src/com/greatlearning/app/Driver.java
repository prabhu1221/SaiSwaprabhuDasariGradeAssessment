package com.greatlearning.app;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
    
    	int transaction[],target,sum=0,size,i;
    	boolean flag= false;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the size of the transaction array:");
    	size = sc.nextInt();
    	transaction = new int[size];
    	System.out.println("Enter the transaction values:");
    	for (i=0;i<size;i++) {
    		transaction[i]= sc.nextInt(); 
    	}
    	System.out.println("Enter the total number of targets that need to be achieved:");
    	int targetNum = sc.nextInt();
    	while(targetNum-- != 0) {
    	System.out.println("Enter the target value");
    	target= sc.nextInt();
    	for(i=0;i<size;i++) {
    		sum+=transaction[i];
    		if(sum >= target) {
    			flag=true;
    			break;
    		}
    	}
    		if(flag)
    			System.out.println("Target was achieved after "+(i+1)+" transaction");
    		else
    			System.out.println("Target was not achieved");
    	}
    sc.close();
    }
}
