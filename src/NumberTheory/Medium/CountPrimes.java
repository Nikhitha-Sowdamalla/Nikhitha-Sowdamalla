package NumberTheory.Medium;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; // No primes less than 2
        }

        // Create a boolean array to mark prime numbers
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Assume all numbers >= 2 are prime initially
        }

        // Apply Sieve of Eratosthenes
        for (int i = 2; i * i < n; i++) { // Iterate only up to √n
            if (isPrime[i]) { // If 'i' is prime
                for (int j = i * i; j < n; j += i) { // Mark multiples of 'i' as non-prime
                    isPrime[j] = false;
                }
            }
        }

        // Count all numbers that are still marked as prime
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

}

//https://leetcode.com/problems/count-primes/