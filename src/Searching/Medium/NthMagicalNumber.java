package Searching.Medium;

public class NthMagicalNumber {
	   private static final int MOD = 1_000_000_007;

	    // Helper method to calculate GCD
	    private long gcd(long a, long b) {
	        return b == 0 ? a : gcd(b, a % b);
	    }

	    // Helper method to calculate LCM
	    private long lcm(long a, long b) {
	        return a * (b / gcd(a, b));
	    }

	    // Main method to find the nth magical number
	    public int nthMagicalNumber(int n, int a, int b) { 
	        long low = 1, high = (long) 1e18; // Use a large upper bound for binary search

	        while (low < high) {
	            long mid = low + (high - low) / 2;

	            // Count numbers divisible by a or b
	            long count = (mid / a) + (mid / b) - (mid / lcm(a, b));

	            if (count < n) {
	                low = mid + 1; // Move to the higher range
	            } else {
	                high = mid; // Move to the lower range
	            }
	        }

	        return (int) (low % MOD); // Return result modulo 10^9 + 7
	    }

}
