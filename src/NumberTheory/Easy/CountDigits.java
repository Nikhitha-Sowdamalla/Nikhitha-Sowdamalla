package NumberTheory.Easy;

public class CountDigits {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int original = n; // Store the original number
        
        while (n > 0) {
            int rem = n % 10; // Extract the last digit
            
            // Check if the digit is non-zero and divides the original number
            if (rem != 0 && original % rem == 0) {
                count++;
            }
            
            n = n / 10; // Remove the last digit
        }
        
        return count;
    }

}
