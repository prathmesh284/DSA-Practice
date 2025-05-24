//Maximum Subarray Sum in an Array by using Kadane's Algorithm
//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution{
    static int maxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            currentSum += arr[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}