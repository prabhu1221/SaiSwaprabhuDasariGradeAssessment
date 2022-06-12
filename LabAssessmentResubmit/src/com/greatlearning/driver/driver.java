package com.greatlearning.driver;

import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class driver {

	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building");
		int noOfFloor = sc.nextInt();
		int floors[] = new int[noOfFloor];
		
		for(int i=0;i<noOfFloor;i++) {
			System.out.println("Enter the floor size for the given day:" +(i+1));
			floors[i] = sc.nextInt();
		}
		System.out.println();
		Service service = new Service();
		service.printConstructionTable(floors, noOfFloor);
	}
}
