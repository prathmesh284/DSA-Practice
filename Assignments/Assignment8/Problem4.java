// Find All Numbers Disappeared in an Array

import java.util.ArrayList;
class Solution {

    static ArrayList<Integer> findAllNumbersDisappeared(int[] nums){
        ArrayList<Integer> res = new ArrayList<>();
        int[] ans = new int[nums.length+1];
        for(int i = 0; i < nums.length; i++){
            ans[nums[i]]++;
        }
        for(int i = 1 ; i < ans.length ; i++){
            if(ans[i] == 0){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findAllNumbersDisappeared(nums));
    }
}