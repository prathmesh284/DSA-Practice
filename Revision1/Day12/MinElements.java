// 7. Minimum Elements to Add to Form a Given Sum

class Solution {
    static int minElements(int[] nums,int limit, int goal){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count += nums[i];
        }

        return (Math.abs(goal-count)/limit);
    }
    public static void main(String[] args) {
        int[] nums = {1,-1,1};
        int limit = 3, goal = -4;
        System.out.println(minElements(nums,limit,goal));
    }
}