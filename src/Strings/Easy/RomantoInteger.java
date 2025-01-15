package Strings.Easy;

public class RomantoInteger {
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        //Traversing the given String from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i)); 

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue; 
            }

            prevValue = currentValue; 
        }
        return result; 
    }

    private int getValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman number: " + roman);
        }
    }

}
