import java.util.HashMap;

class Solution {
    static boolean verifyDict(String[] words, String order) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            hm.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i + 1];
            if (!inCorrectOrder(word1, word2, hm)) {
                return false;
            }
        }
        return true;
    }

    static boolean inCorrectOrder(String w1, String w2, HashMap<Character, Integer> hm) {
        int len = Math.min(w1.length(), w2.length());
        for (int i = 0; i < len; i++) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);
            if (c1 != c2) {
                return hm.get(c1) < hm.get(c2);
            }
        }
        // if all characters matched but one word is longer
        return w1.length() <= w2.length();
    }

    public static void main(String[] args) {
        String[] words = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(verifyDict(words, order)); 
    }
}
