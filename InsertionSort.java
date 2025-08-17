package com.dsa.practice;

/*
Insertion sorting
takes an element and place it in a correct place
step 1 -> take 1th index -> are you greater than left -> swap, 
step 2 -> take 2nd index are you greater than 1 and 0 -> swap 
----
--
follow same till n-1th index

*/
public class InsertionSort {
	public int[] sortArray(int[] nums) {

		for (int i = 0; i <= nums.length - 1; i++) {
			int j = i;
			while (j > 0 && nums[j - 1] > nums[j]) {
				int temp = nums[j - 1];
				nums[j - 1] = nums[j];
				nums[j] = temp;
				j--;
			}
		}
		return nums;
	}
}
