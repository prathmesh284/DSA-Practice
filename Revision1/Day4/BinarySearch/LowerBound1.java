// Lower Bound

import java.util.Arrays;

class Solution {
    static int lowerBound(int[] nums, int low, int high, int mid, int target) {
        if(low > high){
            return mid+1;
        }
        if(nums[mid] == target){
            if(nums[mid-1] == nums[mid]){
                return lowerBound(nums,low,high,mid-1,target);
            }
            return mid;
        }
        else if(nums[mid] < target) return lowerBound(nums,mid+1,high,low+(low+high)/2,target);
        else return lowerBound(nums,low,mid-1,low+(low+high)/2,target);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int toSearch = 2;
        Arrays.sort(nums);
        System.out.println(lowerBound(nums,0,nums.length-1,nums.length/2,toSearch));
    }
}