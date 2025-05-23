// 4Sum 

//Brute Force
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;
class Solution {
    // static ArrayList<int[]> fourSum(int[] nums,int target) {
    //     ArrayList<int[]> result = new ArrayList<>();
    //     HashSet<Integer> set = new HashSet<>(); 
    //     for(int i = 0; i< nums.length - 3; i++){
    //         for(int j = i+1; j< nums.length - 2; j++){
    //             for(int k = j+1; k< nums.length - 1; k++){
    //                 for(int l = k+1; l< nums.length; l++){
    //                     if(nums[i] + nums[j] + nums[k] + nums[l ]== target  && (!set.contains(nums[i]) || !set.contains(nums[j]) || !set.contains(nums[k])  || !set.contains(nums[l]))){
    //                         int[] triplet = {nums[i], nums[j], nums[k], nums[l]};
    //                         result.add(triplet);
    //                         set.add(nums[i]);
    //                         set.add(nums[j]);
    //                         set.add(nums[k]);
    //                         set.add(nums[l]);
    //                     }   
    //                 }
    //             }
    //         }
    //     }
    //     return result;
    // }

    static ArrayList<ArrayList<Integer>> fourSum(int[] nums,int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>(); 
        for(int i = 0; i< nums.length - 3; i++){
            for(int j = i+1; j< nums.length - 2; j++){
                for(int k = j+1; k< nums.length - 1; k++){
                    for(int l = k+1; l< nums.length; l++){
                        if(nums[i] + nums[j] + nums[k] + nums[l ]== target){
                            ArrayList<Integer> al = new ArrayList<>();
                            al.add(nums[i]);
                            al.add(nums[j]);
                            al.add(nums[k]);
                            al.add(nums[l]);
                            Collections.sort(al);
                            set.add(al);
                            if(!result.contains(al)){
                                result.add(al);
                            }
                        }   
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        ArrayList<ArrayList<Integer>> ans = fourSum(arr,target);
        for(ArrayList<Integer> sol:ans){
            System.out.println(sol);
        }
    }
}
