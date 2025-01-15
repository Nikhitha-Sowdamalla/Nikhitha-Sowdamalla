package NumberTheory.Easy;

public class CountSquares {
    static int countSquares(int n) {
        // Initialize count to 0
        int count = 0;
        // Loop through integers starting from 1
        for (int i = 1; i * i < n; i++) {
            count++;
        }
        return count;
    }

}
