package Sorting.Medium;

public class CountInversions {
    private static long inversionCount; // To store the count of inversion pairs

    // Function to count inversions in the array
    static int inversionCount(int arr[]) {
        inversionCount = 0; // Initialize inversion count
        mergeSort(arr, 0, arr.length - 1); // Sort the array and count inversions
        return (int) inversionCount; // Return the total inversion count
    }

    // Merge sort function
    private static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int mid = l + (r - l) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    // Merge function to merge two sorted halves and count inversions
    private static void merge(int arr[], int l, int mid, int r) {
        // Sizes of two subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Temporary arrays
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;

                // Count inversions: All remaining elements in left[] form an inversion
                inversionCount += (n1 - i); // CHANGE: Increment inversion count
            }
            k++;
        }

        // Copy any remaining elements of the left array
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements of the right array
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}
