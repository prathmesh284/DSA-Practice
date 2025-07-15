// Lower Bound

import java.util.Arrays;
class Solution {
    static int lowerBound(int[] nums, int low, int high,int target) {
        int ans = nums.length;
        while(low <= high){
            int mid = low+(low+high)/2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int toSearch = 2;
        Arrays.sort(nums);
        System.out.println(lowerBound(nums,0,nums.length-1,toSearch));
    }
}