//Reverse words in a String

class Solution{
    static String reverseWordsInString(String str){
        String word = "",ans = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                word = word + str.charAt(i);
            }else if(str.charAt(i) == ' '){
                if(!word.equals(" ")){
                    ans = word +" "+ ans;
                }
                word = "";
            }
        }
        ans = word + " " + ans;
        return ans.substring(0,ans.length()-1);
    }
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWordsInString(str));
    }
}