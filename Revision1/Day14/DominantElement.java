// 5. Minimum Index of a Valid Split

class Solution {
    static int mostDominant(int[] nums){
        int count = 1;
        int first = nums[0];

        //Most Frequent Integer:first
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                count = 1;
                first = nums[i];
            }
        }
        //Frequency of first
        count = 0;
        for(int i:nums){
            if(i == first){
                count++;
            }
        }

        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == first){
                counter++;
            }else{
                continue;
            }
            if((i+1) < 2*counter  && (nums.length-i-1) < 2*(count-counter)) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,2};
        // int[] nums = {2,1,3,1,1,1,7,1,2,1};
        System.out.println(mostDominant(nums));
    }
}