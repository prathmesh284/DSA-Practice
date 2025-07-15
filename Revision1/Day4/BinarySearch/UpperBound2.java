// Upper Bound

import java.util.Arrays;
class Solution {
    static int upperBound(int[] nums, int low, int high,int target) {
        int ans = nums.length;
        while(low <= high){
            int mid = low+(high-low)/2;
            // if(nums[mid] > target){
            //     ans = mid;   
            //     high = mid-1;
            // }else{
            //     low = mid+1;
            // }
            if(nums[mid] <= target){
                low = mid+1;
            }else{
                ans = mid;   
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,6,7,10};
        int toSearch = 2;
        Arrays.sort(nums);
        System.out.println(upperBound(nums,0,nums.length-1,toSearch));
    }
}