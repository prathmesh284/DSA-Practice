// Check 2 Strings are anagrams of each other

import java.util.HashMap;
class Solution {
    static boolean isAnagram(String str1,String str2){
        if(str1.equals(str2)) return true;
        else if(str1.length() != str2.length()) return false;

        HashMap<Character,Integer> hm  = new HashMap<>();
        //Add str1's characters
        for(int i = 0; i <str1.length(); i++){
            hm.put(str1.charAt(i),hm.getOrDefault(str1.charAt(i),0)+1);
        }
        //Remove str2's characters
        for(int i = 0; i <str2.length(); i++){
            hm.put(str2.charAt(i),hm.getOrDefault(str2.charAt(i),0)-1);
        }

        // System.out.println(hm);
        
        //if all key elements in hashmap has 0 then both are Anagram
        for(Character ch: hm.keySet()){
            if(hm.get(ch) != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str1 = "CAT", str2 = "ACT";
        System.out.println(isAnagram(str1,str2));
    }
}