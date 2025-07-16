// Seatch in Rotated Array

class Solution {
    static int searchInRotatedArray(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                if(nums[low] > target){
                    low = mid + 1;
                }else{
                    high = mid-1;
                }
            }else{
                if(nums[low] > target){
                    high = mid-1;
                }else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2,3};
        int target = 7;
        System.out.println(searchInRotatedArray(nums,target));
    }
}