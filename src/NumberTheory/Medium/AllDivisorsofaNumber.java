package NumberTheory.Medium;

public class AllDivisorsofaNumber {
    public static void print_divisors(int n) {
        // code here
        
        for(int i=1;i<=n;i++)
        {
            if(n%i==0 || n%i==n)
            {
                System.out.print(i+" ");
            }
        }
    }

}
