// Reverse Words in a String

class Solution {
    static String reverseWords(String s){
        String words = "",sentence = "";
        for (int i = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                sentence = sentence+" "+words;
                words = "";
            }else{
                words = s.charAt(i)+words;
            }
        }
        sentence = sentence+" "+words;
        return sentence;
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.print(reverseWords(s));
    }
}
// Time Complexity: O(n) 
// Space Complexity: O(1)