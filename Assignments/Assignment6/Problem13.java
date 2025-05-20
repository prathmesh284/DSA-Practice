//Delete Characters to Make Fancy String

class Solution {

    static String deleteCharacters(String s) {
        String result = "";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                result += s.charAt(i);  // Concatenate to result
            }
        }
        return result;
    }
    

    public static void main(String[] args) {
        String s = "leeetcode";
        System.out.println(deleteCharacters(s));

    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
