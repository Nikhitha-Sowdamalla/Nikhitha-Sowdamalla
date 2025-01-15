package Searching.Medium;

public class KthSmallestElementinaSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length; // Assume the matrix is n x n

        // Define the search range
        int low = matrix[0][0]; // Smallest element in the matrix
        int high = matrix[n - 1][n - 1]; // Largest element in the matrix

        // Binary search over the value range
        while (low < high) {
            int mid = low + (high - low) / 2;

            // Count how many elements are ≤ mid
            int count = countLessOrEqual(matrix, mid);

            if (count >= k) {
                high = mid; // Narrow search to the right part
            } else {
                low = mid+1; // Narrow search to the left part
            }
        }

        return low; // `low` is the Kth smallest element
    }

    // Helper function to count elements ≤ target in the matrix
    private int countLessOrEqual(int[][] matrix, int target) {
        int count = 0;
        int n = matrix.length;
        int row = n - 1, col = 0; // Start from the bottom-left corner

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= target) {
                count += row + 1; // All elements in this column above are ≤ target
                col++; // Move right
            } else {
                row--; // Move up
            }
        }

        return count;
    }

}
