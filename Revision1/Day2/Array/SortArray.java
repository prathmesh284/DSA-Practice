// Sort an Array of 0's,1's and 2's

class Solution {
    static int[] sortArray(int[] nums){
        int ans0 = 0, ans1 = 0, ans2 = 0;
        for(int i = 0; i < nums.length ; i++){
            switch (nums[i]) {
                case 0 -> ans0++;
                case 1 -> ans1++;
                default -> ans2++;
            }
        }
        int i = 0;
        while(ans0 > 0){
            nums[i] = 0;
            ans0--;
            i++;
        }while(ans1 > 0){
            nums[i] = 1;
            ans1--;
            i++;
        }while(ans2 > 0){
            nums[i] = 2;
            ans2--;
            i++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,2,0,0,1};
        int[] ans = sortArray(nums);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}