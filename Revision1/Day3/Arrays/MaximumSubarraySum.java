// Maximum subarray sum
// Kadane's algorithm

class Solution {
    static int maximumSubarraySum(int[] nums){
        int sum = 0,max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length ; i++){
            sum += nums[i];
            max = Math.max(max,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarraySum(nums));
    }
}