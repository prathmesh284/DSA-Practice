// 5. Find All Anagrams in a String

import java.util.ArrayList;
class Solution {
    static void allAnagrams(String p,int ind,String ans, boolean[] visited, ArrayList<String> al){
        for(int i = 0 ; i < p.length() ; i++){
            if(ans.length() == p.length()){
                // System.out.println(ans);
                al.add(ans);
                return;
            }
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            allAnagrams(p,ind+1,ans+p.charAt(i),visited,al);
            visited[i] = false;
        }
    }
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        ArrayList<String> al = new ArrayList<>();
        allAnagrams(p, 0, "", new boolean[p.length()], al);
        System.out.println(al);
        for(int i = 0; i < s.length()-p.length()+1; i++){
            if(al.contains(s.substring(i,i+p.length()))){
                System.out.println(s.substring(i,i+p.length()));
            }
        }
    }
}