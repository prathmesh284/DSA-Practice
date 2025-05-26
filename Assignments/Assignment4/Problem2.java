// Count Frequency by using HashMap

import java.util.Arrays;
import java.util.HashMap;

class Solution{
    static HashMap<Integer,Integer> countFreq(int[] arr){
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        return map;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,1,4};
        HashMap<Integer,Integer> freq = countFreq(arr);
        System.out.println(freq);
    }
}