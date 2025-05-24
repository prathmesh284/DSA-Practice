//Count Subarray Sum Equals K
import java.util.HashMap;

class Solution{
    static int countSubarraySumEqualsK(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0,prefixSum = 0;
        map.put(0,1);
        for(int i = 0;i < arr.length;i++){
            prefixSum += arr[i];
            count += map.getOrDefault(prefixSum - k,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int k=6;
        System.out.println(countSubarraySumEqualsK(arr,k));
    }
}