package Arrays.Medium;

public class MinimumSwapsandKtogether {
    int minSwap(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                count++;
            }
        }

        // Count the number of "bad" elements in the first window of size 'count'
        int bad = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        // Initialize the answer with the "bad" count of the first window
        int ans = bad;

        // Sliding window
        for (int i = 0, j = count; j < n; i++, j++) {
            // Remove the effect of the element going out of the window
            if (arr[i] > k) {
                bad--;
            }
            // Add the effect of the element coming into the window
            if (arr[j] > k) {
                bad++;
            }

            // Update the answer with the minimum "bad" count seen so far
            ans = Math.min(ans, bad); // Use Math.min
        }

        return ans;
    }

}
