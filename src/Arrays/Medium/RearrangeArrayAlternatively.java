package Arrays.Medium;

import java.util.Arrays;

public class RearrangeArrayAlternatively {
    // Function to rearrange the array elements alternately.
    public static void rearrange(int arr[]) {
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Use two pointers for encoding
        int maxIndex = n - 1;  // Pointer to the largest element
        int minIndex = 0;      // Pointer to the smallest element
        int maxElement = arr[maxIndex] + 1; // A value greater than the max element

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Encode max element at even indices
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            } else {
                // Encode min element at odd indices
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }

        // Step 3: Decode the values to get the rearranged array
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElement;
        }
 }
}


