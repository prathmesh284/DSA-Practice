// Longest Substring without repeating character

import java.util.HashMap;

class Solution {
    static int longestSubstring(String str,int k){
        int i = 0, j = 0;
        int max = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        while(j<str.length()){
            hm.put(str.charAt(j),hm.getOrDefault(str.charAt(j),0)+1);
            if(hm.size() < j-i+1){
                while(hm.size() < j-i+1){
                    if(hm.get(str.charAt(i)) == 1){
                        hm.remove(str.charAt(i));
                    }else{
                        hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)-1);
                    }
                    i++;
                }
            }
            else if(hm.size() == j-i+1){
                max = Math.max(max, hm.size());
            }
            j++;
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcdacd";
        int k = 3;
        System.out.println(longestSubstring(str,k));
    }
}