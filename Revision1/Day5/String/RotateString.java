// Rotate String

import java.util.HashMap;
class Solution {
    static boolean rotateStr(String str1,String str2){
        if((str1+str1).contains(str2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str1 = "abcde";
        String str2 = "cdeab";
        // String str2 = "abced";
        System.out.println(rotateStr(str1,str2));
    }
}