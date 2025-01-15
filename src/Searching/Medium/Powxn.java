package Searching.Medium;

public class Powxn {
    public double myPow(double x, int n) {
        // Handle negative powers and prevent overflow when n == Integer.MIN_VALUE
        long exponent = n;
        if (n < 0) {
            x = 1 / x; // For negative powers, take the reciprocal of x
            exponent = -exponent; // Convert to positive
        }

        return power(x, exponent);
    }

    private double power(double x, long n) {
        if (n == 0) {
            return 1.0; // Base case
        }

        double half = power(x, n / 2); // Recursively calculate half power
        if (n % 2 == 0) {
            return half * half; // If n is even
        } else {
            return half * half * x; // If n is odd
        }
    }

}
