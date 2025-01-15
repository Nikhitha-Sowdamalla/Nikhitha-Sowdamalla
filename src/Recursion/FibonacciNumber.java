package Recursion;

public class FibonacciNumber {
    public int fib(int n) {
        if(n<2)
        {
         return n;
        }

        int result = fib(n-1)+fib(n-2);
        return result;
     }

}

//https://leetcode.com/problems/fibonacci-number/
