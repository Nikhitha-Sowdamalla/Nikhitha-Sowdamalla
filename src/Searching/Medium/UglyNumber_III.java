package Searching.Medium;

public class UglyNumber_III {
	   private long gcd(long a, long b) {
	        return b == 0 ? a : gcd(b, a % b);
	    }

	    // Helper method to calculate lcm
	    private long lcm(long a, long b) {
	        return a * (b / gcd(a, b));
	    }

	    // Main method to find the nth ugly number
	    public int nthUglyNumber(int n, int a, int b, int c) {
	        long low = 1, high = Integer.MAX_VALUE;

	        while (low < high) {
	            long mid = low + (high - low) / 2;

	            // Count numbers divisible by a, b, c
	            long count = (mid / a) + (mid / b) + (mid / c)
	                        - (mid / lcm(a, b)) - (mid / lcm(a, c)) - (mid / lcm(b, c))
	                        + (mid / lcm(a, lcm(b, c)));

	            if (count < n) {
	                low = mid + 1; // Move to the higher range
	            } else {
	                high = mid; // Move to the lower range
	            }
	        }

	        return (int) low; // Return the nth ugly number
	    }

}
