// Reverse words in String

class Solution {
    static String reverseWords(String str){
        String word = "";
        String reverseStr = "";
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == ' '){
                if(i > 0 && str.charAt(i-1) != ' '){
                    reverseStr = word+" "+reverseStr;
                }
                word = "";
            }else{
                word += str.charAt(i);
            }
        }
        if (!word.isEmpty()) {
            reverseStr = word+" "+reverseStr;
        }
        return reverseStr;
    }
    public static void main(String[] args){
        String str = "the sky is blue";
        // String str = "   hello world   ";
        System.out.println(reverseWords(str));
    }
}