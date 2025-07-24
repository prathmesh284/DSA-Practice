// 14. Check if One String Swap Can Make Strings Equal

class Solution {
    static boolean canStringMayEqual(String s1, String s2){

        int count = 0;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
            }
        }

        return count <= 2;
    }
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb" ;
        System.out.println(canStringMayEqual(s1,s2));
    }
}