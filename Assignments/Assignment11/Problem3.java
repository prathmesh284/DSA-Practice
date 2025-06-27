//3.Parenthesis Depth Counter

class Solution {

    static int parenthesisDepthCounter(String str) {
        int max = 0, counter = 0;
        for (char ch : str.toCharArray()) {
            if(ch == '('){
                counter++;
            }else if(ch == ')'){
                max = Math.max(max,counter);
                counter--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(parenthesisDepthCounter("((a+((b)))+(c+d))"));
    }
}
