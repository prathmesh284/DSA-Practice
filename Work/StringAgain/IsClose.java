// Is two strings are closed?

import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    static boolean isClose(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i = 0; i < s1.length(); i++){
            hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i),0)+1);
        }

        // System.out.println(hm1.keySet());
        // System.out.println(hm2.keySet());
        // System.out.println(hm1.values());
        // System.out.println(hm2.values());

        ArrayList<Integer> list1 = new ArrayList<>(hm1.values());
        ArrayList<Integer> list2 = new ArrayList<>(hm2.values());

        Collections.sort(list1);
        Collections.sort(list2);

        return hm1.keySet().equals(hm2.keySet()) && list1.equals(list2);
    }
    public static void main(String[] args){
        String s1 = "cabbba", s2 = "abbccc";
        System.out.println(isClose(s1,s2));
    }
}