package Arrays.Medium;

import java.util.Arrays;

public class Swappingpairsmakesumequal {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
        int n = a.length;
        int m = b.length;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int suma = 0; 
        int sumb =0;

     for (int element : a) {
             suma += element; // Add each element to the sum
            }
            
     for (int element : b) {
             sumb += element; // Add each element to the sum
            }
            
            if((suma-sumb)%2!=0)
            {
                return false;
            }
            
           int Target = (suma-sumb)/2;
            int i=0;
            int j=0;
            
            while(i<n&&j<m)
            {
                int diff = a[i] - b[j];
                if(diff==Target)
                {
                    return true;
                }
                
                if(diff<Target)
                {
                    i++;
                }
                else
                {
                    j++;
                }
            }
            return false;
    }

}
