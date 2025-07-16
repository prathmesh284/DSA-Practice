// Last Occurance

class Solution {
    static int lastOccurance(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                while(nums[mid] == nums[mid+1]){
                    mid += 1;
                }
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {3,4,13,13,13,20,40};
        int target = 13;
        System.out.println(lastOccurance(nums,target));
    }
}