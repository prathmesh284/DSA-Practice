//Count Inversions in an Array

class Solution {

    static int inversePairs(int[] nums) {
        int count = 0,ind = 0;
        while(ind< nums.length-1){
            for(int i = ind+1; i < nums.length; i++){
                if(nums[ind] > nums[i]){
                    count++;
                }
            }
            ind++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {5,3,2,1,4};
        System.out.println(inversePairs(nums));
    }
}