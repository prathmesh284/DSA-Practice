// 19. Second Largest Digit in a String

class Solution {
    static int secondLargestDigit(String s){
        int larget = 0,secondLarget = 0;

        for(int i=0; i < s.length(); i++){
            if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <= 9){
                if(s.charAt(i)-'0' > larget){
                    secondLarget = larget;
                    larget = s.charAt(i)-'0';
                }else if(s.charAt(i)-'0' < larget && s.charAt(i)-'0' > secondLarget){
                    secondLarget = s.charAt(i)-'0';
                }
            }
        }
        return secondLarget;
    }
    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(secondLargestDigit(s));
    }
}