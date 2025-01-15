package Arrays.Medium;

import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        int maxGap = 0;
        int n = nums.length;
        // Base case:
        if (n < 2)
            return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : nums) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int bucketSize = (int) Math.ceil((double) (max - min) / (n - 1));
        int[] minOfBucket = new int[n - 1];
        int[] maxOfBucket = new int[n - 1];

        Arrays.fill(minOfBucket, Integer.MAX_VALUE);
        Arrays.fill(maxOfBucket, -1);

        // Set the min and max of bucket
        for (int i = 0; i < n; i++) {
            if (nums[i] == min || nums[i] == max)
                continue;

            int bucketIndexForCurrentEl = (nums[i] - min) / bucketSize;

            minOfBucket[bucketIndexForCurrentEl] = Math.min(minOfBucket[bucketIndexForCurrentEl], nums[i]);
            maxOfBucket[bucketIndexForCurrentEl] = Math.max(maxOfBucket[bucketIndexForCurrentEl], nums[i]);
        }

        int previousMax = min;
        for (int i = 0; i < n - 1; i++) {
            if (maxOfBucket[i] == -1) // Empty bucket
                continue;
            maxGap = Math.max(maxGap, minOfBucket[i] - previousMax);
            previousMax = maxOfBucket[i];
        }

        maxGap = Math.max(maxGap, max - previousMax); // Final comparison with max element

        return maxGap;
    }
}

//https://leetcode.com/problems/maximum-gap/
