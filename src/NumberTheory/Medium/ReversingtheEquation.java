package NumberTheory.Medium;

public class ReversingtheEquation {
    String reverseEqn(String S)
    {
        StringBuilder result = new StringBuilder(); // Efficient for appending
        StringBuilder temp = new StringBuilder();   // To store numbers/variables

        // Traverse the string from the end
        for (int i = S.length() - 1; i >= 0; i--) {
            char ch = S.charAt(i);

            if (ch >= '0' && ch <= '9') {
                // If it's a digit, add it to temp
                temp.insert(0, ch); // Prepend to maintain order
            } else {
                // If it's an operator, append the number/variable and the operator
                result.append(temp).append(ch);
                temp.setLength(0); // Clear temp
            }
        }

        // Append any remaining number/variable
        result.append(temp);

        return result.toString();
    }

}

//---------------------------------------------------------------------------------------------------

//class Solution
//{
//  String reverseEqn(String S)
//  {
//      String result = ""; // Store the reversed equation
//      String temp = "";   // Temporary storage for numbers/variables

//      // Traverse the string from the end
//      for (int i = S.length() - 1; i >= 0; i--) {
//          char ch = S.charAt(i);

//          if (ch >= '0' && ch <= '9') {
//              // If it's a digit, add it to the temporary string
//              temp = ch + temp;
//          } else {
//              // If it's an operator, append the number/variable and the operator
//              result += temp + ch;
//              temp = ""; // Clear temp for the next number/variable
//          }
//      }

//      // Add any remaining number/variable
//      result += temp;

//      return result;
//  }
//}
