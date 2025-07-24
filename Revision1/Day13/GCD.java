// 20. Greatest Common Divisor of Strings

class Solution {
    static String gcd(String str1,String str2){
        String ans = "";

        for(int i = 0; i < str2.length(); i++){
            ans += str2.charAt(i);
            if(str1.contains(ans+ans)){
                return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.println(gcd(str1,str2));
    }
}