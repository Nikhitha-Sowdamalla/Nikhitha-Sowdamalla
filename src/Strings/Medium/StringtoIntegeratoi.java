package Strings.Medium;

public class StringtoIntegeratoi {
	   public int myAtoi(String s) {
	        int result = 0;   // Stores and returns the integer converted value for the string
	        int i = 0;        // Pointer to traverse the string
	        int sign = 1;     // Determines if the number is positive or negative
	        
	        // Handle leading spaces
	        s = s.trim();
	        
	        // Check for empty string
	        if (s.isEmpty()) {
	            return 0;
	        }
	        
	        // Check the sign of the number
	        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
	            sign = (s.charAt(i) == '-') ? -1 : 1;
	            i++;
	        }
	        
	        // Now traverse the entire string and convert it into an integer
	        while (i < s.length() && Character.isDigit(s.charAt(i))) {
	            int digit = s.charAt(i) - '0';
	            
	            // Check for overflow and underflow
	            if (result > (Integer.MAX_VALUE - digit) / 10) {
	                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	            }
	            
	            result = result * 10 + digit;
	            i++;
	        }
	        
	        return result * sign;
	    }

}
//https://leetcode.com/problems/string-to-integer-atoi/
