package Searching.Hard;

import java.util.Arrays;

public class AllocateMinimumPages {
    public int findPages(int[] arr, int k) {
    // Step 1: Handle the case where there are more students than books
    if (k > arr.length) {
        return -1;
    }

    // Step 2: Binary search setup
    int low = Arrays.stream(arr).max().getAsInt();  // The minimum possible max pages (largest single book)
    int high = Arrays.stream(arr).sum();  // The maximum possible total pages a student can get (sum of all books)

    int result = -1;  // Variable to store the optimal maximum pages per student

    // Step 3: Perform binary search
    while (low <= high) {
        int mid = low + (high - low) / 2;  // Try mid as the maximum pages a student can take

        // Step 4: Check if it's valid to assign the books with `mid` as the max pages
        if (isValid(arr, k, mid)) {
            result = mid;  // If it's possible, save this as the best solution
            high = mid - 1;  // Try to minimize the maximum pages
        } else {
            low = mid + 1;  // Try a higher value since mid is not valid
        }
    }

    return result;  // Return the optimal maximum pages per student
}

// Helper function to check if it's possible to allocate books to `k` students
// such that no student gets more than `maxPages`
public boolean isValid(int[] arr, int k, int maxPages) {
    int studentCount = 1;  // Start with the first student
    int currentSum = 0;  // Track pages assigned to the current student

    for (int i = 0; i < arr.length; i++) {
        if (currentSum + arr[i] > maxPages) {
            studentCount++;  // We need another student
            currentSum = arr[i];  // This book becomes the first book for the new student

            if (studentCount > k) {
                return false;  // If we need more than `k` students, it's not valid
            }
        } else {
            // Otherwise, add the book to the current student
            currentSum += arr[i];
        }
    }

    return true;  // If we were able to allocate books to `k` or fewer students
}

}
