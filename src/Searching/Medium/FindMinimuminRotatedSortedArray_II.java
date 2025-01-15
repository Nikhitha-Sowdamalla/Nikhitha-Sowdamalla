package Searching.Medium;

public class FindMinimuminRotatedSortedArray_II {
	   public int findMin(int[] nums) {
	        int low = 0;
	        int high = nums.length - 1;

	        while (low < high) {
	            // Avoid duplicates by narrowing the search boundaries
	            while (low < high && nums[low] == nums[high]) {
	                high--;
	            }

	            int mid = low + (high - low) / 2;

	            // If mid element is greater than high, the minimum is on the right side
	            if (nums[mid] > nums[high]) {
	                low = mid + 1;
	            } else {
	                // Else, the minimum is on the left side or mid
	                high = mid;
	            }
	        }

	        // 'low' will point to the minimum element
	        return nums[low];
	    }
}
