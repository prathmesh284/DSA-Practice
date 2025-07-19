// Removing Minimum and Maximum From Array

class Solution {
    static int stepsToRemove(int[] nums){
        int min = Integer.MAX_VALUE, max= Integer.MIN_VALUE, maxInd = 0, minInd = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            if(max == nums[i]){
                maxInd = i;
            }
            min = Math.min(min, nums[i]);
            if(min == nums[i]){
                minInd = i;
            }
        }

        // System.out.println(minInd);
        // System.out.println(maxInd);
        int minSteps = Integer.MAX_VALUE;
        
        minSteps = Math.min(minSteps, (minInd + 1)+(nums.length - maxInd));
        // System.out.println(minSteps); 
        minSteps = Math.min(minSteps, (maxInd + 1)+(nums.length - minInd)); 
        // System.out.println(minSteps);
        minSteps = Math.min(minSteps, (minInd + 1) + (maxInd + 1)); 
        // System.out.println(minSteps);
        minSteps = Math.min(minSteps, (nums.length - minInd) +(nums.length - maxInd)); 
        // System.out.println(minSteps);

        return minSteps;
    }
    public static void main(String[] args) {
        int[] nums = {2,10,7,5,4,1,8,6};
        System.out.println(stepsToRemove(nums));
    }
}