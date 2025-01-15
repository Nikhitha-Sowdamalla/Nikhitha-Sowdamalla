package Arrays.Medium;

public class MaxCircularSubarraySum {
    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
               int totalsum = 0;
        int max_so_far = arr[0];
        int curr_max = 0;
        int min_so_far = arr[0];
        int curr_min = 0;

        for (int i = 0; i < arr.length; i++) {
      curr_max = Math.max(arr[i], arr[i] + curr_max);
      max_so_far = Math.max(curr_max, max_so_far);

      curr_min = Math.min(arr[i], arr[i] + curr_min);
      min_so_far = Math.min(curr_min, min_so_far);
      totalsum += arr[i];


    }

    return max_so_far > 0 ? Math.max(max_so_far,totalsum - min_so_far) : max_so_far;
    }
}


//Circular i.e 1 -2 3 -2 flattening the circular subarray 1 -2 3 -2 -2 3 -2 1 --> min = -2-2=4 ; totalsum = 0 ; max = 4 
//totalsum - min = max;
//0-(-4) = 4 
   
//https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/1
