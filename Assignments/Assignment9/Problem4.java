//Subset with Maximum Product

import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    static void maxProductSubsequence(int[] arr,int ind,int product,ArrayList<Integer> al,HashMap<Integer,ArrayList<Integer>> hm){
        if(arr.length == ind){
            if(al.size() > 1){
                if(product > 0 && !al.isEmpty()){
                    hm.put(product, new ArrayList<>(al));
                }
            }
            return;
        }
        al.add(arr[ind]);
        maxProductSubsequence(arr,ind+1,product*arr[ind],al,hm);
        al.remove(al.size()-1);
        maxProductSubsequence(arr,ind+1,product,al,hm);
    }
    public static void main(String[] args){
        int[] arr = {1, -2, -3, 4};
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        maxProductSubsequence(arr, 0, 1, new ArrayList<>() , hm);
        int max = Integer.MIN_VALUE;
        for(Integer key:hm.keySet()){
            max = Math.max(max,key);
        }
        System.out.println(hm.get(max));
    }
}