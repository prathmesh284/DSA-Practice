// Sign of the Product of an Array

class Solution {
    static int signFunc(int[] nums){
        int product = 1;
        for(int i = 0; i < nums.length; i++){
           product *= nums[i];
        }
        if(product > 0) return 1;
        else if(product == 0) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-2,1};
        System.out.println(signFunc(nums));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
