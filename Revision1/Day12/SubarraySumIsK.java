// 11. Subarray Sum Equals K

import java.util.HashMap;

class SOlution {
    static int subArraySum(int[] nums, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);

        int count = 0, prefix = 0;

        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            count += hm.getOrDefault(prefix-k,0);
            hm.put(prefix,hm.getOrDefault(prefix, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subArraySum(nums,k));
    }
}