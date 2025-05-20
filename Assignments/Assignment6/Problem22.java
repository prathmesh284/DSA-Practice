//Verifying an Alien Dictionary

import java.util.HashMap;
class Solution {
    static boolean verifyAlienDictionary(String[] words,String order) {
        HashMap<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            orderMap.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            if (!inCorrectOrder(word1, word2, orderMap)) {
                return false;
            }
        }
        return true;
    }

    private static boolean inCorrectOrder(String word1, String word2, HashMap<Character, Integer> orderMap) {
        int minLen = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minLen; i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            if (c1 != c2) {
                return orderMap.get(c1) < orderMap.get(c2);
            }
        }
        return word1.length() <= word2.length();
    }

    public static void main(String[] args) {
        String[]  words = {"hello","leetcode"};
        String  order = "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(verifyAlienDictionary(words,order));
    }
}
// Time Complexity: O(2n+m)
// Space Complexity: O(26)
