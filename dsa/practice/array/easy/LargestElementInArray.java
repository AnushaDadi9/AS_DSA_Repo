package dsa.practice.array.easy;

import com.dsa.practice.QuickSort;

public class LargestElementInArray {
	
	// Brutforce solution -> first sort the array and get n-1th index value
	int[] quicksort(int[] arr, int low, int high) {
		if(low>=high) {
			return arr;
		}
		int pivot = sort(arr, low, high);
		quicksort(arr,low,pivot-1);
		quicksort(arr, pivot+1,high);
		
		return arr;
	}
	int sort(int arr[], int low, int high) {
		int p = arr[0];
		int i = low;
		int j= high;
		
		while(i<j) {
			while(arr[i]<=p && i<high) {
				i++;
			}
			while(arr[j]>p && j>low) {
				j--;
			}
			if(i<j) {
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
	
	public int largestElementBrutforce(int[] nums) {
	   return nums[nums.length-1];
	   
	}
	 public static void main(String[] args) {
		 LargestElementInArray sol = new LargestElementInArray();
	        int[] input = {4, 2, 6, 1, 5, 3, 4, 7, 9};
	        int[] sorted = sol.quicksort(input,0,input.length-1);

	        System.out.print("Sorted array: ");
	        for (int num : sorted) {
	            System.out.print(num + " ");
	            
	        }
	        System.out.println("\n");
	       int res =  sol.largestElementBrutforce(sorted);
	       
	       int res2 = sol.largestElementOptimal(input);
	       
	       System.out.println("BrutForce ouput :" +res);
	       
	       System.out.println("Optimal way :" +res2);
	    }
	 //For sorting I have used Quick sort algorithm, the TC -> O(NlogN) and SC -> O91)
	 
	 
	 //Below is the optimal way to find out largest element in an array
	
	    public int largestElementOptimal(int[] nums) {
	           int largest = nums[0];
	           for(int i=1;i<=nums.length-1;i++){
	            if(nums[i]>largest){
	                largest = nums[i];
	            }
	           }
	           return largest;
    }

}
