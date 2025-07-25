// 1. Finding the Users Active Minutes

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    static int[] findUAM(int[][] logs, int k){
        int[] ans = new int[k];
        HashSet<int[]> hs = new HashSet<>();
        for(int[] i:logs){
            hs.add(i);
        }
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int[] log : hs) {
            if (!hm.containsKey(log[0])) {
                hm.put(log[0], hm.getOrDefault(log[0], 0) + 1);
            } else {
                if (log[0] == log[0] && log[1] != log[1]) {
                    hm.put(log[0], hm.getOrDefault(log[0], 0) + 1);
                }
            }
        }

        for(Integer i:hm.keySet()){
            ans[hm.get(i)]++;
        }

        return ans;
    }
    public static void main(String[] args){
        int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k = 5;
        int[] ans = findUAM(logs,k);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}