// 17. Reverse Pairs

class Solution {
    static int reversePairs(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > 2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        System.out.println(reversePairs(nums));
    }
}