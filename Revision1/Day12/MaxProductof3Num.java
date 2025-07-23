// 10. Maximum Product of Three Numbers

import java.util.Arrays;
class Solution {
    static int maxProduct(int[] nums){
        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(maxProduct(nums));
    }
}