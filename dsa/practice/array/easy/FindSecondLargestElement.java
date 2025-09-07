package dsa.practice.array.easy;

public class FindSecondLargestElement {
	
	//Brut force will be -> sorting array(o(NlogN) and again loop whole sorted array and check the element which is greater than all the elements but smaller than arr[n-1]th index elemet
	
	
	//Better solution -> find largest element by loop whole array and again loop array and find the second largest elemt -> O(2N)
	public int secondLargestElementBetterSol(int[] nums) {
		  int largest = nums[0];
		  
          for(int i=0;i<nums.length;i++){
           if(nums[i]>largest){
               largest = nums[i];
           }
          }
          int slargest = -1;
          for(int i=0;i<nums.length;i++) {
        	  if(nums[i]>slargest && nums[i] !=largest) {
        		  slargest = nums[i];
        	  }
          }
          return slargest;
          
    }
	
	//Below is the optimal solutipon, find second largest in a single loop process -> O(N)
	public int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int slargest = -1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                slargest = largest;
                largest = nums[i];
            }
            else if(nums[i] <largest && nums[i]>slargest){
                slargest =nums[i];
            }
        }
        return slargest;
    }
	
	 public static void main(String[] args) {
		 FindSecondLargestElement sol = new FindSecondLargestElement();
	        int[] input = {4, 2, 6, 1, 5, 3, 4, 7, 9};
	       int res =  sol.secondLargestElementBetterSol(input);
	       
	       int res2 = sol.secondLargestElement(input);
	       
	       System.out.println("Better way output :" +res);
	       
	       System.out.println("Optimal way :" +res2);
	    }

}
