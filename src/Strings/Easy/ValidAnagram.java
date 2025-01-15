package Strings.Easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	   public boolean isAnagram(String s, String t) {
	         // If lengths are not equal, they cannot be anagrams
	        if (s.length() != t.length()) {
	            return false;
	        }

	        Map<Character, Integer> charCountMap = new HashMap<>();

	        for (int i = 0; i < s.length(); i++) {
	            char charS = s.charAt(i);
	            char charT = t.charAt(i);

	            charCountMap.put(charS, charCountMap.getOrDefault(charS, 0) + 1);

	            charCountMap.put(charT, charCountMap.getOrDefault(charT, 0) - 1);
	        }

	        
	        for (int count : charCountMap.values()) {
	            if (count != 0) {
	                return false; 
	            }
	        }

	        return true; 
	    }

}
