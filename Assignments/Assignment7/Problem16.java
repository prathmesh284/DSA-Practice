//Buddy Strings

class Solution{
    static boolean buddyString(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        else if (s1.equals(s2)) return true;

        for(int i = 0; i < s2.length()-1 ; i++){
            for(int j = i+1 ; j < s2.length() ; j++){
                StringBuilder sb = new StringBuilder(s2);
                char temp2 = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp2);
                if(s1.equals(sb.toString())) return true;
            }
        }

        return false;
    }
    public static void main(String[] args){
        String s1 = "bank";
        String s2 = "abkn";
        System.out.println(buddyString(s1,s2));
    }
}