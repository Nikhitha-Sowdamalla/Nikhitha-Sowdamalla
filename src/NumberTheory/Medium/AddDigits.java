package NumberTheory.Medium;

public class AddDigits {
    public int addDigits(int num) {
        // Check for edge case where the number is zero
        if (num == 0) {
            return 0;
        }

        // Sum digits repeatedly until the number becomes a single digit
        while (num >= 10) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;  // Add the last digit
                num /= 10;         // Remove the last digit
            }
            num = sum;  // Update num to the sum of digits
        }
        return num;  // Return the single-digit result
    }

}
