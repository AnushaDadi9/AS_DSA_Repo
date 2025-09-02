package com.dsa.practice;

import java.util.ArrayList;

public class MergeSorting {

	    public int[] sortArray(int[] nums) {
	        ms(nums,0,nums.length-1);
	        return nums;
	    }
	    void ms(int[] nums, int low, int high){
	          if(low == high) {
	            return;
	          }
	          int mid = (low + high)/2;
	          ms(nums,low,mid);
	          ms(nums,mid+1,high);
	          merge(nums,low,mid,high);
	    }
	    void merge(int[] nums, int low, int mid, int high){
	        int left = low;
	        int right = mid +1;
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        while(left<=mid && right <= high){
	            if(nums[left]<=nums[right]){
	                 temp.add(nums[left]);
	                 left++;
	            }
	            else{
	                temp.add(nums[right]);
	                right++;
	            }
	        }
	        while (left <= mid){
	             temp.add(nums[left]);
	                 left++;
	        }
	        while(right <= high){
	            temp.add(nums[right]);
	                right++;
	        }
	        for(int i=low;i<=high;i++){
	            nums[i] = temp.get(i-low);
	        }
	    }
	
}
