package NumberTheory.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimenumbersinRange {
    static ArrayList<Integer> primeRange(int M, int N) {
        // Step 1: Find all prime numbers up to sqrt(N) using the classic sieve
        int limit = (int) Math.sqrt(N) + 1;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect base primes (primes up to sqrt(N))
        ArrayList<Integer> basePrimes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                basePrimes.add(i);
            }
        }

        // Step 2: Create a boolean array for the range [M, N]
        boolean[] isPrimeSegment = new boolean[N - M + 1];
        Arrays.fill(isPrimeSegment, true); // Assume all numbers in the range are prime

        // Step 3: Mark non-primes in the range using base primes
        for (int prime : basePrimes) {
            // Find the smallest multiple of 'prime' in the range [M, N]
            int start = Math.max(prime * prime, (M + prime - 1) / prime * prime);

            for (int j = start; j <= N; j += prime) {
                isPrimeSegment[j - M] = false;
            }
        }

        // Step 4: Collect the primes in the range [M, N]
        ArrayList<Integer> primesInRange = new ArrayList<>();
        for (int i = 0; i < isPrimeSegment.length; i++) {
            if (isPrimeSegment[i]) {
                primesInRange.add(M + i);
            }
        }

        // Special case: If M == 1, remove '1' as it is not a prime number
        if (M == 1) {
            primesInRange.remove(Integer.valueOf(1));
        }

        return primesInRange;
    }

}

//https://www.geeksforgeeks.org/problems/find-prime-numbers-in-a-range4718/1
