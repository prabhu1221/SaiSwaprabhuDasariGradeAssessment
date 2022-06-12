package com.greatlearning.driver;

import java.util.PriorityQueue;

public class Service {

	  public void printConstructionTable(int floor[],int noOfFloor) {
		  System.out.println("The order of construction is as follows:");
		  
		  PriorityQueue<Integer>queue = new PriorityQueue<>(java.util.Collections.reverseOrder());
		  int tempArray[] = new int[noOfFloor];
		  int max = noOfFloor;
		  System.out.println();
		  for(int i=0;i<noOfFloor;i++) {
			  System.out.println("Day:"+(i+1));
			  tempArray[i] = floor[i];
			  queue.add(tempArray[i]);
			  
			  while(!queue.isEmpty() && queue.peek() == max) {
				  System.out.println(queue.poll() +"");
				  max--;
			  }
			  System.out.println();
		  }
	  }
}
