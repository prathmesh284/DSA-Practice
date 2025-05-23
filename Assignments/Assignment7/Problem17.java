// Word Pattern

import java.util.HashMap;
class Solution{
    static boolean wordPattern(String pattern,String s){
        HashMap<Character,String> hm = new HashMap<>();
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        for(int i = 0; i < pattern.length() ; i++){
            if(!hm.containsKey(pattern.charAt(i))){
                hm.put(pattern.charAt(i),str[i]);
            }else{
                if(!hm.get(pattern.charAt(i)).equals(str[i])) return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
}