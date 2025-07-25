// 4. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    static ArrayList<Integer> disappearedNum(int[] nums){
        Arrays.sort(nums);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        // int[] nums = {1,1};
        System.out.println(disappearedNum(nums));
    }
}