// 10. Find the Score of All Prefixes of an Array

class Solution {
    static int[] prefixOfArray(int[] nums){
        int prefix = 0;
        for(int i = 0; i < nums.length; i++){
            prefix += nums[i];
            nums[i] = 2*prefix;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {2,3,7,6,10};
        int[] ans = prefixOfArray(nums);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}