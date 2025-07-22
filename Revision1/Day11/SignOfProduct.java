// 18. Sign of the Product of an Array

class Solution {
    static int signFun(int[] nums){
        int mul = 1;
        for(int i=0; i<nums.length; i++){
            mul *= nums[i];
        }

        if(mul > 0){
            return 1;
        }else if(mul == 0){
            return 0;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,3,2,1};
        System.out.println(signFun(nums));
    }
}