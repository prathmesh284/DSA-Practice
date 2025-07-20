// 1. Score of a String

class Solution {
    static int scoreString(String s){
        int val = 0; 
        for(int i = 0; i < s.length(); i++){
            if(i < s.length()-1){
                val += Math.abs(s.charAt(i)-s.charAt(i+1));
            }
        }
        return val;
    }
    public static void main(String[] args) {
        String s = "hello" ;
        System.out.println(scoreString(s));
    }
}