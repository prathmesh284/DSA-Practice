// Find Floor and Ceil in sorted array
class Solution {
    static String floorNCeil(int[] nums, int x){
        int low = 0;
        int high = nums.length - 1;
        int floor = 0,ceil = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == x){
                floor = mid;
                ceil = mid;
                break;
            }else if(nums[mid] > x){
                high = mid-1;
                floor = mid-1;
                ceil = mid;
            }else{
                low = mid+1;
                floor = mid-1;
                ceil = mid;
            }
        }
        return ""+nums[floor]+" "+nums[ceil]+"" ;
    }
    public static void main(String[] args) {
        int nums[] = {3,4,4,7,8,10};
        int x = 5;
        System.out.println(floorNCeil(nums,x));
    }
}