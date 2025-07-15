// 3Sum

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

class Solution {
    static HashSet<ArrayList<Integer>> threeSum(int[] nums){
        HashSet<ArrayList<Integer>> hs1 = new HashSet<>();
        for(int i = 0; i < nums.length - 1; i++){
            HashSet<Integer> hs2 = new HashSet<>();
            for(int j = i+1; j < nums.length ; j++){
                int third = -(nums[i]+nums[j]);
                if(hs2.contains(third)){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(third);
                    Collections.sort(al);
                    hs1.add(al);
                }
                hs2.add(nums[j]);
            }
        }
        return hs1;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,-1,0,1,2};
        System.out.println(threeSum(nums));
    }
}