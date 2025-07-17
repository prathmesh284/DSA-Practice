//5. Minimum Operations to Make the Array Increasing

class Solution {
    static int minOp(int[] nums){
        int sum = 0;
        if(nums.length < 2) return 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int count = nums[i-1]-nums[i]+1;
                nums[i] += count;
                sum += count;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1};
        System.out.println(minOp(nums));
    }
}