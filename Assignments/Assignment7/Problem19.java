// Second Largest Digit in a String

class Solution {
    static int secondLarge(String s){
        int max = -1,secondMax = -1;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) >= '0' && s.charAt(i)<= '9'){
                if(s.charAt(i) > max){
                    secondMax = max;
                    max = Math.max(s.charAt(i)-49,max);
                    // System.out.println(secondMax);
                }else if(s.charAt(i)< max && s.charAt(i) > secondMax){
                    secondMax = Math.max(secondMax, s.charAt(i)-49);
                    // System.out.println(secondMax);
                }
            }
        }
        if(secondMax == 0) return -1;
        else return secondMax;
    }
    public static void main(String[] args){
        String s = "dfa12321afd";
        System.out.println(secondLarge(s));
    }
}