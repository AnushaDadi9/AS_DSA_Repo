package dsa.practice.array.easy;

/*
Brute force -> take ;ast elemet into temp and move elements from n-2th index to 0th inder to the right side -> this rotation will happen k times.
Optimal -> divide the array into 2 parts, based on the k value -> p1 is o - (lenght-k-1)th index and p2 is length-k - (length -1)th index
          reverse p1 and p2, then reverse entire array. 
          if k is nagive number then we have to rotate array in k+length times
          */
public class RotateArrayToRightByKTimes {
	
/********************************************* Brute force ********************************************/
	    public void rotateBruteforce(int[] nums, int k) {
	        int n = nums.length;
	        int count =0;
	        while(count<k){
	             int temp = nums[n-1];
	        for(int i=n-2;i>=0;i--){ 
	              nums[i+1] = nums[i];
	        }
	        nums[0] = temp;
	        count++;
	        }
	    }

	    
/***************************************** OPTIMAL **************************************************/
	        public static void reverse(int[]  nums, int li, int ri){
	           while(li<ri){
	               int temp = nums[li];
	               nums[li] = nums[ri];
	               nums[ri] = temp;

	               li++;
	               ri--;
	           }
	        }

	       public void rotateOptimal(int[] nums, int k) {
	          k = k%nums.length;
	          if(k<0){
	           k= k+nums.length;
	          }
	          if(k!=0){
	           reverse(nums, 0, nums.length-k-1);
	           reverse(nums, nums.length-k, nums.length-1);
	           reverse(nums, 0, nums.length-1);
	          }
	       }
}
