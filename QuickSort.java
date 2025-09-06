package com.dsa.practice;

public class QuickSort {

	    void qs(int[] arr, int low, int high){
	        if(low>=high) {
	        	return;
	        }
	      int pivotIndex = findPivotIndex(arr, low, high);
	      qs(arr, low, pivotIndex-1);
	      qs(arr, pivotIndex+1, high); 
	        
	    }

	    int findPivotIndex(int[] arr, int low, int high){
	        int pivot = arr[low];
	        int i=low;
	        int j= high;

	        while(i<j){
	            while(arr[i]<=pivot && i<high){
	                i++;
	            }
	            while(arr[j]>pivot && j>low){
	                j--;
	            }
	            if(i<j){
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	        int temp = arr[low];
	        arr[low] = arr[j];
	        arr[j] = temp;
	       return j;
	    }
	    public int[] quickSort(int[] arr) {
	         qs(arr, 0,arr.length-1);
	         return arr;
	    }
	

	 public static void main(String[] args) {
		 QuickSort sol = new QuickSort();
	        int[] input = {4, 2, 6, 1, 5, 3, 4, 7, 9};
	        int[] sorted = sol.quickSort(input);

	        System.out.print("Sorted array: ");
	        for (int num : sorted) {
	            System.out.print(num + " ");
	        }
	    }
}
