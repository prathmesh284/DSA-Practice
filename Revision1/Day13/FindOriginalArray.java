// 12. Find Original Array From Doubled Array

import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    static ArrayList<Integer> findOGArray(int[] changed){
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i = 0; i < changed.length; i++){
            if(hm.containsKey(changed[i])){
                al.add(hm.get(changed[i]));
            }
            else{
                hm.put(2*changed[i], changed[i]);
            }
        }
        return al;
    }
    public static void main(String[] args){
        int[] changed = {1,3,4,2,6,8};
        ArrayList<Integer> ans = findOGArray(changed);
        for(Integer i:ans){
            System.out.print(i+" ");
        }
    }
}