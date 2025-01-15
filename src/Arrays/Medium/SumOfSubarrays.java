package Arrays.Medium;

public class SumOfSubarrays {
    public long subarraySum(int[] arr) {
        int n = arr.length;
        long totalSum = 0;
        int MOD = 1_000_000_007; // 10^9 + 7

        for (int i = 0; i < n; i++) {
            // Calculate contribution of arr[i] and apply modulo
            long contribution = ((long) arr[i] * (i + 1) % MOD * (n - i) % MOD) % MOD;
            // Add to total sum and apply modulo
            totalSum = (totalSum + contribution) % MOD;
        }

        return totalSum;
    }

}
