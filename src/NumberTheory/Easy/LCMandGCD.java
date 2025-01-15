package NumberTheory.Easy;

public class LCMandGCD {
    public static int[] lcmAndGcd(int a, int b) {
        // Find GCD using the helper method
        int gcd = findGCD(a, b);
        // Calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        int lcm = (a / gcd) * b; // Prevent integer overflow
        // Return the result as an array
        return new int[]{lcm, gcd};
    }

    // Helper method to find the GCD using the Euclidean algorithm
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
