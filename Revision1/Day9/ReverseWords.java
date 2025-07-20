// 8. Reverse Words in a String

class Solution {
    static String reverseStr(String s){
        String word = "",reverseStr = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                reverseStr = reverseStr+""+word;
                word = "";
            }
            word = s.charAt(i)+word;
        }
        reverseStr = reverseStr+""+word;

        return reverseStr;
    }
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseStr(s));
    }
}