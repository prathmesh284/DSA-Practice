// 12. Find the Middle Index in Array

import java.util.HashMap;

class Solution {
    static int middleOfArray(int[] nums){
        int prefix = 0;
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++){
            totalSum = totalSum + nums[i];
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            if(!hm.containsKey(prefix)){
                hm.put(totalSum-prefix, i);
            }else{
                return hm.get(prefix)+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,5};
        System.out.println(middleOfArray(nums));
    }
}