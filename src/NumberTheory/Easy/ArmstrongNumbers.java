package NumberTheory.Easy;

public class ArmstrongNumbers {
    static boolean armstrongNumber(int n) {
        // code here
        int original = n;
        int result = 0;
        
        while(n>0)
        {
            int digit = n%10;
            result += digit * digit * digit;
            n=n/10;
        }
        
        if(original!=result)
        {
            return false;
        }
        
        return true;
    }

}
