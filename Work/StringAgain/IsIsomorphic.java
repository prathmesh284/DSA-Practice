// Is two strings are isomorphic

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    static boolean isIsomorphic(String str1,String str2){
        if(str1.length() != str2.length()) return false;
        HashMap<Character,Character> hm = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < str1.length(); i++){
            if(!hm.containsKey(str1.charAt(i))){
                if(!set.contains(str2.charAt(i))){
                    hm.put(str1.charAt(i),str2.charAt(i));
                    set.add(str2.charAt(i));
                }
                else return false;
            }else if(hm.containsKey(str1.charAt(i))){
                if(!set.contains(str2.charAt(i))) return false;
                if(hm.get(str1.charAt(i)) != str2.charAt(i)) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str1 = "pazer", str2 = "title";
        System.out.println(isIsomorphic(str1,str2));
    }
}