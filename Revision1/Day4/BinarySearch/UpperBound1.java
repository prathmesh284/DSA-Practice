// Upper Bound

import java.util.Arrays;

class Solution {
    static int upperBound(int[] nums, int low, int high, int mid, int target) {
        if(low > high){
            return mid+1;
        }
        if(nums[mid] == target){
            if(nums[mid+1] == nums[mid]){
                return upperBound(nums,low,high,mid+1,target);
            }
            return mid+1;
        }
        else if(nums[mid] < target) return upperBound(nums,mid+1,high,low+(low+high)/2,target);
        else return upperBound(nums,low,mid-1,low+(low+high)/2,target);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,3,2,1};
        int toSearch = 2;
        Arrays.sort(nums);
        System.out.println(upperBound(nums,0,nums.length-1,nums.length/2,toSearch));
    }
}