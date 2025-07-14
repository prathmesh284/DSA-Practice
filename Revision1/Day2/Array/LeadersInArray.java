//Leaders In Array

import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> leaders(int[] nums){
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(nums[nums.length-1]);
        int max = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] > max){
                max = nums[i];
                leaders.add(nums[i]);
            }
        }
        return leaders;
    }
    public static void main(String[] args) {
        int[] nums = {4,7,1,0};
        System.out.println(leaders(nums));
    }
}