// 6. Expression Simplifier
import java.util.Stack;
class Solution {
    static String expressionSimplifier(String str){
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }else if (ch == ')') {
                st.pop();
            }else{
                int signIndicator = st.size()%2;
                if(signIndicator == 1){
                    if(ch == '+') {
                        ch = '-';
                    }else if(ch == '-'){
                        ch = '+';
                    }
                }
                ans = ans + ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(expressionSimplifier("a-(b+c-(d+e))-f"));
    }
}