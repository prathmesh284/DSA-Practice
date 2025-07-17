//1. Count Equal and Divisible Pairs in an Array

class Solution {
    static void equalAndDivisible(int[] nums,int k){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && (i*j)%2 == 0){
                    System.out.println(i+","+j);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {3,1,2,2,2,1,3};
        int k = 2;
        equalAndDivisible(nums,k);
    }
}