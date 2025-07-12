// Max in subarray with size K
class Solution {
    static int maxInSubArray(int[] arr, int k){
        int sum = 0;
        for(int i=0; i<k ; i++){
            sum+=arr[i];                //Creates window
        }
        int maxSum = sum;
        for(int i = k ; i < arr.length ; i++){
            sum -= arr[i-k];
            sum += arr[i];
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        System.out.println(maxInSubArray(arr,k));
    }
}