package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation_II {
	   public List<List<Integer>> permuteUnique(int[] nums) {
	        List<List<Integer>> result = new ArrayList<>();
	        generateUniquePermutations(nums, 0, result);
	        return result;
	    }
	    private void generateUniquePermutations(int[] nums, int index, List<List<Integer>> result) {
	        if (index == nums.length) {
	            List<Integer> currentPerm = new ArrayList<>();
	            for (int num : nums) {
	                currentPerm.add(num);
	            }
	            result.add(currentPerm);
	            return;
	        }

	        for (int i = index; i < nums.length; i++) {
	            // Check for duplicates in the current range
	            boolean isDuplicate = false;
	            for (int j = index; j < i; j++) {
	                if (nums[j] == nums[i]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }
	            if (isDuplicate) continue;

	            swap(nums, index, i);
	            generateUniquePermutations(nums, index + 1, result);
	            swap(nums, index, i); // Backtracking
	        }
	    }

	    private void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }

}
