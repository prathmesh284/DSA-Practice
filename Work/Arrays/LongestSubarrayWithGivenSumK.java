//Longest subarray with given sum K
import java.util.HashMap;

class Solution{

    static int LongestSubarrayWithGivenSumK(int[] arr, int k){
        int maxLength = 0;
        int prefixSum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            if(prefixSum == k){
                maxLength = Math.max(maxLength,i+1);
            }
            int rem = prefixSum - k;
            if(hm.containsKey(rem)){
                maxLength = Math.max(maxLength,i-hm.get(rem));
            }
            //hm.put(preficSum,i);             // for positive prefixSum values, we need to store the first occurrence of prefixSum
            hm.putIfAbsent(prefixSum,i);        // for all prefixSum values, we need to store the first occurrence of prefixSum
            //if(!hm.containsKey(prefixSum)){
            //  hm.put(prefixSum,i);           // also we can use this line instead of the above line
            //}                                // for all prefixSum values, we need to store the first occurrence of prefixSum
        }
        return maxLength;
    }

    public static void main(String[] args){
        int[] arr = {1,-1,1,0,2,3,3,4,5};
        int k = 6;
        System.out.println(LongestSubarrayWithGivenSumK(arr,k));
    }
}