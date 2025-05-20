// Check if the Sentence Is Pangram

class Solution {
    static boolean isPangram(String s){
        int[] arr = new int[26];
        for (int i = 0; i< s.length(); i++){
            arr[s.charAt(i)-'a'] += 1;
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        // String s = "leetcode";
        System.out.print(isPangram(s));
    }
}
// Time Complexity: O(n+m) where, m = s.length() and n = 26 Aplhabets
// Space Complexity: O(n)