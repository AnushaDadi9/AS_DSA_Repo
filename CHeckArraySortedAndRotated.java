package dsa.practice.array.easy;


/*
to check array is sorted in asc or after rotating it will sorted in asc order
if only need to check sorted or not then it will easy we can check each element from previous whether it is greater or not, itf than condition fail we can return false.
		but here, we need to check sorted and rotated, means after rotaion if array is sorted then return true.
				So, used count variable, increased count value when the element is greater than next element.
				if count <=1 then return true.
				why count<=1, actually it should be 0 because that if condition should not satisfy, but here we are checking rotaion, if we rotate some elements in an array then (sorted array -> it will fail at that place),(non sorted can be sorted after rotaion)
				*/
public class CHeckArraySortedAndRotated {
	    public boolean check(int[] nums) {
	        int count =0;
	        int n = nums.length;
	        for(int i=0;i < n;i++){
	            int next = nums[(i+1)%n];
	            if(nums[i]>next){
	                count++;
	            }
	        }
	        System.out.println(count<=1);
	        return count <=1;
	    }
	    
	    public static void main(String[] args) {
	    	CHeckArraySortedAndRotated sol = new CHeckArraySortedAndRotated();
		        int[] input = {4, 2, 6, 1, 5, 3, 4, 7, 9};
		        sol.check(input);
	    }

}
