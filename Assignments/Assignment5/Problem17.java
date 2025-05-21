//Reverse Pairs

class Solution {

    static int reversePairs(int[] nums) {
        int count = 0,ind = 0;
        while(ind< nums.length-1){
            for(int i = ind+1; i < nums.length; i++){
                if(nums[ind] > 2*nums[i]){
                    count++;
                }
            }
            ind++;
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {2,4,3,5,1};
        System.out.println(reversePairs(nums));
    }
}