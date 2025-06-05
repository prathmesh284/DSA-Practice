// Palindrome Partitioning

import java.util.ArrayList;

class Solution {
    // static ArrayList<ArrayList<String>> result = new ArrayList<>();

    static void backtrack(String s, int start, ArrayList<String> current) {
        if (start == s.length()) {
            System.out.println(current);
            // result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)) {
                current.add(substring);
                backtrack(s, end, current);
                current.remove(current.size() - 1); // backtrack
            }
        }
    }

    static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        backtrack(s, 0, new ArrayList<>());
        System.out.println("Palindrome Partitions:");
        // for (ArrayList<String> partition : result) {
        //     System.out.println(partition);
        // }
    }
}
