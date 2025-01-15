package NumberTheory.Medium;

import java.util.Arrays;

public class SumofAllPrimeNumbersBetween1andN {
    public long prime_Sum(int n) {
        if (n < 2) return 0;
        
        boolean[] isPrime = sieveOfEratosthenes(n);
        long sum = 0;
        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        isPrime[0] = isPrime[1] = false;
        
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }

}
