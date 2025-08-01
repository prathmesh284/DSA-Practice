//Count Is Substring is anagram of string

import java.util.*;

class Solution {
    static int countIsSubarrayIsAnagram(String str, String pat) {
        int patLen = pat.length();
        int strLen = str.length();

        if (patLen > strLen) return 0;

        int[] patFreq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of pattern
        for (char c : pat.toCharArray()) {
            patFreq[c - 'a']++;
        }

        // Frequency of first window
        for (int i = 0; i < patLen; i++) {
            windowFreq[str.charAt(i) - 'a']++;
        }

        int count = 0;
        if (Arrays.equals(patFreq, windowFreq)) count++;

        // Slide the window
        for (int i = patLen; i < strLen; i++) {
            // Remove the leftmost character of previous window
            windowFreq[str.charAt(i - patLen) - 'a']--;
            // Add the new character
            windowFreq[str.charAt(i) - 'a']++;

            if (Arrays.equals(patFreq, windowFreq)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "cbaeedbacb";
        String pat = "abc";
        System.out.println(countIsSubarrayIsAnagram(str, pat)); // Output: 3
    }
}
