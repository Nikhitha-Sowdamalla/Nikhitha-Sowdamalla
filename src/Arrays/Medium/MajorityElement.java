package Arrays.Medium;

public class MajorityElement {
	   public int majorityElement(int[] nums) {
	        int candidate = Integer.MIN_VALUE;
	        int life = 0;
	        int n = nums.length;

	        for(int i=0;i<n;i++)
	        {
	            if(nums[i]==candidate)
	            {
	                life++;
	            }
	            else if(life == 0)
	            {
	                candidate = nums[i];
	                life = 1;
	            }
	            else
	            {
	                life--;
	            }
	        }
	        return candidate;    
	    }

}

//https://leetcode.com/problems/majority-element/
