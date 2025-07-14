//Longest Subarray with given sum k

import java.util.HashMap;

class Solution {
    static int longestSubarray(int[] nums, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = 0, prefixSum = 0;
        for(int i = 0; i < nums.length ; i++){
            prefixSum += nums[i];
            if(prefixSum == k){
                max = Math.max(max,i+1);
            }
            int remaining = prefixSum - k;
            if(hm.containsKey(remaining)){
                int len = i - hm.get(remaining);
                max = Math.max(max,len);
            }
            hm.put(prefixSum,i);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        int k = 5;
        System.out.println(longestSubarray(nums,k));
    }
}