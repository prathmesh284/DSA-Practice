//Sort Array By Parity

import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> sortByParity(int[] nums){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                al.add(0,nums[i]);
            }else{
                al.add(nums[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int[]  nums = {3,1,2,4};
        System.out.println(sortByParity(nums));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(n)
