package com.dsa.practice;

/*
Selection sort
Find minimum value from the array and swap
step 1 -> find min value from 0-min value -> swap(arr[0],arrr[min])
step 2 -> find min value from 1-min value -> swap(arr[1],arr[min])
step 3 ->----
---
--
untill n-2th index beacuse we no need to check last single value, as it is already sorted
*/
public class SelectionSort {
	public int[] sortArray(int[] nums) {

		for (int i = 0; i <= nums.length - 2; i++) {
			int min = i;
			for (int j = i; j <= nums.length - 1; j++) {
				if (nums[j] < nums[min]) {
					min = j;
				}
			}
			int temp = nums[min];
			nums[min] = nums[i];
			nums[i] = temp;
		}
		return nums;
	}
}
