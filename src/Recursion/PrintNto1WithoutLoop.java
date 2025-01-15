package Recursion;

public class PrintNto1WithoutLoop {
    void printNos(int N) {
        // code here
        if(N==0)
        {
            return;
        }
        
        System.out.print(N+" ");
        printNos(--N);
    }

}

//https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
