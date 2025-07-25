// 8. Combination Sum

import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<List<Integer>> ans = new ArrayList<>();

    static void combinationSum(int[] candidates, int target, int ind, List<Integer> al){
        if(target == 0){
            ans.add(new ArrayList<>(al));  // Add a copy
            return;
        }

        if(ind == candidates.length || target < 0){
            return;
        }

        // Choose the current number
        al.add(candidates[ind]);
        combinationSum(candidates, target - candidates[ind], ind, al); // stay at the same index
        al.remove(al.size() - 1);

        // Skip the current number
        combinationSum(candidates, target, ind + 1, al);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        combinationSum(candidates, target, 0, new ArrayList<>());
        System.out.println(ans);  // Expected: [[2, 2, 3], [7]]
    }
}
