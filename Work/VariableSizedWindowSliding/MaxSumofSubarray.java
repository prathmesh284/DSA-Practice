// Subarray sum equals K

class Solution {
    static int subArraySumK(int[] nums, int k){
        int i = 0, j = 0;
        int sum = 0, count = 0;
        while(j < nums.length){
            sum += nums[j];
            if(sum < k){
                j++;
            }else if(sum == k){
                count++;
                j++;
            }else{
                while(i < j && sum > k){
                    sum -= nums[i];
                    i++;
                }
                if(sum == k){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,1,1,1};
        int k = 4;
        System.out.println(subArraySumK(nums,k));
    }
}