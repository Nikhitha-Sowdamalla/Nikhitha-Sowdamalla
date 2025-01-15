package NumberTheory.Easy;

import java.util.ArrayList;

public class MultiplicationTable {
    static ArrayList<Integer> getTable(int N){
        // code here
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=1;i<=10;i++)
        {
            ar.add(N*i);
        }
        return ar;
    }

}
