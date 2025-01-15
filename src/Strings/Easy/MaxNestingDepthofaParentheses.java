package Strings.Easy;

public class MaxNestingDepthofaParentheses {
	   public int maxDepth(String s) {
	        int currentPar = 0;
	        int maxPar=0;

	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='(')
	            {
	                currentPar++;
	            }
	            else if(s.charAt(i)==')')
	            {
	                currentPar--;
	            }
	            maxPar = Math.max(currentPar,maxPar);
	        }
	        return maxPar;
	        
	    }

}
