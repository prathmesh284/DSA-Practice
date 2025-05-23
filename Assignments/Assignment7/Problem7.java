// Minimum Elements to Add to Form a Given Sum

class Solution{
    static int minElements(int[] nums,int limit,int goal){
        int count = 0;
        for(int i = 0; i < nums.length ; i++){
            count += nums[i];
        }
        return (Math.abs( goal - count )/limit)+1;
    }
    public static void main(String[] args) {
        // int[] nums = {1,-1,1};
        // int limit = 3;
        // int goal = -4;
        int [] nums = {1,-10,9,1};
        int limit = 100;
        int goal = 0;
        System.out.println(minElements(nums,limit,goal));
    }
}