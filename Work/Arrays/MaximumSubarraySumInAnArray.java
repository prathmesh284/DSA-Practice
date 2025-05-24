//Maximum Subarray Sum in an Array
class Solution{

    // static int maxSubArray(int[] arr){
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int i = 0; i<arr.length; i++){
    //         for(int j = i; j<arr.length; j++){
    //             int currentSum = 0;
    //             for(int k = i;k<=j;k++){
    //                 currentSum += arr[k];                            //Time Complexity: O(n^3)
    //             }                                                    //Space Complexity: O(1)
    //             maxSum = Math.max(maxSum,currentSum);
    //         }     
    //     }   
    //     return maxSum;
    // }

    static int maxSubArray(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            int currentSum = 0;
            for(int j = i; j<arr.length; j++){                          //Time Complexity: O(n^2)
                currentSum += arr[j];                                   //Space Complexity: O(1)
                maxSum = Math.max(maxSum,currentSum);
            }     
        }   
        return maxSum;
    }

    //For Maximum Maximum Subarray Sum in an Array by using Kadanes's Algorithm
    //go to Kadane'sAlgorithm.java
    //Time Complexity: O(n)
    //Space Complexity: O(1)


    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        //Output:6
    }
}