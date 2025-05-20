// Truncate Sentence

class Solution {
    static String[] truncateSentence(String s ,int k){
        String[] str = new String[k];
        int ind = 0;String word = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' && (ind < k)){
                str[ind++] = word;
                word = "";
            }else{
                word += s.charAt(i);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String sentences = "Hello how are you Contestant";int k = 4;
        String[] str = truncateSentence(sentences,k);
        for(String s : str){
            System.out.print(s+" ");
        }
    }
}
// Time Complexity: O(n)
// Space Complexity: O(k)