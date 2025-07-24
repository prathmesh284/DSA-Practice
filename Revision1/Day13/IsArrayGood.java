// 13. Check if Array is Good

import java.util.Arrays;

class Solution {
    static boolean isGood(int[] nums){
        Arrays.sort(nums);
        if(nums.length != nums[nums.length - 1] + 1) return false;
        
        for(int i = 0; i < nums.length -1 ; i++){
            if(nums[i] != i+1){
                return false;
            }
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]) return false;

        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 3};
        System.out.print(isGood(nums));
    }
}