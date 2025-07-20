// 5. Truncate Sentence

class Solution {
    static String truncateSentence(String s, int k){
        int count = 0, kInd = 0, kPlueOneInd = 0;
        for(int i = 0; i < s.length(); i++){
            if(count == k){
                kInd = i;
                k = k+1;
            }
            if(count == k+1 || i == s.length()-1){
                kPlueOneInd = i;
            }

            if(s.charAt(i) == ' '){
                count++;
            }
        }
        // System.out.println(kInd);
        // System.out.println(kPlueOneInd);
        return s.substring(0, kInd).concat(""+s.substring(kPlueOneInd+1));
    }
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }
}