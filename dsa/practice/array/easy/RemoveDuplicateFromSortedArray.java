package dsa.practice.array.easy;

/*
Bruteforce -> insert whole array into set(because set will take only unique element)-> again insert elements from set to same array, replace existing values with set elemets -> to return legth of unique element -> return set index+1
		
Optimal -> use two pointer pattern -> take i and j -> i from 0th index and j from 1st index -> check arr[j] !=arr[i](which means not duplicate value) then add arr[j] into arr[i+1] and do i++ -> reutrn i+1
*/
public class RemoveDuplicateFromSortedArray {
	
	public static int removeDuplicateandReturnUniqueValueCount(int[] arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j] !=arr[i]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		
        int[] input = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        
        int res = removeDuplicateandReturnUniqueValueCount(input);
        System.out.println("Count of unique value: "+res);
        
        
        
        

	}
}
