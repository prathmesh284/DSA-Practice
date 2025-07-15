// Binary Search

class Solution {
    static int binarySearch(int[] nums, int low, int high, int target) {
        if(low > high){
            return -1;
        }
        int mid = low+(low+high)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target) return binarySearch(nums,mid+1,high,target);
        else return binarySearch(nums,low,mid-1,target);
    }
    public static void main(String[] args) {
        int[] nums = {2,3,6,8,9,12};
        int toSearch = 8;
        int ans = binarySearch(nums,0,nums.length-1,toSearch);
        if(ans != -1){
            System.out.println("Element fount at: "+ans+"th place");
        }else{
            System.out.println("Element not found!");
        }
    }
}