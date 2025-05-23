// Maximum Product of Three Numbers

class Solution{
    static int maxProduct(int[] nums){
        int n = nums.length;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = Math.max(firstMax, nums[i]);
            }else if (nums[i] < firstMax && nums[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = Math.max(nums[i], secondMax);
            }else if (nums[i] < secondMax && nums[i] > thirdMax) {
                thirdMax = Math.max(nums[i], thirdMax);
            }
        }
        return firstMax*secondMax*thirdMax;
    }
    public static void main(String[] args) {
        int [] nums = {-1,-2,-3,-4};
        System.out.println(maxProduct(nums));
    }
}