package Strings.Easy;

public class ReverseaString {
    public void reverseString(char[] s) {
        int n =s.length;
        int left = 0;
        int right = s.length-1;

        while(left<n/2)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
