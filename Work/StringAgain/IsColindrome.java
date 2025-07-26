// Is string colindrome?

class Solution {
    static boolean isColindrome(String str){
        if(str.length()%6 != 0) return false;
        int i = 0;
        while( i < str.length()){
            if(!(isPalindrome(str.substring(i,i+6)))) return false;
            i += 6;
        }
        return true;
    }
    static boolean isPalindrome(String str){
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abccbadaccad";
        System.out.println(isColindrome(str));
    }
}