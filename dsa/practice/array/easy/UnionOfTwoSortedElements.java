package dsa.practice.array.easy;

import java.util.*;

public class UnionOfTwoSortedElements {
	/*
	Bruteforce -> put all the elements from both the arrays into a set, set will not allow duplicate elements.
	and place all the elements into the union array from the set.
	TC -> O(n1logn + n2logn) + O(n1+n2)
	SC -> O(n1+n2)-> to give result + O(n) -> used in algorithm
	*/
	public static int[] unionOfTwoArrays(int[] arr1, int[] arr2) {
		
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		int[] union = new int[set.size()] ;
		int i=0;
		for(int it : set) {
			union[i++] = it;
		}
		return union;
	}
	
	/*
	Optimal -> two pointer approach -> take i at 0th index of first array and j at 0th index of second array.
	           union means adding unique elements from both the array in sorted manner
	           compare ith and jth index elements which is add the smaller element into union array, move i++, if jth index element is smaller thejn add that into union array and move j++,
	           before adding into unionarr, check if the element is not present in that array then only add
	           TC -> O(n1+n2)
	           SC -> O(n1 + n2) -> for giving result, not using in my algorithm
	           */
	
	    public static List<Integer> union(int[] arr1, int[] arr2) {
	        int i = 0, j = 0;
	        int n1 = arr1.length, n2 = arr2.length;
	        List<Integer> unionArr = new ArrayList<>();

	        while (i < n1 && j < n2) {
	            // Skip duplicates in unionArr
	            int val;
	            if (arr1[i] < arr2[j]) {
	                val = arr1[i++];
	            } else if (arr2[j] < arr1[i]) {
	                val = arr2[j++];
	            } else {
	                val = arr1[i]; // both are equal
	                i++;
	                j++;
	            }

	            // Add only if not already present
	            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != val) {
	                unionArr.add(val);
	            }
	        }

	        // Add remaining elements from arr1
	        while (i < n1) {
	            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr1[i]) {
	                unionArr.add(arr1[i]);
	            }
	            i++;
	        }

	        // Add remaining elements from arr2
	        while (j < n2) {
	            if (unionArr.isEmpty() || unionArr.get(unionArr.size() - 1) != arr2[j]) {
	                unionArr.add(arr2[j]);
	            }
	            j++;
	        }

	        return unionArr;
	    }


	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,46};
		
		List<Integer> res =  union(arr1, arr2);
		for(int i : res) {
		System.out.print(i + " ");
		}
	}

}
