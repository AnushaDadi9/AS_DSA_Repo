package dsa.practice.array.easy;

import java.util.*;

public class MoveAllZerosToLast {
	
	/*
	Bruteforce -> get all non zero elements and put in temp array and again place them in main array-> fill remaining indexes to zeros.
	 TC -> O(N) + O(X) + O(N-X) -> o(N)
	 SC - O(X)
	 where x - no. of non zero elements
	 */
	public static int[] movezeros(int[] arr) {
		List<Integer> temp = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp.add(arr[i]);
			}
		}
		int nonzeroElements = temp.size();
		for(int i=0;i<nonzeroElements;i++) {
			arr[i] = temp.get(i);
		}
		
		for(int i=nonzeroElements;i<arr.length;i++) {
			arr[i] =0;
		}
		return arr;
	}
	
	/*
	Optimal -> use two pointer i and j -> get the index of j where first zero element is present in an array.(because, we want to move all non zero elements to first)
              loop from j+1th index to arr.length becoz need to swap non zero elements with zero element(jth)
              TC -> O(N)
              SC -> O(1)- we didn't used any extra spaces
              */
	
	public static int[] moveZerosToLast(int[] arr) {
		int j= -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
			j = i;
			break;
			}
		}
		for(int i = j+1; i< arr.length;i++) {
			if(arr.length ==1 || j == -1) {
				break;
			}
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = {2,1};
		int[] arr = moveZerosToLast(input);
		for(int i :arr) {
			System.out.print(i+" ");
		}
	}

}
