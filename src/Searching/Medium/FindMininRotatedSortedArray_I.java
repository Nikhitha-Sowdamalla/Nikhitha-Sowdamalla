package Searching.Medium;

public class FindMininRotatedSortedArray_I {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<high)
        {
            while (low < high && nums[low] == nums[high]) {
                high--;
            }

           int mid = low+(high-low)/2;

           if(nums[mid]>nums[high])
           {
            low = mid+1;
           }
           else
           {
            high = mid;
           }

        }
        return nums[low];
        
    }
}
