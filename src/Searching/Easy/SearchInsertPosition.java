package Searching.Easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
            }
        }

        // Return the position to insert the target
        return low;
    }

}
