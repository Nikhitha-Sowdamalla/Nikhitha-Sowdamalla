package Searching.Medium;

import java.util.Arrays;

public class AggresiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);  // Step 1: Sort the stalls

        int low = 1;  // Minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0];  // Maximum possible distance
        int result = 0;  // To store the largest minimum distance

        // Step 2: Binary search on the answer
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Try mid as the minimum distance

            // Step 3: Check if it's valid to place cows with `mid` as the minimum distance
            if (isValid(stalls, k, mid)) {
                result = mid;  // If valid, save this as a potential answer
                low = mid + 1;  // Try for a larger distance
            } else {
                high = mid - 1;  // Try for a smaller distance
            }
        }

        return result;  // Return the largest minimum distance found
    }

    // Helper function to check if it's possible to place `k` cows with at least `minDist` between them
    public static boolean isValid(int[] stalls, int k, int minDist) {
        int count = 1;  // Place the first cow in the first stall
        int lastPosition = stalls[0];  // The position of the last placed cow

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;  // Place a cow here
                lastPosition = stalls[i];  // Update the last placed cow's position

                if (count == k) {
                    return true;  // All cows have been placed successfully
                }
            }
        }

        return false;  // Not all cows could be placed with at least `minDist` between them
    }

}
