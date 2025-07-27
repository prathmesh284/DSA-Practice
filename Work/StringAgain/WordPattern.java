// Word Pattern

import java.util.HashMap;
import java.util.HashSet;

class Solution {

    static boolean isWordPattern1(String pattern,String s){
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        HashMap<Character,String> hm = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(!set.contains(str[i])){
                    hm.put(pattern.charAt(i), str[i]);
                    set.add(str[i]);
                }else{
                    return false;
                }
            }else{
                if(!hm.get(pattern.charAt(i)).equals(str[i])) return false;
            }
        }
        return true;
    }

    static boolean isWordPattern2(String str1, String str2) {
        HashMap<Character, String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        String[] words = str2.split(" ");
        if (words.length != str1.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(str1.charAt(i))) {
                if (!hm.get(str1.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                if (hs.contains(words[i])) {
                    return false;
                }
                hm.put(str1.charAt(i), words[i]);
                hs.add(words[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abbc", s = "dog cat cat dog";
        System.out.println(isWordPattern1(pattern,s));
        System.out.println(isWordPattern2(pattern,s));
    }
}
