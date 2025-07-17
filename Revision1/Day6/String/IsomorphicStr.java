// Isomorphic Strings

import java.util.HashMap;
class Solution {
    static boolean isIsomorphic(String s,String t){
        if(s.length() != t.length()) return false;
        else if(s.equals(t)) return true;
        HashMap<Character,Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),t.charAt(i));
            }else{
                if(!(hm.get(s.charAt(i)) == t.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "eggaa", t = "addee";
        System.out.println(isIsomorphic(s,t));
    }
}