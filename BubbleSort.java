package com.dsa.practice;

/*
BubbleSort
it push maximum value to the last place by comparing adjusent values
step 1 -> if(arr[0] >  arr[1]) -> swap both, and compare 1,2 index... repeate(0-n-1)
step 2 -> if(arr[0] > arr[1]) -> swap both, -- (0-n-2)
step 3 -> .... -> repeate this step (0-n-3)
----
---
*/
public class BubbleSort {
	    public int[] sortArray(int[] nums) {
	        int didswap =0;
	       for(int i = nums.length-1;i>=1;i--){
	        
	        for(int j=0;j<=i-1;j++){
	           if( nums[j] > nums[j+1]){
	            int temp = nums[j];
	            nums[j] = nums[j+1];
	            nums[j+1] = temp;
	            didswap = 1;
	           }
	           if(didswap==0){
	            break;
	           }
	        }
	       }
	       return nums; 
	    }
}
