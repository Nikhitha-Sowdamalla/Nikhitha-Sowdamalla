package Recursion;

public class HandShakes {
    static int count(int N) {
        if (N % 2 != 0) {
            return 0; // If N is odd, no valid handshakes are possible
        }
        
        int n = N / 2; // The number of pairs
        return catalanNumber(n);
    }

    private static int catalanNumber(int n) {
        if (n == 0) {
            return 1; // Base case: C_0 = 1
        }

        // Use dynamic programming to compute Catalan numbers
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - 1 - j];
            }
        }

        return dp[n];
    }

}

//----------------------------------------------------------------------------------------------------

//public class HandShakes {
//    static int count(int N) {
//        // Base case: If N is odd, no valid handshakes are possible
//        if (N % 2 != 0) {
//            return 0;
//        }
//
//        // Base case: If N = 0, there's only one way (no handshakes)
//        if (N == 0) {
//            return 1;
//        }
//
//        // Recursive case: Compute using the formula
//        int result = 0;
//        for (int i = 0; i <= N - 2; i += 2) {
//            result += count(i) * count(N - 2 - i);
//        }
//
//        return result;
//    }
//
//}
