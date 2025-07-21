// 10. Determine if String Halves Are Alike

class Solution {
    static boolean halvesAreAlike(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(i < str.length()/2 && (str.charAt(i) == 'a' ||str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')){
                count++;
            }else if(i >= str.length()/2 && (str.charAt(i) == 'a' ||str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')){
                count--;
            }
        }
        return count == 0;
    }
    public static void main(String[] args) {
        String s = "textbook";
        System.out.println(halvesAreAlike(s));
    }
}