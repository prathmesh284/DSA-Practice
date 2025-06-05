//Finding the Users Active Minutes

import java.util.HashMap;
import java.util.HashSet;
class Solution{

    static int[] usersActiveMinutes(int[][] logs,int k){
        int[] ans = new int[k];
        HashMap<Integer,HashSet<Integer>> hm = new HashMap<>();
        for (int[] log : logs) {
            hm.putIfAbsent(log[0], new HashSet<>());
            hm.get(log[0]).add(log[1]);
        }
        for(Integer key : hm.keySet()){
            int uam = hm.get(key).size();
            if (uam >= 1 && uam <= k) {
                ans[uam - 1]++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k = 5;
        int[] ans = usersActiveMinutes(logs, k);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}