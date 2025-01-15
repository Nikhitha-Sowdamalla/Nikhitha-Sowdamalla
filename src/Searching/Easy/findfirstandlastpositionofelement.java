package Searching.Easy;

public class findfirstandlastpositionofelement {
	   public int[] searchRange(int[] nums, int target) {
	        int first = binarySearch(nums, target, true);  // Search for first occurrence
	        int last = binarySearch(nums, target, false); // Search for last occurrence
	        return new int[]{first, last};
	    }

	    private int binarySearch(int[] nums, int target, boolean findFirst) {
	        int low = 0, high = nums.length - 1;
	        int result = -1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (nums[mid] == target) {
	                result = mid; // Potential result found
	                // If searching for the first occurrence, move left
	                // If searching for the last occurrence, move right
	                if (findFirst) {
	                    high = mid - 1;
	                } else {
	                    low = mid + 1;
	                }
	            } else if (nums[mid] < target) {
	                low = mid + 1; // Move to the right
	            } else {
	                high = mid - 1; // Move to the left
	            }
	        }
	        return result;
	    }
}


//---------------------------------------------------------------------------------------


//public class findfirstandlastpositionofelement {
//  public int[] searchRange(int[] nums, int target) {
//int n = nums.length;
//      int first = -1, last = -1;
     
//      // Iterate through the array to find first and last occurrences
//      for (int i = 0; i < n; i++) {
//          if (nums[i] == target) {
//              if (first == -1) {
//                  first = i; // Set the first occurrence
//              }
//              last = i; // Update the last occurrence
//          }
//      }

//      // Return the result
//      return new int[]{first, last};
//  }
//}
//}
