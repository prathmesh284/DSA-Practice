// 16. Buddy Strings


class Solution {
    static boolean buddyStr(String s1, String s2){
        if(s1.equals(s2)) return true;
        int count = 0;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
            }
        }

        return count == 2;
    }
    public static void main(String[] args) {
        String s1 = "aa", s2 = "aa" ;
        System.out.println(buddyStr(s1,s2));
    }
}