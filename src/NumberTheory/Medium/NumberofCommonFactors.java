package NumberTheory.Medium;

public class NumberofCommonFactors {
    public int commonFactors(int a, int b) {
        // Step 1: Calculate the GCD
        int gcd = gcd(a, b);
        
        // Step 2: Count the factors of the GCD
        int count = 0;
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Helper method to calculate GCD using the Euclidean algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

//-----------------------------------------------------------------
//class Solution {
//public int commonFactors(int a, int b) {
//  int count = 0;


//  for(int i=1;i<=Math.min(a,b);i++)
//  {
//      if(a%i==0 && b%i==0)
//      {
//          count = count + 1;
//      }
     
//  }
//  return count;
 
 
//}
//}

