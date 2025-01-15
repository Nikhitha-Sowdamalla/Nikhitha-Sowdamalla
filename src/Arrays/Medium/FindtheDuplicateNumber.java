package Arrays.Medium;

public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {

    // Start a fast and slow pointer
    // until they meet
    int slow = 0, fast = 0;
    do {
      slow = nums[slow];
      fast = nums[nums[fast]];
    } while (slow != fast);

    // As soon as they meet, move both
    // pointers at same speed until they
    // meet again
    slow = 0;
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
    return slow;
  }

}

//https://leetcode.com/problems/find-the-duplicate-number/
