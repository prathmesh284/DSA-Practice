// Find First Palindromic String in the Array

class Solution {
    static String palindromic(String[] s){
        for (String item : s) {
            for(int i = 0; i <=item.length()/2 ; i++){
                if(item.charAt(i) == item.charAt(item.length()-1-i)){
                    if(i == item.length()/2){
                        return item;
                    }
                }else{
                    break;
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.print(palindromic(words));
    }
}
// Time Complexity: O(n^2)
// Space Complexity: O(1)