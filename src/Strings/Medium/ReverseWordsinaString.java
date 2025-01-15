package Strings.Medium;

public class ReverseWordsinaString {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        // Reverse the entire string
        StringBuilder reversed = new StringBuilder(s).reverse();

        for (int i = 0; i < n; i++) {
            // To hold each word
            StringBuilder word = new StringBuilder();

            // Extract a word
            while (i < n && reversed.charAt(i) != ' ') {
                word.append(reversed.charAt(i));
                i++;
            }

            // Reverse the extracted word and append it to the result
            if (word.length() > 0) {
                ans.append(word.reverse());
                ans.append(" ");
            }
        }

        // Remove any extra space at the end
        return ans.toString().trim();
    }

}

//https://leetcode.com/problems/reverse-words-in-a-string/