package Arrays.Easy;

public class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        // Initialize left sum as 0
        int leftSum = 0;

        // Iterate through the array to find the equilibrium point
        for (int i = 0; i < arr.length; i++) {
            // Calculate the right sum as totalSum - leftSum - current element
            int rightSum = totalSum - leftSum - arr[i];

            // If left sum equals right sum, we found the equilibrium point
            if (leftSum == rightSum) {
                return i; // Return the index
            }

            // Update the left sum by adding the current element
            leftSum += arr[i];
        }

        // If no equilibrium point is found, return -1
        return -1;
    }

}
