//Minimum Number of Operations to Move All Balls to Each Box

import java.util.ArrayList;
import java.util.HashMap;
class Solution{
    static ArrayList minOperationsToMove(String str){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i<str.length();i++){
            int sum = 0;
            for(int j = 0; j<str.length();j++){
                if(i != j && str.charAt(j) == '1'){
                    sum += Math.abs(i-j);
                }
            }
            hm.put(i,sum);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer key:hm.keySet()){
            al.add(hm.get(key));
        }
        return al;
    }
    public static void main(String[] args) {
        String s = "001011";
        System.out.println(minOperationsToMove(s));
    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(n)