// 1. Third Maximum Number

class Solution {
    static int thirdMax(int[] nums){
        int firstMax = 0;
        int secondMax = firstMax;
        int thirdMax = secondMax;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            }else if(nums[i] < firstMax && nums[i] > secondMax){
                thirdMax = secondMax;
                secondMax = nums[i];
            }else if(nums[i] < secondMax && nums[i] > thirdMax){
                thirdMax = nums[i];
            }
        }
        return thirdMax;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
}