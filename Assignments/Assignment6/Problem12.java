//Find Common Characters

import java.util.HashMap;
import java.util.ArrayList;

class Solution {

    static ArrayList<Character> commonCharacters(String[] words) {
        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Character> al = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                if (i == words.length - 1) {
                    hm.put(ch, hm.getOrDefault(ch, 0) - 2);
                    continue;
                }
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }
        }

        for (Character ch : hm.keySet()) {
            if (hm.get(ch) == 0) {
                al.add(ch);
            }
        }

        return al;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonCharacters(words));

    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(n)
