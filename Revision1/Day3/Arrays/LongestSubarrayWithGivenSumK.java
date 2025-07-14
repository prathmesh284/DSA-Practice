// Longest subarray with given sum k

import java.util.HashMap;

class Solution {
    static int subarraySum(int[] nums, int k){
        int max = 0, prefix = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            if(prefix == k){
                max = Math.max(max,i+1);
            }
            if(hm.containsKey(prefix-k)){
                max = Math.max(max, i-hm.get(prefix-k));
            }
            hm.put(prefix,i);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,1,9};
        int k = 10;
        System.out.println(subarraySum(nums,k));
    }
}