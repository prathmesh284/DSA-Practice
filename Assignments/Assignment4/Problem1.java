// Count Frequency of Elements

import java.util.Arrays;

class Solution{
    static int[] countFreq(int[] arr){
        Arrays.sort(arr);
        int index = arr[arr.length-1];
        int[] freq = new int[index+1];
        for(int i = 0; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,1,4};
        int[] freq = countFreq(arr);
        for(int i = 0; i < freq.length ; i++){
            System.out.println(freq[i]);
        }
    }
}