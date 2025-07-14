// Longest Substring with k unique character

import java.util.HashMap;

class Solution {
    static int longestSubstring(String str,int k){
        int i = 0, j = 0;
        int max = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        while(j<str.length()){
            hm.put(str.charAt(j),hm.getOrDefault(str.charAt(j),0)+1);
            if(hm.size() < k){
                j++;
            }else if(hm.size() == k){
                max = Math.max(max,j-i+1);
                j++;
            }
            else{
                while(hm.size() > k){
                    hm.put(str.charAt(i),hm.get(str.charAt(i))-1);
                    if(hm.get(str.charAt(i)) == 0){
                        hm.remove(str.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "abcdacd";
        int k = 3;
        System.out.println(longestSubstring(str,k));
    }
}