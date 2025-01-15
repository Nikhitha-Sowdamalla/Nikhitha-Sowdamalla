package NumberTheory.Medium;

public class Multiply2Strings {
    public String multiplyStrings(String s1, String s2)
    {
        // Base case: if either string is "0", return "0"
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        // Determine the sign of the result
        boolean isNegative = (s1.charAt(0) == '-' && s2.charAt(0) != '-') ||
                             (s1.charAt(0) != '-' && s2.charAt(0) == '-');

        // Remove negative sign if present
        if (s1.charAt(0) == '-') {
            s1 = s1.substring(1);
        }
        if (s2.charAt(0) == '-') {
            s2 = s2.substring(1);
        }

        // Remove leading zeros from both strings
        s1 = s1.replaceFirst("^0+", "");
        s2 = s2.replaceFirst("^0+", "");

        // If either string becomes empty after removing leading zeros, return "0"
        if (s1.isEmpty() || s2.isEmpty()) {
            return "0";
        }

        int m = s1.length();
        int n = s2.length();
        int[] result = new int[m + n];

        // Multiplication logic
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int sum = product + result[i + j + 1];

                result[i + j + 1] = sum % 10; // Current digit
                result[i + j] += sum / 10;    // Carry to the next position
            }
        }

        // Build the result string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (sb.length() == 0 && num == 0) {
                continue; // Skip leading zeros
            }
            sb.append(num);
        }

        // If the result is empty after skipping zeros, return "0"
        if (sb.length() == 0) {
            return "0";
        }

        // Add the negative sign if the result is negative
        if (isNegative) {
            sb.insert(0, '-');
        }

        return sb.toString();
    }

}

//https://www.geeksforgeeks.org/problems/multiply-two-strings/1
//https://leetcode.com/problems/multiply-strings/
