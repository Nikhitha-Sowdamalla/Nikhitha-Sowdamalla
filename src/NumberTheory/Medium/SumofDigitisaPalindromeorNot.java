package NumberTheory.Medium;

public class SumofDigitisaPalindromeorNot {
    boolean isDigitSumPalindrome(int n) {
        // Step 1: Calculate the digit sum
        int sum = 0;
        while (n > 0) {
            int rem = n % 10; // Extract the last digit
            sum += rem;       // Add it to the sum
            n = n / 10;       // Remove the last digit
        }

        // Step 2: Check if the sum is a palindrome
        String sumStr = String.valueOf(sum); // Convert sum to a string
        int left = 0;
        int right = sumStr.length() - 1;

        while (left < right) {
            if (sumStr.charAt(left) != sumStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // It is a palindrome
    }

}
