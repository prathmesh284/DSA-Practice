// Find Majority Elements appears more than N/2 times

class Solution {
    static int majorityElement(int[] nums){
        int count = 0, ele = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                ele = nums[i];
            }
            if(ele == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}