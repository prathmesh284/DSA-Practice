//Subarray sum equals k

import java.util.HashMap;
class Solution {
    static int subarraySum(int[] nums, int k){
        int count = 0, prefix = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            count += hm.getOrDefault(prefix-k,0);
            hm.put(prefix,hm.getOrDefault(prefix, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int k = 6;
        System.out.println(subarraySum(nums,k));
    }
}