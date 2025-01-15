package Recursion;

public class Powerof2 {
	   public boolean isPowerOfTwo(int n) {


	        if(n==1)
	        {
	            return true;
	        }

	        if(n%2!=0 || n==0)
	        {
	            return false;
	        }
	        else
	        {
	            return isPowerOfTwo(n/2);
	        }

	        
	        
	    }

}

//https://leetcode.com/problems/power-of-two/
