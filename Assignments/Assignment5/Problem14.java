// Removing Minimum and Maximum From Array
class Solution {
    static int removeMinMax(int[] nums) {
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE,indexMax = 0;
        int indexMin = 0;

        for(int i = 0;i < nums.length ; i++){
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);

            if(nums[i] == min){
                if(i > nums.length/2){
                    indexMin = nums.length-i;
                }else{
                    indexMin = i+1;
                }
            }
            if(nums[i] == max){
                if(i > nums.length/2){
                    indexMax = nums.length-i;
                }else{
                    indexMax = i+1;
                }
            }
        }
        System.out.println(indexMin);
        System.out.println(indexMax);
        return Math.abs(indexMax+indexMin);
    }

    public static void main(String[] args) {
        int[] nums = {0,-4,19,1,8,-2,-3,5};
        System.out.println(removeMinMax(nums));
    }
}