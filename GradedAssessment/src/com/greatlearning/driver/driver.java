package com.greatlearning.driver;
import java.util.*;
class MyComparator implements Comparator

{

    public int compare(Object obj1,Object obj2)

    {

     Integer i1=(Integer)obj1;

     Integer i2=(Integer)obj2;

     return i2.compareTo(i1);

    }

}


public class driver {

	public static void main(String[] args) {
		
		     Scanner sc=new Scanner(System.in);
             System.out.println("Please enter the total number of floors: ");
             int n=sc.nextInt();

		     int max=n;

		     Queue<Integer> queue=new PriorityQueue<Integer>(new MyComparator());

		     int disks[]=new int[n];

		     for(int i=1;i<=n;i++)

		     {
               System.out.println("Please enter the floor size given on day " +i);
		      disks[i]=sc.nextInt();
		      queue.add(disks[i]);
		     }
		      System.out.println("The order of construction is as follows:");
 
		      while(!queue.isEmpty() && queue.peek()==max)

		        {
                   for(int i=1;i<=n;i++) {
                	   if(disks[i] == max) {
		   
                   System.out.println("Day " +i);
                   
		          System.out.println(queue.poll() + " ");

		          max--;
                	   }
		         }
		        }
		      }

		   }
