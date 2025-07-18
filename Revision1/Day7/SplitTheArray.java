// 11. Split the Array

import java.util.*;

class Solution {
    static boolean splitTheArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return false;
        }
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > 2) {
                return false; // more than 2 occurrences, can't split
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // int[] nums = {1,1,2,2,3,4};
        int[] nums = {1, 1, 1, 1};
        Arrays.sort(nums);
        System.out.println(splitTheArray(nums));
    }
}
