package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParentheses(result, n, 0, 0, "");
        return result;
    }

    private void generateParentheses(List<String> ans, int n, int open, int close, String currStr) {
        // Base case: If the current string's length is 2 * n, add it to the result list
        if (currStr.length() == n * 2) {
            ans.add(currStr);
            return;
        }

        // Add an open parenthesis if we haven't used all 'n' open parentheses
        if (open < n) {
            generateParentheses(ans, n, open + 1, close, currStr + "(");
        }

        // Add a close parenthesis if we haven't used more than the open parentheses
        if (close < open) {
            generateParentheses(ans, n, open, close + 1, currStr + ")");
        }
    }

}
