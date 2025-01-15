package Searching.Medium;

public class FindPeakElement {
	   public int findPeakElement(int[] nums) {
	        int n = nums.length;
	        int low = 0, high = n - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            // Check if mid is a peak
	            if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == n - 1 || nums[mid] > nums[mid + 1])) {
	                return mid; // Peak found
	            }

	            // Move to the side with a greater neighbor
	            if (mid > 0 && nums[mid - 1] > nums[mid]) {
	                high = mid-1; // Move to the left
	            } else {
	                low = mid + 1; // Move to the right
	            }
	        }

	        return -1; // This line will never be reached
	    }
}
