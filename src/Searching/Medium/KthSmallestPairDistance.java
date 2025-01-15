package Searching.Medium;

import java.util.Arrays;

public class KthSmallestPairDistance {
    public int smallestDistancePair(int[] nums, int k) {
        // Sort the array to apply the sliding window logic
        Arrays.sort(nums);

        int n = nums.length;

        // Initialize the binary search range
        int low = Integer.MAX_VALUE;
        int high = nums[n - 1] - nums[0];

        // Find the smallest possible difference (low)
        for (int i = 1; i < n; i++) {
            low = Math.min(low, nums[i] - nums[i - 1]);
        }

        // Perform binary search
        while (low < high) {
            int mid = (low + high) / 2;

            // Count how many pairs have absolute difference <= mid
            int count = slidingWindow(nums, mid);

            if (count < k) {
                // If less than k pairs, move to higher range
                low = mid + 1;
            } else {
                // Otherwise, shrink the range to find a smaller valid value
                high = mid;
            }
        }

        return low;
    }

    // Helper function to count pairs with absolute difference <= diff
    private int slidingWindow(int[] nums, int diff) {
        int j = 0;
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            // Move the window until the difference is <= diff
            while (nums[i] - nums[j] > diff) {
                j++;
            }
            count += i - j; // Add pairs ending at i with start >= j
        }

        return count;
    }

}
