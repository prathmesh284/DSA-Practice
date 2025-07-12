// Two Sum

import java.util.HashMap;

class Solution {
    // static void twoSum(int[] arr, int target){
    //     HashMap<Integer,Integer> hm = new HashMap<>();
    //     for(int i = 0; i < arr.length; i++){
    //         if(!hm.containsKey(arr[i])){
    //             hm.put(target-arr[i],arr[i]);
    //         }else{
    //             System.out.println("["+arr[i]+","+hm.get(arr[i])+"]");
    //         }
    //     }
    // }

    static void twoSum(int[] arr, int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(!hm.containsKey(arr[i])){
                hm.put(target-arr[i],i);
            }else{
                System.out.println("["+hm.get(arr[i])+","+i+"]");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        twoSum(arr,target);
    }
}