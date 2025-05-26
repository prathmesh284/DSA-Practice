// Check for Duplicates in Array

import java.util.Arrays;
import java.util.HashMap;

class Solution{
    static boolean countFreq(int[] arr){
        Arrays.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key) > 1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,1,4};
        System.out.println(countFreq(arr));
    }
}