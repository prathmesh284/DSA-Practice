// 17. Word Pattern

import java.util.HashMap;

class Solution{
    static boolean isWordPattern(String pattern,String s){
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        HashMap<Character,String> hm = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            if(!hm.containsKey(pattern.charAt(i))){
                hm.put(pattern.charAt(i), str[i]);
            }else{
                if(!hm.get(pattern.charAt(i)).equals(str[i])) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        System.out.println(isWordPattern(pattern,s));
    }
}