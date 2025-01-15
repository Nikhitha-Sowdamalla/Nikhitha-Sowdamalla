package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        // Step 1: Compute factorials and store in a list
        List<Integer> fact = new ArrayList<>();
        fact.add(1); // 0! = 1
        int f = 1;
        for (int i = 1; i < n; i++) {
            f *= i;
            fact.add(f);
        }

        // Step 2: Initialize the digits list with numbers from 1 to n
        List<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            digits.add(i);
        }

        // Step 3: Adjust k to 0-based indexing
        k--;

        // Step 4: Build the k-th permutation
        StringBuilder ans = new StringBuilder();
        for (int i = n; i > 0; i--) {
            // Find the index of the current digit
            int index = k / fact.get(i - 1);
            ans.append(digits.get(index)); // Add the digit to the result
            digits.remove(index); // Remove the used digit
            k %= fact.get(i - 1); // Update k for the next iteration
        }

        return ans.toString();
    }

}

//https://leetcode.com/problems/permutation-sequence/