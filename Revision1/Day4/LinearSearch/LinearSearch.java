// Linear Search

class Solution {
    static int linearSearch(int[] nums,int toSearch){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == toSearch){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,6,8,9,12};
        int toSearch = 8;
        int ans = linearSearch(nums,toSearch);
        if(ans != -1){
            System.out.println("Element fount at: "+ans+"th place");
        }else{
            System.out.println("Element not found!");
        }
    }
}