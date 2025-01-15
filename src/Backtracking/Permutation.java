package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutations(nums, 0, result);
        return result;
    }
    private void generatePermutations(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> currentPerm = new ArrayList<>();
            for (int num : nums) {
                currentPerm.add(num);
            }
            result.add(currentPerm);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            generatePermutations(nums, index + 1, result);
            swap(nums, index, i); //backtracking step
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
