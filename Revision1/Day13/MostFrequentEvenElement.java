// 15. Most Frequent Even Element

import java.util.Arrays;

class Solution {
    static int mostFreqEven(int[] nums){
        Arrays.sort(nums);

        int count = 1, maxCount = 0;
        int element = 0;
        for(int i=1; i < nums.length; i++){
            if(nums[i]%2 == 0){
                if(nums[i] != nums[i-1]){
                    maxCount = Math.max(maxCount, count);
                    if(maxCount == count){
                        element = nums[i];
                    }
                    count = 1;
                }else{
                    count++;
                }
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] nums = {4,4,4,9,2,4};
        System.out.println(mostFreqEven(nums));
    }
}