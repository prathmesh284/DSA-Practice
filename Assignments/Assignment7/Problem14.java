// Check if One String Swap Can Make Strings Equal

class Solution{
    static boolean swapString(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        else if (s1.equals(s2)) return true;

        for(int i = 0; i < s2.length() ; i++){
            StringBuilder sb = new StringBuilder(s2);
            char temp2 = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - 1 - i));
            sb.setCharAt(sb.length() - 1 - i, temp2);
            if(s1.equals(sb.toString())) return true;
        }

        return false;
    }
    public static void main(String[] args){
        String s1 = "bank";
        String s2 = "bnak";
        System.out.println(swapString(s1,s2));
    }
}