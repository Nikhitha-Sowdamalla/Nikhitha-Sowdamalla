package Strings.Medium;

import java.util.HashMap;

public class SubstringsWithKDistinct {
    private int helper(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, count = 0;

        for (int j = 0; j < s.length(); j++) {
            char currentChar = s.charAt(j);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

            while (map.size() > k) {
                char startChar = s.charAt(i);
                map.put(startChar, map.get(startChar) - 1);
                if (map.get(startChar) == 0) {
                    map.remove(startChar);
                }
                i++;
            }

            count += j - i + 1;
        }

        return count;
    }

    public int countSubstr(String s, int k) {
        return helper(s, k) - helper(s, k - 1);
    }

}

//https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1