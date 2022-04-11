package com.greatlearning;

public class mergeSort{
	public static void merge(int array[], int lower, int middle, int upper) 
	{ 
	    int i, j, k; 
	    int left[]=new int[middle-lower+1];
	    int right[]=new int[upper-middle];
	    for (i = 0; i < middle-lower+1; i++)
	    left[i] = array[lower + i];
	    for (j = 0; j < upper-middle; j++) 
	        right[j] = array[middle + 1 + j];
	    i = 0; // initial index of sub-array left[] 
	    j = 0; // initial index of sub-array right[]
	    k = lower; //initial index of merged array 
	    for (k=lower;i < middle-lower+1 && j < upper-middle;k++) 
	    { 
	        if (left[i] > right[j]) array[k] = left[i++];
	        else array[k] = right[j++];
	    }
	    while (i < middle-lower+1) array[k++] = left[i++];
	    while (j < upper-middle) array[k++] = right[j++];
	}
	public static void mergeSort(int array[],int lower,int upper)
	 {
	     if(lower>=upper)return;
	     mergeSort(array,lower,(lower+upper)/2);
	     mergeSort(array,((lower+upper)/2)+1,upper);
	     merge(array,lower,(lower+upper)/2,upper);
	 }
}
