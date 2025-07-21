// 13. Delete Characters to Make Fancy String

class Solution {
    static String deleteFancyEle(String s){
        String str = ""+s.charAt(0);
        int count = 1;
        for(int i = 1;i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                if(count < 2){
                    count++;
                    str = str.concat(""+s.charAt(i));
                }else{
                    continue;
                }
            }else{
                count = 1;
                str = str.concat(""+s.charAt(i));
            }
        }
        return str;
    }
    public static void main(String[] args){
        String s = "leeetcode";
        System.out.println(deleteFancyEle(s));
    }
}