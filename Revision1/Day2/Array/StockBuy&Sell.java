// Stock Buy and Sell 

class Solution {
    static int maxProfit(int[] nums){
        int i = 0, j = nums.length-1;
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        while(i<=j){
            minProfit = Math.min(minProfit, nums[i]);
            i++;
            maxProfit = Math.max(maxProfit, nums[j]);
            j--;
        }
        return (maxProfit-minProfit);   
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}