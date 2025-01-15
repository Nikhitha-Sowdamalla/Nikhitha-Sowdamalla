package NumberTheory.Medium;

public class LargestPrimeFactor {
    static int largestPrimeFactor(int n) {
        // code here
        int largestprime  = -1;
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                largestprime = i;
                n/=i;
            }
        }
        
        if(n>1)
        {
            largestprime = n;
        }
        return largestprime;
    }

}

//https://www.geeksforgeeks.org/problems/largest-prime-factor2601/1
