//Majority Element N/3

import java.util.HashMap;
class Solution {
    static void majorityElement(int[] nums){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        for(Integer key:hm.keySet()){
            if(hm.get(key) > nums.length/3){
                System.out.print(key+" ");
            }
        }
    }
    public static void main(String[] args) {
        // int nums[] = {1,2,2,3,2};
        int nums[] = {11,33,33,11,11,33};
        majorityElement(nums);
    }
}