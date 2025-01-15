//package Backtracking;
//
//import java.util.ArrayList;
////import java.util.LinkedList;
//import java.util.List;
//
//public class CombinationSum {
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> current = new LinkedList<>();
//        generateCombinations(candidates, target, 0, current, result);
//        return result;
//    }
//
//    private void generateCombinations(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {
//        // Base condition: If target is 0, add current combination to result
//        if (target == 0) {
//            result.add(new ArrayList<>(current));
//            return;
//        }
//
//        // If target becomes negative, stop further processing
//        if (target < 0) {
//            return;
//        }
//
//        // Loop through candidates starting from 'index' to allow reuse of the same number
//        for (int i = index; i < candidates.length; i++) {
//            current.add(candidates[i]);  // Choose the current number
//            generateCombinations(candidates, target - candidates[i], i, current, result);  // Recur with updated target
//            current.remove(current.size() - 1);  // Backtrack
//        }
//    }
//
//}
