package Sorting.Medium;

public class NextPermutation {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n-2;

        while(i>=0 && nums[i+1]<=nums[i])
        {
            --i;//Fixing i position in order to compare with the next largest element in the array
        }

        if(i>=0)
        {
            int j = n-1;
            while(j>=0 && nums[j]<=nums[i]) // j will decrement until it finds arr[j]>arr[i] from the end
            {
                --j;
            }
            //once it finds the elements will be swapped 
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            reverse(nums,i+1,n-1); // the remaining elements in the array will be reversed
        }
        else // if the given array does not have lexicographical larger rearrangement just reverse the array i.e., array elements will be arranged in ascending order 
        {
            reverse(nums,0,n-1);
        }
        
    }

    private void reverse(int[] nums,int i,int j)
    {
        while(i<j)
        {
         int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        ++i;
        --j;

        }
        
    }

}
